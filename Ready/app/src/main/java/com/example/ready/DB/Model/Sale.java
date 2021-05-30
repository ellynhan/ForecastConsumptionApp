package com.example.ready.DB.Model;

import android.provider.BaseColumns;

public class Sale {
    public static final String TABLE_NAME = "sales";
    public static final String MENU_ID = "menu_id";
    public static final String QTY = "qty";
    public static final String WEATHER = "weather";
    public static final String DATE = "date";
    public static final String TIME = "time";
    public static final String HOLIDAY = "holiday";

//    public int _id;
    public int menu_id;
    public int qty;
    public int weather;
    public String date;
    public Boolean time;
    public Boolean holiday;


    public Sale() {}

    public Sale(int menu_id, int qty, String date, Boolean time) {
        this.menu_id = menu_id;
        this.qty = qty;
        this.date = date;
        this.time = time;
    }

//    public Sale(
//            int menu_id,
//            int qty,
//            int weather,
//            String date,
//            Boolean time,
//            Boolean holiday)
//    {
//        this.menu_id = menu_id;
//        this.qty = qty;
//        this.weather = weather;
//        this.date = date;
//        this.time = time;
//        this.holiday = holiday;
//    }


    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                    + MENU_ID + " INTEGER NOT NULL,"
                    + QTY + " INTEGER NOT NULL,"
                    + WEATHER + " INTEGER,"
                    + DATE + " TEXT NOT NULL,"
                    + TIME + " INTEGER NOT NULL,"
                    + HOLIDAY + " INTEGER NOT NULL"
                    + ")";

    public static final String DROP_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

//    public void setId(int _id) { this._id = _id; }
    public void setMenuId(int menu_id) { this.menu_id = menu_id; }
    public void setSaleQty(int qty) { this.qty = qty; }
//    public void setSaleWeather(int weather) { this.weather = weather; }
    public void setSaleDate(String date) { this.date = date; }
    public void setSaleTime(Boolean time) { this.time = time; }
    public void setSaleHoliday(Boolean holiday) { this.holiday = holiday; }
}