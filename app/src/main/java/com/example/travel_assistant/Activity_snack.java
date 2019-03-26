package com.example.travel_assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity_snack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
        ((TextView)findViewById(R.id.textView_city6)).setText(Data.city_name);
        show();
    }
    public void BTN_snack_1(View view){
        Data.num = 1;
        startActivity(new Intent(Activity_snack.this,Activity_introduction.class));
    }
    public void BTN_snack_2(View view){
        Data.num = 2;
        startActivity(new Intent(Activity_snack.this,Activity_introduction.class));
    }
    public void BTN_snack_3(View view){
        Data.num = 3;
        startActivity(new Intent(Activity_snack.this,Activity_introduction.class));
    }
    public void BTN_snack_4(View view){
        Data.num = 4;
        startActivity(new Intent(Activity_snack.this,Activity_introduction.class));
    }

    public void show(){
        switch(Data.city_name){
            case("Beijing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.beijing_snack_zhajiangmian);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.beijing_snack_lvdagun);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.beijing_snack_douzhi);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.beijing_snack_choudoufu);
            }break;
            case("Chongqing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.chongqing_snack_noodle);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.chongqing_snack_suanlafen);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.chongqing_snack_sweetdumplings);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.chongqing_snack_chenmahua);
            }break;
            case("Shanxi"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.shanxi_snack_roujiamo);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.shanxi_snack_yangroupaomo);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.shanxi_snack_hulatang);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.shanxi_snack_liangpi);
            }break;
            case("Zhejiang"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.zhejiang_snack_zongzi);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.zhejiang_snack_suyoubing);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.zhejiang_snack_longjingchasu);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.zhejiang_snack_pianchuan);
            }break;
        }
    }
}
