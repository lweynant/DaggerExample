package com.lweynant.daggerexample.modules;

import com.lweynant.daggerexample.NetworkApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lweynant on 12/09/15.
 */
@Module
public class NetworkApiModule {

    @Singleton
    @Provides
    public NetworkApi provideNetworkApi(){
        return new NetworkApi();
    }
}
