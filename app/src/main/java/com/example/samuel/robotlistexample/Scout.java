package com.example.samuel.robotlistexample;

/*
I don't know what this is, but I need it whenever I make an application, it probably should be part of your application already,
if not, it probably isn't necessary and I put this here for no reason
 */

import android.app.Application;

public class Scout extends Application {
    public static Data botData = new Data();
    public static Scout singleton;
    public static Scout getInstance() {return singleton;}

    @Override
    public void onCreate(){
        super.onCreate();
        singleton= this;
    }
}
