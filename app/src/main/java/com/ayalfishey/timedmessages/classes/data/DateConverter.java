package com.ayalfishey.timedmessages.classes.data;


import androidx.room.TypeConverter;

import java.util.Date;

public class DateConverter {

    @TypeConverter
    public static long dateToLong(Date date){
        return date.getTime();
    }

    @TypeConverter
    public static Date longToDate(long date){
        return new Date(date);
    }
}
