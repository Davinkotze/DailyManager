package dev.collateraldamage.dailymanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Davin on 2017/06/04.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "DayCounter";
    private static final String TABLE_DAYCOUNTER = "DayCounterEntries";

    private static final String KEY_ID = "ID";
    private static final String KEY_TITLE = "Title";
    private static final String KEY_DATE = "StartDate";
    private static final String IMAGE = "BGImage";

    public DatabaseHandler (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
