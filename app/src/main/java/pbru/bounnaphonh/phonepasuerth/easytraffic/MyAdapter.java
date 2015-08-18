package pbru.bounnaphonh.phonepasuerth.easytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Phonepasuerth on 8/17/2015.
 */
public class MyAdapter extends BaseAdapter{
    //Explicit
    private Context objContext;
    private int[] trafficInts;
    private String[] trafficStrings;

    public MyAdapter(Context objContext, int[] trafficInts, String[] trafficStrings) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficStrings = trafficStrings;
    }//Constructor

    @Override
    public int getCount() {
        return trafficStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater =  objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflaster.inflate(R.layout.my_listview, viewGroup, false);
        //Show Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imvShownIcon);
        iconImageView.setBackgroundResource(trafficInts[i]);
        //Show title
        TextView titleTextView = (TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(trafficStrings[i]);

        return view1;
    }
}//  Main Class