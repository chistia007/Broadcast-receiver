package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;

import com.example.broadcastreceiver.databinding.ActivityCustomBroadcastReceiverBinding;

public class CustomBroadcastReceiver extends AppCompatActivity {
    ActivityCustomBroadcastReceiverBinding binding;
    CustomReceiver customReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCustomBroadcastReceiverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.example.MY_CUSTOM_ACTION");
        registerReceiver(new CustomReceiver(binding.receivedCustomText), intentFilter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(customReceiver);
    }
}