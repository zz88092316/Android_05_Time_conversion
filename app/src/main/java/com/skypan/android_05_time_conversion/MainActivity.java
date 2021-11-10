package com.skypan.android_05_time_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText year,month,day,hour,min,sec;
    private TextView yeartext,boudoir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        year = (EditText)findViewById(R.id.year);
        month = (EditText)findViewById(R.id.month);
        day = (EditText)findViewById(R.id.day);
        hour = (EditText)findViewById(R.id.hour);
        min = (EditText)findViewById(R.id.min);
        sec = (EditText)findViewById(R.id.sec);
        yeartext = (TextView)findViewById(R.id.yeartext);
        boudoir = (TextView)findViewById(R.id.boudoir);
    }

    public void show(View view) {
        String Year = year.getEditableText().toString();
        String Month = month.getEditableText().toString();
        String Day = day.getEditableText().toString();
        String Hour = hour.getEditableText().toString();
        String Min = min.getEditableText().toString();
        String Sec = sec.getEditableText().toString();
        yeartext.setText(Year+"/"+Month+"/"+Day+" "+Hour+":"+Min+":"+Sec);
        if((Integer.parseInt(Year)%4==0)&&(Integer.parseInt(Year)%100!=0)){
            boudoir.setText("閨年：是");
        }
        else if(Integer.parseInt(Year)%400==0){
            boudoir.setText("閨年：是");
        }
        else{
            boudoir.setText("閨年：不是");
        }
    }
}