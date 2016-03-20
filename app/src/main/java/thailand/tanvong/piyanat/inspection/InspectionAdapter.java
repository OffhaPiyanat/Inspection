package thailand.tanvong.piyanat.inspection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by OFFHA on 20/3/2559.
 */
public class InspectionAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private String[] titleStrings, dateStrings, operatorStrings;
    private int[] iconInts;

    public InspectionAdapter(Context context,
                             String[] titleStrings,
                             String[] dateStrings,
                             String[] operatorStrings,
                             int[] iconInts) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.dateStrings = dateStrings;
        this.operatorStrings = operatorStrings;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.inspec_listview, viewGroup, false);

        //For title
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView5);
        titleTextView.setText(titleStrings[i]);

        //For Date
        TextView dateTextView = (TextView) view1.findViewById(R.id.textView6);
        dateTextView.setText(dateStrings[i]);

        //For Operator
        TextView operatorTextView = (TextView) view1.findViewById(R.id.textView7);
        operatorTextView.setText(operatorStrings[i]);

        //For Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView4);
        iconImageView.setImageResource(iconInts[i]);

        return view1;
    }
}   // Main Class
