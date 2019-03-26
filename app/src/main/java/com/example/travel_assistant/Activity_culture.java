package com.example.travel_assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_culture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);
        ((TextView)findViewById(R.id.textView_city2)).setText(Data.city_name);
        show();
    }
    public void BTN_culture_1(View view){
        Data.num = 1;
        startActivity(new Intent(Activity_culture.this,Activity_introduction.class));
    }
    public void BTN_culture_2(View view){
        Data.num = 2;
        startActivity(new Intent(Activity_culture.this,Activity_introduction.class));
    }
    public void BTN_culture_3(View view){
        Data.num = 3;
        startActivity(new Intent(Activity_culture.this,Activity_introduction.class));
    }
    public void BTN_culture_4(View view){
        Data.num = 4;
        startActivity(new Intent(Activity_culture.this,Activity_introduction.class));
    }
    public void BTN_culture_5(View view){
        Data.num = 5;
        startActivity(new Intent(Activity_culture.this,Activity_introduction.class));
    }
    public void BTN_culture_6(View view){
        Data.num = 6;
        startActivity(new Intent(Activity_culture.this,Activity_introduction.class));
    }

    public void show(){
        switch(Data.city_name){
            case("Beijing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.beijing_culture_gugong);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.beijing_culture_changcheng);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.beijing_culture_tiantan);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.beijing_culture_mingshisanling);
                ImageButton imagebutton5 =(ImageButton) findViewById(R.id.imageButton5);
                imagebutton5.setImageResource(R.drawable.beijing_culture_yiheyuan);
                ImageButton imagebutton6 =(ImageButton) findViewById(R.id.imageButton6);
                imagebutton6.setImageResource(R.drawable.beijing_culture_zhoukoudian);
            }break;
            case("Chongqing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.chongqing_culture_ciqikou);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.chongqing_culture_hongyadong);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.chongqing_culture_jiefangbei);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.chongqing_culture_baidicheng);
                ImageButton imagebutton5 =(ImageButton) findViewById(R.id.imageButton5);
                imagebutton5.setImageResource(R.drawable.chongqing_culture_dazushike);
                ImageButton imagebutton6 =(ImageButton) findViewById(R.id.imageButton6);
                imagebutton6.setImageResource(R.drawable.chongqing_culture_minguojie);
            }break;
            case("Shanxi"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.shanxi_culture_chengqiang);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.shanxi_culture_bingmayong);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.shanxi_culture_huaqinggong);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.shanxi_culture_dayanta);
                ImageButton imagebutton5 =(ImageButton) findViewById(R.id.imageButton5);
                imagebutton5.setImageResource(R.drawable.shanxi_culture_zhonggulou);
                ImageButton imagebutton6 =(ImageButton) findViewById(R.id.imageButton6);
                imagebutton6.setImageResource(R.drawable.shanxi_culture_qianling);
            }break;
            case("Zhejiang"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.zhejiang_culture_wuzhen);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.zhejiang_culture_lingyinsi);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.zhejiang_culture_hengdianyingshicheng);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.zhejiang_culture_hefangjie);
                ImageButton imagebutton5 =(ImageButton) findViewById(R.id.imageButton5);
                imagebutton5.setImageResource(R.drawable.zhejiang_culture_shenyuan);
                ImageButton imagebutton6 =(ImageButton) findViewById(R.id.imageButton6);
                imagebutton6.setImageResource(R.drawable.zhejiang_culture_nanxunguzhen);
            }break;
        }
    }

}
