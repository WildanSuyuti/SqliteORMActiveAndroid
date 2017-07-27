package com.example.kakaroto.sqliteormdemo;

import android.app.Application;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

/**
 * Created by kakaroto on 27/07/17.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Configuration.Builder confiBuilder = new Configuration.Builder(this);
        confiBuilder.addModelClass(Makanan.class);
        ActiveAndroid.initialize(this);
    }
}
