package com.meghna.appfirst;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    private int days;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        radioGroup = findViewById(R.id.radioGroup);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);
                String text = radioButton.getText().toString();
                Toast.makeText(getApplicationContext(),""+radioButton.getText()+" is applied",Toast.LENGTH_LONG).show();
                if(text.equals("10 Days")){
                    days =10;
                    Log.v("time","10 day");
                }
                else if (text.equals("15 Days")){
                    days= 15;
                    Log.v(" time","15 days");
                }
                else {
                    days =30;
                    Log.v("time","30 days");
                }
                startService();
            }
        });

    }

    public  void checkbutton(View view){
        int radioId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);
        Toast.makeText(this,"selected "+radioButton.getText(),Toast.LENGTH_LONG).show();
    }
    //method for creating intent for a start service
    public void startService(){
        Intent intent = new Intent(this,MyService.class);
        Log.v("final days selected by user in second activity",""+days);
        intent.putExtra("DAYS",days);
        startService(intent);

    }


}
