package com.futrue.page.follower;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    private SharedPreferences sharedPreferences;

    public SharedPreferencesManager(Context context, String name, int mode){
        sharedPreferences = context.getSharedPreferences(name, mode);
    }

    public void put(String name, String content){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(name, content);
        editor.commit();
    }

    public void put(String name, boolean content){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(name, content);
        editor.commit();
    }


    public void put(String name, int content){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(name, content);
        editor.commit();
    }

    public String get(String name, String defValue){
        return sharedPreferences.getString("name",defValue);
    }

    public boolean get(String name, boolean defValue){
        return sharedPreferences.getBoolean("name", defValue);
    }

}
