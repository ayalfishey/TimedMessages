package com.ayalfishey.timedmessages.classes.data;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class StethoStarter extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
