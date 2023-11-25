package com.fongmi.android.tv.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.fongmi.android.tv.ui.activity.HomeActivity;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //DLNARendererService.Companion.start(App.get(), R.drawable.ic_logo);
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent startAppIntent = new Intent(context, HomeActivity.class);
            startAppIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(startAppIntent);
        }
    }
}
