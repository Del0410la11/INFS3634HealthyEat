package unsw.Infs3634.HealthyEat;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class QuizSelectionAdapter extends ArrayAdapter {


    private final Activity context;
    private final String[] topicHeadingLevelOneArray;
    private final String[] topicHeadingLevelTwoArray;



    public QuizSelectionAdapter(Activity context, String[] topicHeadingLevelOneArray, String[] topicHeadingLevelTwoArray) {

        super(context, R.layout.activity_listview_selection_item, topicHeadingLevelOneArray);

        this.context = context;
        this.topicHeadingLevelOneArray = topicHeadingLevelOneArray;
        this.topicHeadingLevelTwoArray = topicHeadingLevelTwoArray;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_listview_selection_item, null,true);
        TextView topicTV = (TextView) rowView.findViewById(R.id.tv_selection_topic);
        TextView line2TV = (TextView) rowView.findViewById(R.id.tv_selection_details);
        topicTV.setText(topicHeadingLevelOneArray[position]);
        line2TV.setText(topicHeadingLevelTwoArray[position]);

        return rowView;
    };
}
