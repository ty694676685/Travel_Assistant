package com.example.travel_assistant;

import android.content.Intent;
import android.renderscript.Element;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity_entertainment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
        ((TextView)findViewById(R.id.textView_city4)).setText(Data.city_name);
        show();
    }
    public void BTN_entertainment_1(View view){
        Data.num = 1;
        startActivity(new Intent(Activity_entertainment.this,Activity_introduction.class));
    }
    public void BTN_entertainment_2(View view){
        Data.num = 2;
        startActivity(new Intent(Activity_entertainment.this,Activity_introduction.class));
    }
    public void BTN_entertainment_3(View view){
        Data.num = 3;
        startActivity(new Intent(Activity_entertainment.this,Activity_introduction.class));
    }
    public void BTN_entertainment_4(View view){
        Data.num = 4;
        startActivity(new Intent(Activity_entertainment.this,Activity_introduction.class));
    }

    public void show(){
        switch(Data.city_name){
            case("Beijing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.beijing_entertainment_beihaigongyuan);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.beijing_entertainment_dongwuyuan);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.beijing_entertainment_haiyangguan);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.beijing_entertainment_huanlegu);
            }break;
            case("Chongqing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.chongqing_entertainment_huashengyuan);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.chongqing_entertainment_shuimofang);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.chongqing_entertainment_kejiguan);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.chongqing_entertainment_shuimofang);
            }break;
            case("Shanxi"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.shanxi_entertainment_dongwuyuan);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.shanxi_entertainment_lehuahuanleshijie);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.shanxi_entertainment_qujianghaiyangshijie);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.shanxi_entertainment_datangfurongyuan);
            }break;
            case("Zhejiang"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.zhejiang_entertainment_huangchengshatan);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.zhejiang_entertainment_fangtedongfangshenhua);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.zhejiang_entertainment_anjihellokitty);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.zhejiang_entertainment_luomenghuanqiuleyuan);
            }break;
        }
    }
}
