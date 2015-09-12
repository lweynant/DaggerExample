package com.lweynant.daggerexample;

/**
 * Created by lweynant on 12/09/15.
 */
public class NetworkApi {

    public boolean validateUser (String username, String password){
        if (username == null || username.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }
}
