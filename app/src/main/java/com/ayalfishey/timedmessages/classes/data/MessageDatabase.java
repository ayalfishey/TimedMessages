package com.ayalfishey.timedmessages.classes.data;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.ayalfishey.timedmessages.classes.TimedMessage;

@Database(entities = {TimedMessage.class}, version = 1, exportSchema = false)
public abstract class MessageDatabase extends RoomDatabase {
    private static MessageDatabase singleton = null;
    private MessageDatabase() {
    }

    public abstract MessageDao messageDao ();

    public static MessageDatabase getInstance(){
        if (singleton == null){
            singleton = new MessageDatabase() {
                @Override
                public MessageDao messageDao() {
                    return null;
                }

                @NonNull
                @Override
                protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
                    return null;
                }

                @NonNull
                @Override
                protected InvalidationTracker createInvalidationTracker() {
                    return null;
                }

                @Override
                public void clearAllTables() {

                }
            };
        }
        return singleton;
    }
}
