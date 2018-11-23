//content observer class to monitor any changes in the content of the whatsapp folder in phone system

package com.meghna.appfirst;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MyContentObserver extends ContentObserver {
    MyService myService = new MyService();
    int days=0;
    private long FINAL_IMAGE_AGE=0L;
    private Context context;
    ArrayList<String> arrayList =new ArrayList<>();
    private static long initial_time_when_created=0;
    public MyContentObserver(Handler handler) {

        super(handler);
    }
    public MyContentObserver(Handler handler, Context context) {
        super(handler);
        this.context = context;
    }
    @Override
    public void onChange(boolean selfChange) {
        if(initial_time_when_created==0)
            initial_time_when_created=System.currentTimeMillis();  //getting initial time when app content observer first fired
        Log.v("initial time content observer created =",""+initial_time_when_created);
        super.onChange(selfChange);
    }
    @Override
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);
        if(initial_time_when_created==0)
            initial_time_when_created=System.currentTimeMillis();

        if (!selfChange) {
            try {
                if (ActivityCompat.checkSelfPermission(context,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE)     //if permission is granted to delete
                        == PackageManager.PERMISSION_GRANTED) {
                    getImage(uri);          //calling the method that gets those images deleted
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void getImage(Uri uri) {
        final String name = "'%-WA%'";          //selecting only whatsapp photos using name of the photo
        //String path = "/storage/emulated/0/Download/";
        // Uri whatsappuri=Uri.fromFile(new File(path));
       Uri imageUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;     //path of media of phone
        String[] projection = {MediaStore.Images.Media.DISPLAY_NAME,MediaStore.Images.Media.DATA,MediaStore.Images.Media.DATE_TAKEN};
        String selection1 = MediaStore.Images.Media.DISPLAY_NAME;
        String[] selectionArgs = {name};
        String sortOrder = "";
        days =myService.days;
        FINAL_IMAGE_AGE=(long)days*84600000L;
        Log.v("days in content observer",""+days);
        String selection2= MediaStore.Images.Media.DATE_TAKEN;
        Log.v("FINAL_AGE IN LONG = ",""+FINAL_IMAGE_AGE);

        //for selecting only whatsapp photos and only those that were taken after the app was downloaded
        String finalSelection = selection1+" LIKE "+name+" AND "+selection2+" > "+initial_time_when_created;

        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = contentResolver.query(imageUri,projection,finalSelection,null, sortOrder);

        if(cursor != null && cursor.moveToFirst()){
            int imageTitle = cursor.getColumnIndex(MediaStore.Images.Media.DISPLAY_NAME);
            int imagePath = cursor.getColumnIndex(MediaStore.Images.Media.DATA);
            int imageDateCreated = cursor.getColumnIndex(MediaStore.Images.Media.DATE_TAKEN);


            do {
                String currentTitle = cursor.getString(imageTitle);
                long dateLong = cursor.getLong(imageDateCreated);   //getting date of photo
                //long FINAL_IMAGE_AGE =300000L;                 //15 days in miliseconds (the time after which photo is deleted)
                long systemTime= System.currentTimeMillis();
                Date d = new Date(dateLong);
                SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy h:mmaa");
                String currentDate = formatter.format(d);
                String currentPath = cursor.getString(imagePath);

                if(dateLong+FINAL_IMAGE_AGE<systemTime){    //when the image is older than 15 days
                    contentResolver.delete(imageUri,
                            MediaStore.Images.ImageColumns.DATA + "=?" , new String[]{ currentPath });
                    arrayList.add(currentTitle + "\n"+currentPath+" "+currentDate);//for developer use to check the images getting deleted
                    Log.v("MyContentOBSERVER","arraylist = "+currentTitle);//for developer use
                }

            } while (cursor.moveToNext());
        }
    }
}
