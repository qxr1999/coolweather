package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author 作者 乔玺润:
 * @version 创建时间：2018-9-20 下午2:22:24 类说明
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		//省表
		db.execSQL("create table Province (" +
				"id integer primary key autoincrement," +
				"province_name text," +
				"province_code text)");
		//市表
		db.execSQL("create table City (" +
				"id integer primary key autoincrement," +
				"city_name text," +
				"city_code text," +
				"province_id integer)");
		//县表
		db.execSQL("create table County  (" +
				"id integer primary key autoincrement," +
				"county_name text," +
				"county_code text," +
				"city_id integer)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
