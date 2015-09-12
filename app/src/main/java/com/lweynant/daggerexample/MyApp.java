package com.lweynant.daggerexample;

import android.app.Application;

import com.lweynant.daggerexample.components.DaggerDiComponent;
import com.lweynant.daggerexample.components.DiComponent;

/**
 * Created by lweynant on 12/09/15.
 */
public class MyApp extends Application{
    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent(){
        return component;
    }
}
