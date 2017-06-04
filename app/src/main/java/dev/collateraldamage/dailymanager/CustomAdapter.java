package dev.collateraldamage.dailymanager;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.data;


public class CustomAdapter extends ArrayAdapter<DayCounter> {

    private Context mContext;
    private List<DayCounter> dataItems;

    public CustomAdapter(Context context, int resource, ArrayList<DayCounter> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.dataItems = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        DayCounter dayCounter = dataItems.get(position);

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item, null);

        TextView title = (TextView) view.findViewById(R.id.title);
        TextView startDate = (TextView) view.findViewById(R.id.startDate);
        TextView days = (TextView) view.findViewById(R.id.dayCount);

        title.setText(String.valueOf(dayCounter.getTitle()));
        startDate.setText(String.valueOf(dayCounter.getStartDate()));
        days.setText(String.valueOf(dayCounter.getDays()));

        return view;
    }
}

