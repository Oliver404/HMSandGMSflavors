package com.oliverbotello.flavorsexample.services;

import android.os.Bundle;
import android.util.Log;

import com.huawei.hms.push.HmsMessageService;

public class MyHuaweiMessagingService extends HmsMessageService {
    @Override
    public void onNewToken(String token, Bundle bundle) {
        super.onNewToken(token);
        Log.e("TokenHMS", "Refreshed token: " + token);
    }
}
