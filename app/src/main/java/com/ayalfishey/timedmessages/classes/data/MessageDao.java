package com.ayalfishey.timedmessages.classes.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.ayalfishey.timedmessages.classes.TimedMessage;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface MessageDao {

    @Query("SELECT * FROM timedmessages")
    List<TimedMessage> getAll();

    @Insert(onConflict = REPLACE)
    void insert(TimedMessage timedMessage);
}
