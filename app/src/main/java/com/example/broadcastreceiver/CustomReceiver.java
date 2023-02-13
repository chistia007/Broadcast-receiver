package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    TextView tv;
    public CustomReceiver(TextView receivedCustomText) {
        this.tv=receivedCustomText;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (intent.getAction().equals("com.example.MY_CUSTOM_ACTION")) {

            tv.setText("Broadcast Received");
            Toast.makeText(context, "aaaaaaaaaaaaa", Toast.LENGTH_SHORT).show();
        }
//        if (CustomManager.ACTION_CUSTOM_BROADCAST.equals(action)) {
//            Toast.makeText(context, "lll", Toast.LENGTH_SHORT).show();
//            tv.setText("1111111111");
//        }
    }
}
