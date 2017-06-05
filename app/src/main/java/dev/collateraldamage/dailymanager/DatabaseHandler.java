package dev.collateraldamage.dailymanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
        String CREATE_DAYS_TABLE = "CREATE TABLE " + TABLE_DAYCOUNTER + " (" + KEY_ID + " INTEGER PRIMARY KEY, "
                + KEY_TITLE + " TEXT, " + KEY_DATE + " TEXT" + ")";
        db.execSQL(CREATE_DAYS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DAYCOUNTER);
        onCreate(db);
    }

    public void addRecord(DayCounter dayCounter) {
        SQLiteDatabase db = this.getWritableDatabase();

    }
}
