package com.ayalfishey.timedmessages.classes.data;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.ayalfishey.timedmessages.classes.TimedMessage;

@Database(entities = {TimedMessage.class}, version = 1  , exportSchema = false)
public abstract class MessageDatabase extends RoomDatabase {

    private static MessageDatabase singleton = null;

    public abstract MessageDao getMessageDao ();

    public static synchronized MessageDatabase getInstance(){
        if (singleton == null){
            singleton = Room.databaseBuilder(StethoStarter.getContext(), MessageDatabase.class, "MessageDB")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return singleton;
    }
}
