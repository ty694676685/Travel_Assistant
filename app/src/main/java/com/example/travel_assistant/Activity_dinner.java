package com.example.travel_assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity_dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        ((TextView)findViewById(R.id.textView_city5)).setText(Data.city_name);
        show();
    }
    public void BTN_dinner_1(View view){
        Data.num = 1;
        startActivity(new Intent(Activity_dinner.this,Activity_introduction.class));
    }
    public void BTN_dinner_2(View view){
        Data.num = 2;
        startActivity(new Intent(Activity_dinner.this,Activity_introduction.class));
    }
    public void BTN_dinner_3(View view){
        Data.num = 3;
        startActivity(new Intent(Activity_dinner.this,Activity_introduction.class));
    }
    public void BTN_dinner_4(View view){
        Data.num = 4;
        startActivity(new Intent(Activity_dinner.this,Activity_introduction.class));
    }

    public void show(){
        switch(Data.city_name){
            case("Beijing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.beijing_dinner_kaoya);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.beijing_dinner_shuanyangrou);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.beijing_dinner_jingjiangrousi);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.beijing_dinner_luzhuhuoshao);
            }break;
            case("Chongqing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.chongqing_dinner_hotpot);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.chongqing_dinner_grilledfish);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.chongqing_dinner_maoxuewang);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.chongqing_dinner_pepperychicken);
            }break;
            case("Shanxi"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.shanxi_dinner_huluji);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.shanxi_dinner_fenzhengrou);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.shanxi_dinner_saozimian);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.shanxi_dinner_youyusi);
            }break;
            case("Zhejiang"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.zhejiang_dinner_dongporou);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.zhejiang_dinner_xihuchuyu);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.zhejiang_dinner_meigancaikourou);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.zhejiang_dinner_xiaren);
            }break;
        }
    }
}
