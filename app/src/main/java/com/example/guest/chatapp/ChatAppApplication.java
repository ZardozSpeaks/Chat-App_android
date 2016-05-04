package com.example.guest.chatapp;

import android.app.Application;

import com.firebase.client.Firebase;

public class ChatAppApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
