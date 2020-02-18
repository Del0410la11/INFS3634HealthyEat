package unsw.Infs3634.HealthyEat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        appBarTxt.setText("Healthy Eat");

        Button buttonContent = findViewById(R.id.button3);
        Button buttonVideos = findViewById(R.id.button4);
        Button buttonQuiz = findViewById(R.id.button5);


        buttonContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, RecipeActivity.class);
                startActivity(intent);
            }
        });

        buttonVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });

        buttonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, QuizSelectionActivity.class);
                startActivity(intent);
            }
        });


    }




}
