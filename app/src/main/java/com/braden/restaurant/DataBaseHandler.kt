package com.braden.restaurant

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val DATABASE_NAME = "RestaurantDB"
val TABLE_NAME1 = "RandomPlaces"
val TABLE_NAME2 = "Favorites"
val TABLE_NAME3 = "RecentlyViewed"
val COL_NAME = "name"
val COL_STARS = "stars"
val COL_TYPE = "type"
val COL_ADDRESS = "address"

class DataBaseHandler(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME,null,1){
    override fun onCreate(db: SQLiteDatabase?) {

        val createTable = "CREATE TABLE " + TABLE_NAME1 + " (" +
                COL_NAME + " PRIMARY KEY," +
                COL_STARS + " TEXT," +
                COL_TYPE+ " TEXT," +
                COL_ADDRESS + " TEXT)"
        db?.execSQL(createTable)
        val createTable2 = "CREATE TABLE " + TABLE_NAME2 + " (" +
                COL_NAME + " PRIMARY KEY," +
                COL_STARS + " TEXT," +
                COL_TYPE+ " TEXT," +
                COL_ADDRESS + " TEXT)"
        db?.execSQL(createTable2)
        val createTable3 = "CREATE TABLE " + TABLE_NAME3 + " (" +
                COL_NAME + " PRIMARY KEY," +
                COL_STARS + " TEXT," +
                COL_TYPE+ " TEXT," +
                COL_ADDRESS + " TEXT)"
        db?.execSQL(createTable3)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun insertData(restaurant: Restaurant){
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(COL_NAME, restaurant.name)
        cv.put(COL_STARS, restaurant.name)
        cv.put(COL_TYPE, restaurant.type)
        cv.put(COL_ADDRESS, restaurant.address)
        var result = db.insert(TABLE_NAME1, null,cv)
        if (result == -1.toLong())
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }

    fun readData() : MutableList<Restaurant>{
        var list: MutableList<Restaurant> = ArrayList()

        val db = this.readableDatabase
        val query= "select * from $TABLE_NAME1"
        val result = db.rawQuery(query, null)
        if(result.moveToFirst()){
            do{
                var restaurant = Restaurant()
                restaurant.name = result.getString(0)
                restaurant.star = result.getString(1)
                restaurant.type = result.getString(2)
                restaurant.address = result.getString(3)
                list.add(restaurant)
            } while (result.moveToNext())
        }

        return list
    }

}