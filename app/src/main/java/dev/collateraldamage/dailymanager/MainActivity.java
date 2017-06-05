package dev.collateraldamage.dailymanager;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ArrayList<DayCounter> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.float_action_button);

        data.add(new DayCounter("CLA", "2017-05-29", "6"));
        data.add(new DayCounter("Development", "2017-06-03", "2"));
        data.add(new DayCounter("Stop Clen", "2017-06-04", "0"));

        ArrayAdapter<DayCounter> adapter = new CustomAdapter(this, 0, data);

        ListView listView = (ListView) findViewById(R.id.itemListView);
        listView.setAdapter(adapter);
    }
}
