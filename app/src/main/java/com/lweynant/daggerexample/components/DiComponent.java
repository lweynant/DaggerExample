package com.lweynant.daggerexample.components;

import com.lweynant.daggerexample.MainActivity;
import com.lweynant.daggerexample.NetworkApi;
import com.lweynant.daggerexample.modules.NetworkApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lweynant on 12/09/15.
 */
@Singleton
@Component(modules = {NetworkApiModule.class})
public interface DiComponent {
    void inject(MainActivity mainActivity);
}
