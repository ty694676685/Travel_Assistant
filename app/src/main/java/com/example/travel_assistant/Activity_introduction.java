package com.example.travel_assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.Switch;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Activity_introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        ((TextView)findViewById(R.id.textView_city7)).setText(Data.city_name);
        switch (Data.city_name){
            case("Beijing"): Choose_Beijing();break;
            case("Chongqing"):Choose_Chongqing();break;
            case("Shanxi"):Choose_Shanxi();break;
            case("Zhejiang"):Choose_Zhejiang();break;
        }
        Data.NAME = ((TextView)findViewById(R.id.textView_name)).getText().toString();
        Button btn_map = findViewById(R.id.button_map);
        if((Data.city_type=="culture")||(Data.city_type=="scenery")||(Data.city_type=="entertainment")){
            btn_map.setText("");
            btn_map.setBackgroundResource(R.drawable.btn_map);
        }
        else{
            LinearLayout l1 = findViewById(R.id.L1);
            l1.removeAllViews();
        }

    }

    public void Text_content(int f){
        InputStream input = getResources().openRawResource(f);
        Reader reader=new InputStreamReader(input);
        StringBuffer sb=new StringBuffer();
        BufferedReader br = new BufferedReader(reader);
        String line = "";
        try {
            while((line = br.readLine())!=null){
                sb.append(line+ "\n");
            }
            br.close();
        }catch (IOException e){
            Log.e("ReadingFile","IOException");
        }
        String string=sb.toString();
        ((TextView)findViewById(R.id.textView_content)).setText(string);
    }

    public void Choose_Beijing(){
        switch(Data.city_type){
            case("snack"):{
                switch (Data.num){
                    case(1):{
                        Text_content(R.raw.beijing_snack_zhajiangmian);
                        ((TextView)findViewById(R.id.textView_name)).setText("Fried sauce Noodles");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_snack_zhajiangmian);
                    }break;
                    case(2):{
                        Text_content(R.raw.beijing_snack_lvdagun);
                        ((TextView)findViewById(R.id.textView_name)).setText("Donkey Rolling");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_snack_lvdagun);
                    }break;
                    case(3):{
                        Text_content(R.raw.beijing_snack_douzhi);
                        ((TextView)findViewById(R.id.textView_name)).setText("Soybean Juice");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_snack_douzhi);
                    }break;
                    case(4):{
                        Text_content(R.raw.beijing_snack_choudoufu);
                        ((TextView)findViewById(R.id.textView_name)).setText("Stinky Tofu");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_snack_choudoufu);
                    }break;
                }
            }break;
            case("entertainment"):{
                switch (Data.num){
                    case(1):{
                        Text_content(R.raw.beijing_entertainment_beihaigongyuan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Beihai Park");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_entertainment_beihaigongyuan);
                    }break;
                    case(2):{
                        Text_content(R.raw.beijing_entertainment_dongwuyuan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Badaling Wildlife Park");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_entertainment_dongwuyuan);
                    }break;
                    case(3):{
                        Text_content(R.raw.beijing_entertainment_haiyangguan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Beijing Ocean Hall");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_entertainment_haiyangguan);
                    }break;
                    case(4):{
                        Text_content(R.raw.beijing_entertainment_huanlegu);
                        ((TextView)findViewById(R.id.textView_name)).setText("Beijing Happy Valley");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_entertainment_huanlegu);
                    }break;
                }
            }break;
            case("dinner"):{
                switch(Data.num){
                    case(1):{
                        Text_content(R.raw.beijing_dinner_kaoya);
                        ((TextView)findViewById(R.id.textView_name)).setText("Roast Duck");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_dinner_kaoya);
                    }break;
                    case(2):{
                        Text_content(R.raw.beijing_dinner_shuanyangrou);
                        ((TextView)findViewById(R.id.textView_name)).setText("Instant-boiled Mutton");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_dinner_shuanyangrou);
                    }break;
                    case(3):{
                        Text_content(R.raw.beijing_dinner_jingjiangrousi);
                        ((TextView)findViewById(R.id.textView_name)).setText("Sauce Meat");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_dinner_jingjiangrousi);
                    }break;
                    case(4):{
                        Text_content(R.raw.beijing_dinner_luzhuhuoshao);
                        ((TextView)findViewById(R.id.textView_name)).setText("Bittern Flapjack");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_dinner_luzhuhuoshao);
                    }break;

                }
            }break;
            case("culture"):{
                switch (Data.num){
                    case(1):{
                        Text_content(R.raw.beijing_culture_gugong);
                        ((TextView)findViewById(R.id.textView_name)).setText("Palace Museum");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_culture_gugong);
                    }break;
                    case(2):{
                        Text_content(R.raw.beijing_culture_changcheng);
                        ((TextView)findViewById(R.id.textView_name)).setText("The Great Wall");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_culture_changcheng);
                    }break;
                    case(3):{
                        Text_content(R.raw.beijing_culture_tiantan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Tiantan");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_culture_tiantan);
                    }break;
                    case(4):{
                        Text_content(R.raw.beijing_culture_shisanling);
                        ((TextView)findViewById(R.id.textView_name)).setText("The Ming Tombs");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_culture_mingshisanling);
                    }break;
                    case(5):{
                        Text_content(R.raw.beijing_culture_yiheyuan);
                        ((TextView)findViewById(R.id.textView_name)).setText("The Summer Palace");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_culture_yiheyuan);
                    }break;
                    case(6):{
                        Text_content(R.raw.beijing_culture_zhoukoudian);
                        ((TextView)findViewById(R.id.textView_name)).setText("Zhoukoudian Site");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_culture_zhoukoudian);
                    }break;
                }
            }break;
            case("scenery"):{
                switch (Data.num){
                    case(1):{
                        Text_content(R.raw.beijing_scenery_xiangshan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Fragrance Hill");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_scenery_xiangshan);
                    }break;
                    case(2):{
                        Text_content(R.raw.beijing_scenery_longqingxia);
                        ((TextView)findViewById(R.id.textView_name)).setText("Longqing Gorge");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_scenery_longqingxia);
                    }break;
                    case(3):{
                        Text_content(R.raw.beijing_scenery_lingshan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Lingshan");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_scenery_lingshan);
                    }break;
                    case(4):{
                        Text_content(R.raw.beijing_scenery_shidu);
                        ((TextView)findViewById(R.id.textView_name)).setText("Shidu Scenic Area");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_scenery_shidu);
                    }break;
                    case(5):{
                        Text_content(R.raw.beijing_scenery_heilongtan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Heilongtan");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.beijing_scenery_heilongtan);
                    }break;
                }
            }break;
        }
}

    public void Choose_Chongqing(){
                switch(Data.city_type){
                    case("snack"):{
                        switch (Data.num){
                            case(1):{
                                Text_content(R.raw.chongqing_snack_noodles);
                                ((TextView)findViewById(R.id.textView_name)).setText("Chongqing Noodles");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_snack_noodle);
                            }break;
                            case(2):{
                                Text_content(R.raw.chongqing_snack_suanlafen);
                                ((TextView)findViewById(R.id.textView_name)).setText("Hot and Sour Powder");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_snack_suanlafen);
                            }break;
                            case(3):{
                                Text_content(R.raw.chongqing_snack_tangyuan);
                                ((TextView)findViewById(R.id.textView_name)).setText("Tangyuan");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_snack_sweetdumplings);
                            }break;
                            case(4):{
                                Text_content(R.raw.chongqing_snack_chenmahua);
                                ((TextView)findViewById(R.id.textView_name)).setText("Chen Ma Hua");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_snack_chenmahua);
                            }break;
                        }
                    }break;
                    case("entertainment"):{
                        switch (Data.num){
                            case(1):{
                                Text_content(R.raw.chongqing_entertainment_huashengyuan);
                                ((TextView)findViewById(R.id.textView_name)).setText("Huashengyuan Dream Kingdom");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_entertainment_huashengyuan);
                            }break;
                            case(2):{
                                Text_content(R.raw.chongqing_entertainment_shuimofang);
                                ((TextView)findViewById(R.id.textView_name)).setText("Water Cube Waterpark");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_entertainment_shuimofang);
                            }break;
                            case(3):{
                                Text_content(R.raw.chongqing_entertainment_kejiguan);
                                ((TextView)findViewById(R.id.textView_name)).setText("Museum of Science and Technology");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_entertainment_kejiguan);
                            }break;
                            case(4):{
                                Text_content(R.raw.chongqing_entertainment_guicheng);
                                ((TextView)findViewById(R.id.textView_name)).setText("The Ghost Town");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_entertainment_guicheng);
                            }break;
                        }
                    }break;
                    case("dinner"):{
                        switch(Data.num){
                            case(1):{
                                Text_content(R.raw.chongqing_dinner_hotpot);
                                ((TextView)findViewById(R.id.textView_name)).setText("The hot pot");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_dinner_hotpot);
                            }break;
                            case(2):{
                                Text_content(R.raw.chongqing_dinner_grilledfish);
                                ((TextView)findViewById(R.id.textView_name)).setText("The grilled fish");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_dinner_grilledfish);
                            }break;
                            case(3):{
                                Text_content(R.raw.chongqing_dinner_maoxuewang);
                                ((TextView)findViewById(R.id.textView_name)).setText("Maoxuewang");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_dinner_maoxuewang);
                            }break;
                            case(4):{
                                Text_content(R.raw.chongqing_dinner_spicychicken);
                                ((TextView)findViewById(R.id.textView_name)).setText("Spicy Chicken");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_dinner_pepperychicken);
                            }break;

                        }
                    }break;
                    case("culture"):{
                        switch (Data.num){
                            case(1):{
                                Text_content(R.raw.chongqing_culture_ciqikou);
                                ((TextView)findViewById(R.id.textView_name)).setText("Ciqikou Old Town");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_culture_ciqikou);
                            }break;
                            case(2):{
                                Text_content(R.raw.chongqing_culture_hongyadong);
                                ((TextView)findViewById(R.id.textView_name)).setText("Hongyadong");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_culture_hongyadong);
                            }break;
                            case(3):{
                                Text_content(R.raw.chongqing_culture_jiefangbei);
                                ((TextView)findViewById(R.id.textView_name)).setText("Jiefangbei");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_culture_jiefangbei);
                            }break;
                            case(4):{
                                Text_content(R.raw.chongqing_culture_baidicity);
                                ((TextView)findViewById(R.id.textView_name)).setText("Baidi City");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_culture_baidicheng);
                            }break;
                            case(5):{
                                Text_content(R.raw.chongqing_culture_dazustonecarvings);
                                ((TextView)findViewById(R.id.textView_name)).setText("Dazu Stone Carvings");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_culture_dazushike);
                            }break;
                            case(6):{
                                Text_content(R.raw.chongqing_culture_minguostreet);
                                ((TextView)findViewById(R.id.textView_name)).setText("Minguo Street");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_culture_minguojie);
                            }break;
                        }
                    }break;
                    case("scenery"):{
                        switch (Data.num){
                            case(1):{
                                Text_content(R.raw.chongqing_scenery_threegorges);
                                ((TextView)findViewById(R.id.textView_name)).setText("The Three Gorges");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_scenery_sanxia);
                            }break;
                            case(2):{
                                Text_content(R.raw.chongqing_scenery_fairymountain);
                                ((TextView)findViewById(R.id.textView_name)).setText("The Fairy Mountain");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_scenery_xiannvshan);
                            }break;
                            case(3):{
                                Text_content(R.raw.chongqing_scenery_changshoulake);
                                ((TextView)findViewById(R.id.textView_name)).setText("The Changshou Lake");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_scenery_changshouhu);
                            }break;
                            case(4):{
                                Text_content(R.raw.chongqing_scenery_jinfomountain);
                                ((TextView)findViewById(R.id.textView_name)).setText("The Jinfo Mountain");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_scenery_jinfoshan);
                            }break;
                            case(5):{
                                Text_content(R.raw.chongqing_scenery_taohuayuan);
                                ((TextView)findViewById(R.id.textView_name)).setText("Taohuayuan");
                                ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                                imageview.setBackgroundResource(R.drawable.chongqing_scenery_taohuayuan);
                            }break;
                        }
                    }break;
                }
    }

    public void Choose_Shanxi(){
        switch(Data.city_type){
            case("snack"):{
                switch (Data.num){
                    case(1):{
                        Text_content(R.raw.shanxi_snack_roujiamo);
                        ((TextView)findViewById(R.id.textView_name)).setText("Marinated meat in baked bun");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_snack_roujiamo);
                    }break;
                    case(2):{
                        Text_content(R.raw.shanxi_snack_yangroupaomo);
                        ((TextView)findViewById(R.id.textView_name)).setText("Pita Bread Soaked in Lamb Soup");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_snack_yangroupaomo);
                    }break;
                    case(3):{
                        Text_content(R.raw.shanxi_snack_hulatang);
                        ((TextView)findViewById(R.id.textView_name)).setText("Meatball Hu Hot Soup");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_snack_hulatang);
                    }break;
                    case(4):{
                        Text_content(R.raw.shanxi_snack_liangpi);
                        ((TextView)findViewById(R.id.textView_name)).setText("Liangpi");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_snack_liangpi);
                    }break;
                }
            }break;
            case("entertainment"):{
                switch (Data.num){
                    case(1):{
                        Text_content(R.raw.shanxi_entertainment_dongwuyuan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Qinling Wildlife Park");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_entertainment_dongwuyuan);
                    }break;
                    case(2):{
                        Text_content(R.raw.shanxi_entertainment_lehuahuanleshijie);
                        ((TextView)findViewById(R.id.textView_name)).setText("Lehua Happy World");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_entertainment_lehuahuanleshijie);
                    }break;
                    case(3):{
                        Text_content(R.raw.shanxi_entertainment_qujianghaiyangshijie);
                        ((TextView)findViewById(R.id.textView_name)).setText("The Qujiang Ocean World");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_entertainment_qujianghaiyangshijie);
                    }break;
                    case(4):{
                        Text_content(R.raw.shanxi_entertainment_datangfurongyuan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Tang Paradise");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_entertainment_datangfurongyuan);
                    }break;
                }
            }break;
            case("dinner"):{
                switch(Data.num){
                    case(1):{
                        Text_content(R.raw.shanxi_dinner_huluji);
                        ((TextView)findViewById(R.id.textView_name)).setText("Cucurbit Chicken");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_dinner_huluji);
                    }break;
                    case(2):{
                        Text_content(R.raw.shanxi_dinner_fenzhengrou);
                        ((TextView)findViewById(R.id.textView_name)).setText("Steamed Pork powder with Rice");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_dinner_fenzhengrou);
                    }break;
                    case(3):{
                        Text_content(R.raw.shanxi_dinner_saozimian);
                        ((TextView)findViewById(R.id.textView_name)).setText("Saozi Noodles");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_dinner_saozimian);
                    }break;
                    case(4):{
                        Text_content(R.raw.shanxi_dinner_youyusi);
                        ((TextView)findViewById(R.id.textView_name)).setText("Raw-cooked Squid Shredded");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_dinner_youyusi);
                    }break;

                }
            }break;
            case("culture"):{
                switch (Data.num){
                    case(1):{
                        Text_content(R.raw.shanxi_culture_chengqiang);
                        ((TextView)findViewById(R.id.textView_name)).setText("The City Wall");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_culture_chengqiang);
                    }break;
                    case(2):{
                        Text_content(R.raw.shanxi_culture_bingmayong);
                        ((TextView)findViewById(R.id.textView_name)).setText("The Museum of Terracotta Warriors and Horses");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_culture_bingmayong);
                    }break;
                    case(3):{
                        Text_content(R.raw.shanxi_culture_huaqinggong);
                        ((TextView)findViewById(R.id.textView_name)).setText("Huaqing Pool");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_culture_huaqinggong);
                    }break;
                    case(4):{
                        Text_content(R.raw.shanxi_culture_dayanta);
                        ((TextView)findViewById(R.id.textView_name)).setText("The Big Wild Goose Pagoda");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_culture_dayanta);
                    }break;
                    case(5):{
                        Text_content(R.raw.shanxi_culture_zhonggulou);
                        ((TextView)findViewById(R.id.textView_name)).setText("Bell Tower");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_culture_zhonggulou);
                    }break;
                    case(6):{
                        Text_content(R.raw.shanxi_culture_qianling);
                        ((TextView)findViewById(R.id.textView_name)).setText("Qianling Tomb");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_culture_qianling);
                    }break;
                }
            }break;
            case("scenery"):{
                switch (Data.num){
                    case(1):{
                        Text_content(R.raw.shanxi_scenery_huashan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Huashan Mountain");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_scenery_huashan);
                    }break;
                    case(2):{
                        Text_content(R.raw.shanxi_scenery_hukoupubu);
                        ((TextView)findViewById(R.id.textView_name)).setText("Hukou Waterfall");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_scenery_hukoupubu);
                    }break;
                    case(3):{
                        Text_content(R.raw.shanxi_scenery_heihe);
                        ((TextView)findViewById(R.id.textView_name)).setText("Heihe Forest Park");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_scenery_heihe);
                    }break;
                    case(4):{
                        Text_content(R.raw.shanxi_scenery_lishan);
                        ((TextView)findViewById(R.id.textView_name)).setText("Lishan Mountain");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_scenery_lishan);
                    }break;
                    case(5):{
                        Text_content(R.raw.shanxi_scenery_bolanggu);
                        ((TextView)findViewById(R.id.textView_name)).setText("Wave Valley");
                        ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                        imageview.setBackgroundResource(R.drawable.shanxi_scenery_bolanggu);
                    }break;
                }
            }break;
        }
    }

    public void Choose_Zhejiang(){
            switch(Data.city_type){
                case("snack"):{
                    switch (Data.num){
                        case(1):{
                            Text_content(R.raw.zhejiang_snack_zongzi);
                            ((TextView)findViewById(R.id.textView_name)).setText("Jiaxing Zongzi");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_snack_zongzi);
                        }break;
                        case(2):{
                            Text_content(R.raw.zhejiang_snack_suyoubing);
                            ((TextView)findViewById(R.id.textView_name)).setText("Wushan Butter Cake");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_snack_suyoubing);
                        }break;
                        case(3):{
                            Text_content(R.raw.zhejiang_snack_longjingchasu);
                            ((TextView)findViewById(R.id.textView_name)).setText("Longjing Tea Crisp");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_snack_longjingchasu);
                        }break;
                        case(4):{
                            Text_content(R.raw.zhejiang_snack_pianchuan);
                            ((TextView)findViewById(R.id.textView_name)).setText("Pianchuan");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_snack_pianchuan);
                        }break;
                    }
                }break;
                case("entertainment"):{
                    switch (Data.num){
                        case(1):{
                            Text_content(R.raw.zhejiang_entertainment_huangchengshatan);
                            ((TextView)findViewById(R.id.textView_name)).setText("Songhuangcheng Beach");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_entertainment_huangchengshatan);
                        }break;
                        case(2):{
                            Text_content(R.raw.zhejiang_entertainment_fangtedongfangshenhua);
                            ((TextView)findViewById(R.id.textView_name)).setText("Fangte Oriental Spiritual Painting");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_entertainment_fangtedongfangshenhua);
                        }break;
                        case(3):{
                            Text_content(R.raw.zhejiang_entertainment_anjihellokitty);
                            ((TextView)findViewById(R.id.textView_name)).setText("Hello Kitty Paradise Park");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_entertainment_anjihellokitty);
                        }break;
                        case(4):{
                            Text_content(R.raw.zhejiang_entertainment_luomenghuanqiuleyuan);
                            ((TextView)findViewById(R.id.textView_name)).setText("Romon Universal Paradise");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_entertainment_luomenghuanqiuleyuan);
                        }break;
                    }
                }break;
                case("dinner"):{
                    switch(Data.num){
                        case(1):{
                            Text_content(R.raw.zhejiang_dinner_dongporou);
                            ((TextView)findViewById(R.id.textView_name)).setText("Dongpo Pork");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_dinner_dongporou);
                        }break;
                        case(2):{
                            Text_content(R.raw.zhejiang_dinner_xihuchuyu);
                            ((TextView)findViewById(R.id.textView_name)).setText("West Lake Vinegar Fish");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_dinner_xihuchuyu);
                        }break;
                        case(3):{
                            Text_content(R.raw.zhejiang_dinner_meigancaikourou);
                            ((TextView)findViewById(R.id.textView_name)).setText("Braised Pork with Preserved Vegetable");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_dinner_meigancaikourou);
                        }break;
                        case(4):{
                            Text_content(R.raw.zhejiang_dinner_xiaren);
                            ((TextView)findViewById(R.id.textView_name)).setText("Longjing Shrimp");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_dinner_xiaren);
                        }break;

                    }
                }break;
                case("culture"):{
                    switch (Data.num){
                        case(1):{
                            Text_content(R.raw.zhejiang_culture_wuzhen);
                            ((TextView)findViewById(R.id.textView_name)).setText("Wuzhen");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_culture_wuzhen);
                        }break;
                        case(2):{
                            Text_content(R.raw.zhejiang_culture_lingyinsi);
                            ((TextView)findViewById(R.id.textView_name)).setText("Lingyin Temple");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_culture_lingyinsi);
                        }break;
                        case(3):{
                            Text_content(R.raw.zhejiang_culture_hengdianyingshicheng);
                            ((TextView)findViewById(R.id.textView_name)).setText("Hengdian Film and Television City");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_culture_hengdianyingshicheng);
                        }break;
                        case(4):{
                            Text_content(R.raw.zhejiang_culture_hefangjie);
                            ((TextView)findViewById(R.id.textView_name)).setText("Hefang Street");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_culture_hefangjie);
                        }break;
                        case(5):{
                            Text_content(R.raw.zhejiang_culture_shenyuan);
                            ((TextView)findViewById(R.id.textView_name)).setText("Shenyuan");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_culture_shenyuan);
                        }break;
                        case(6):{
                            Text_content(R.raw.zhejiang_culture_nanxunguzhen);
                            ((TextView)findViewById(R.id.textView_name)).setText("Nanxun");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_culture_nanxunguzhen);
                        }break;
                    }
                }break;
                case("scenery"):{
                    switch (Data.num){
                        case(1):{
                            Text_content(R.raw.zhejiang_scenery_xihu);
                            ((TextView)findViewById(R.id.textView_name)).setText("The West Lake");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_scenery_xihu);
                        }break;
                        case(2):{
                            Text_content(R.raw.zhejiang_scenery_yandangshan);
                            ((TextView)findViewById(R.id.textView_name)).setText("Yandang Mountain");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_scenery_yandangshan);
                        }break;
                        case(3):{
                            Text_content(R.raw.zhejiang_scenery_putuoshan);
                            ((TextView)findViewById(R.id.textView_name)).setText("Putuo Mountain");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_scenery_putuoshan);
                        }break;
                        case(4):{
                            Text_content(R.raw.zhejiang_scenery_qiandaohu);
                            ((TextView)findViewById(R.id.textView_name)).setText("Qiandao Lake");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_scenery_qiandaohu);
                        }break;
                        case(5):{
                            Text_content(R.raw.zhejiang_scenery_shuanglongdong);
                            ((TextView)findViewById(R.id.textView_name)).setText("Jinhua Shuanglong Cave");
                            ImageView imageview =(ImageView)findViewById(R.id.imageView_name);
                            imageview.setBackgroundResource(R.drawable.zhejiang_scenery_shuanglongdong);
                        }break;
                    }
                }break;
            }

    }

    public void BTN_Map(View view){
        if((Data.city_type=="culture")||(Data.city_type=="scenery")||(Data.city_type=="entertainment")) {
            startActivity(new Intent(Activity_introduction.this, Activity_Map.class));
        }
    }
}

