package com.oliverbotello.flavorsexample.services;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.e("TokenGMS", "Refreshed token: " + token);
    }
}
