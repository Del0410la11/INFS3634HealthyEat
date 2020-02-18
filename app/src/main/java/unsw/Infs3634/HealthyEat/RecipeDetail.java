package unsw.Infs3634.HealthyEat;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

public class RecipeDetail extends MainActivity implements YouTubePlayer.OnInitializedListener {

    TextView textView;
    TextView textView2;
    YouTubePlayer player2;
    YouTubePlayerFragment playerFragment;
    private static final String TAG = "Healthy Eat Recipe";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menudetailactivity);
        appBarTxt.setText(getIntent().getStringExtra("topic"));
        String savedExtra = getIntent().getStringExtra("topic");
        String savedExtra2 = getIntent().getStringExtra("content");
        textView = findViewById(R.id.title_TV);
        textView.setText(savedExtra);
        textView2 = findViewById(R.id.BlockText);
        textView2.setText(savedExtra2);
        textView2.setMovementMethod(new ScrollingMovementMethod());
        playerFragment = (YouTubePlayerFragment) getFragmentManager().findFragmentById(R.id.VideoFragment2);
        playerFragment.initialize("AIzaSyCKpiQ1Il2s-AgIe3441uiHA_xPMJP6wjU", this);

    }

    @Override
    public void onInitializationSuccess
            (YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {

        String savedExtra3 = getIntent().getStringExtra("videoid");
        player2 = youTubePlayer;
        player2.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
        youTubePlayer.cueVideo(savedExtra3);
    }

    @Override
    public void onInitializationFailure
            (YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {


    }

    @Override public void onBackPressed() {
        startActivity(new Intent(RecipeDetail.this, RecipeActivity.class));
        finish();
    }

}