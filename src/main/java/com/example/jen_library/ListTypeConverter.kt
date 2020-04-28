package com.example.jen_library

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

abstract class ListTypeConverter<ITEM> {
    @TypeConverter
    fun stringToList(value: String): MutableList<ITEM> {
        val listType = object : TypeToken<MutableList<ITEM>>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun listToString(list: List<ITEM>): String {
        val gson = Gson()
        return gson.toJson(list)
    }

}