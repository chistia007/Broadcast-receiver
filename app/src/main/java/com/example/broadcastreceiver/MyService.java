package com.example.broadcastreceiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Create and send your broadcast here
        Toast.makeText(this, "Broadcast Started", Toast.LENGTH_SHORT).show();
        Intent broadcastIntent = new Intent("com.example.MY_CUSTOM_ACTION");
        broadcastIntent.putExtra("message", "Hello, world!");
        sendBroadcast(broadcastIntent);

        // Return START_STICKY to indicate that the service should be restarted if it's killed
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // Return null since this service does not provide binding
        return null;
    }
}
