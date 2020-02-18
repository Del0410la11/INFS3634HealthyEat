package unsw.Infs3634.HealthyEat;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



public class RecipeAdapter extends ArrayAdapter {

    private static final String TAG = "RecipeAdapter";
    private final Activity context;
    private final String[] topicHeadingLevelOneArray;
    private final String[] topicHeadingLevelTwoArray;
    private final String[] topicContent;



    public RecipeAdapter(Activity context, String[] topicHeadingLevelOneArray, String[] topicHeadingLevelTwoArray,
                         String[] topicContent) {

        super(context, R.layout.activity_menulistviewrow, topicHeadingLevelOneArray);

        this.context = context;
        this.topicHeadingLevelOneArray = topicHeadingLevelOneArray;
        this.topicHeadingLevelTwoArray = topicHeadingLevelTwoArray;
        this.topicContent = topicContent;

        Log.d(TAG, "RecipeAdapter: ends");

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_menulistviewrow, null,true);


        TextView topicTV = (TextView) rowView.findViewById(R.id.topicTV);
        TextView line2TV = (TextView) rowView.findViewById(R.id.line2TV);


        topicTV.setText(topicHeadingLevelOneArray[position]);
        line2TV.setText(topicHeadingLevelTwoArray[position]);

        return rowView;

    }
}
