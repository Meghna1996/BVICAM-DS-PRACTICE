//Service class to implement the app to work in background even after the app has been closed

package com.meghna.appfirst;

import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Log;
import android.os.Process;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MyService extends Service {
    //Intent intent=getIntent();
    private Looper mServiceLooper;

    static int days=0;
    private ServiceHandler mServiceHandler;
    private static long initial_time_service =0L;
    private final class ServiceHandler extends Handler {
        public ServiceHandler(Looper looper) {
            super(looper);
        }
        @Override
        public void handleMessage(Message msg) {
            try {
                //Register contact observer
                registerObserver();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void registerObserver(){
        try{
           // String path= Environment.getExternalStorageDirectory().getAbsolutePath();
          // String path = "/storage/emulated/0/Download/";
           //Uri whatsappuri=Uri.parse(path);

            Uri imageUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            getApplication().getContentResolver().registerContentObserver(imageUri,true,new MyContentObserver(new Handler(),getApplicationContext()));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void onCreate() {

        HandlerThread thread = new HandlerThread("ServiceStartArguments",
                Process.THREAD_PRIORITY_BACKGROUND);
        thread.start();
        mServiceLooper=thread.getLooper();
        mServiceHandler=new ServiceHandler(mServiceLooper);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

            days=(int)intent.getExtras().get("DAYS");

        Log.v("TIME PASSED TO SERVICE FROM SECOND ACTIVITY ",""+days);
        Message msg = mServiceHandler.obtainMessage();
        msg.arg1 = startId;
        mServiceHandler.sendMessage(msg);
        if(initial_time_service==0)
            initial_time_service=System.currentTimeMillis();


        // If we get killed, after returning from here, restart
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public boolean stopService(Intent name) {
       // getApplication().getContentResolver().unregisterContentObserver(MyContentObserver(new Handler,getApplicationContext()));
       // getContentResolver().unregisterContentObserver(MyContentObserver());
        stopSelf();

        return super.stopService(name);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
