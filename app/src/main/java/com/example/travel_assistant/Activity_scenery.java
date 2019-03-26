package com.example.travel_assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity_scenery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenery);
        ((TextView)findViewById(R.id.textView_city3)).setText(Data.city_name);
        show();
    }
    public void BTN_scenery_1(View view){
        Data.num = 1;
        startActivity(new Intent(Activity_scenery.this,Activity_introduction.class));
    }
    public void BTN_scenery_2(View view){
        Data.num = 2;
        startActivity(new Intent(Activity_scenery.this,Activity_introduction.class));
    }
    public void BTN_scenery_3(View view){
        Data.num = 3;
        startActivity(new Intent(Activity_scenery.this,Activity_introduction.class));
    }
    public void BTN_scenery_4(View view){
        Data.num = 4;
        startActivity(new Intent(Activity_scenery.this,Activity_introduction.class));
    }
    public void BTN_scenery_5(View view){
        Data.num = 5;
        startActivity(new Intent(Activity_scenery.this,Activity_introduction.class));
    }

    public void show(){
        switch(Data.city_name){
            case("Beijing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.beijing_scenery_xiangshan);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.beijing_scenery_longqingxia);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.beijing_scenery_lingshan);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.beijing_scenery_shidu);
                ImageButton imagebutton5 =(ImageButton) findViewById(R.id.imageButton5);
                imagebutton5.setImageResource(R.drawable.beijing_scenery_heilongtan);
            }break;
            case("Chongqing"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.chongqing_scenery_sanxia);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.chongqing_scenery_xiannvshan);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.chongqing_scenery_changshouhu);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.chongqing_scenery_jinfoshan);
                ImageButton imagebutton5 =(ImageButton) findViewById(R.id.imageButton5);
                imagebutton5.setImageResource(R.drawable.chongqing_scenery_taohuayuan);
            }break;
            case("Shanxi"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.shanxi_scenery_huashan);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.shanxi_scenery_hukoupubu);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.shanxi_scenery_heihe);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.shanxi_scenery_lishan);
                ImageButton imagebutton5 =(ImageButton) findViewById(R.id.imageButton5);
                imagebutton5.setImageResource(R.drawable.shanxi_scenery_bolanggu);
            }break;
            case("Zhejiang"):{
                ImageButton imagebutton1 =(ImageButton) findViewById(R.id.imageButton1);
                imagebutton1.setImageResource(R.drawable.zhejiang_scenery_xihu);
                ImageButton imagebutton2 =(ImageButton) findViewById(R.id.imageButton2);
                imagebutton2.setImageResource(R.drawable.zhejiang_scenery_yandangshan);
                ImageButton imagebutton3 =(ImageButton) findViewById(R.id.imageButton3);
                imagebutton3.setImageResource(R.drawable.zhejiang_scenery_putuoshan);
                ImageButton imagebutton4 =(ImageButton) findViewById(R.id.imageButton4);
                imagebutton4.setImageResource(R.drawable.zhejiang_scenery_qiandaohu);
                ImageButton imagebutton5 =(ImageButton) findViewById(R.id.imageButton5);
                imagebutton5.setImageResource(R.drawable.zhejiang_scenery_shuanglongdong);
            }break;
        }
    }

}
