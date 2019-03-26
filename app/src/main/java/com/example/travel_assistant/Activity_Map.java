package com.example.travel_assistant;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;


public class Activity_Map extends AppCompatActivity {
    protected MapView mapView = null;
    public BaiduMap baiduMap;
    double a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity__map);
        ((TextView)findViewById(R.id.textView_city8)).setText(Data.city_name);
        ((TextView)findViewById(R.id.textView_name)).setText(Data.NAME);
        mapView = (MapView) findViewById(R.id.map);
        baiduMap=mapView.getMap();//获取地图控制器
        a=39.915526;
        b=116.403847;
        location();
        LatLng cenpt = new LatLng(a,b);
        //location icon
        BitmapDescriptor myMarker = BitmapDescriptorFactory
                .fromResource(R.drawable.location);
        MarkerOptions option = new MarkerOptions().icon(myMarker).position(cenpt);

        MapStatus mMapStatus = new MapStatus.Builder()
                .target(cenpt)
                .zoom(15)
                .build();
        MapStatusUpdate mMapStatusUpdate = MapStatusUpdateFactory.newMapStatus(mMapStatus);
        baiduMap.setMapStatus(mMapStatusUpdate);
        baiduMap.addOverlay(option);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mapView.onDestroy();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mapView.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mapView.onPause();
    }
    public void location(){
        switch (Data.NAME){
            //Beijing
            case("Palace Museum"):{a=39.924239;b=116.403429;}break;
            case("The Great Wall"):{a=40.362723;b=116.021982;}break;
            case("Tiantan"):{a=39.887573;b=116.416948;}break;
            case("The Ming Tombs"):{a=40.255619;b=116.227491;}break;
            case("The Summer Palace"):{a=39.999247;b=116.278776;}break;
            case("Zhoukoudian Site"):{a=39.693743;b=115.935314;}break;
            case("Fragrance Hill"):{a=39.996180;b=116.197430;}break;
            case("Longqing Gorge"):{a=40.556402;b=116.008265;}break;
            case("Lingshan"):{a=40.046239;b=115.506485;}break;
            case("Shidu Scenic Area"):{a=39.644087;b=115.605869;}break;
            case("Heilongtan"):{a=40.566336;b=116.792696;}break;
            case("Beihai Park"):{a=39.933870;b=116.395149;}break;
            case("Badaling Wildlife Park"):{a=40.356468;b=116.004660;}break;
            case("Beijing Ocean Hall"):{a=39.950276;b=116.347481;}break;
            case("Beijing Happy Valley"):{a=39.873239;b=116.501192;}break;
            //Chongqing
            case("Ciqikou Old Town"):{a=29.584897;b=106.456764;}break;
            case("Hongyadong"):{a=29.567960;b=106.584383;}break;
            case("Jiefangbei"):{a=29.563390;b=106.583613;}break;
            case("Baidi City"):{a=31.046685;b=109.581337;}break;
            case("Dazu Stone Carvings"):{a=29.753416;b=105.802764;}break;
            case("Minguo Street"):{a=29.690286;b=106.829328;}break;
            case("The Three Gorges"):{a=31.044548;b=109.582634;}break;
            case("The Fairy Mountain"):{a=29.493827;b=107.744566;}break;
            case("The Changshou Lake"):{a=29.915906;b=107.258892;}break;
            case("The Jinfo Mountain"):{a=29.104533;b=107.207362;}break;
            case("Taohuayuan"):{a=28.855179;b=108.764341;}break;
            case("Huashengyuan Dream Kingdom"):{a=29.471653;b=106.474349;}break;
            case("Water Cube Waterpark"):{a=29.492702;b=106.448134;}break;
            case("Museum of Science and Technology"):{a=29.577170;b=106.584425;}break;
            case("The Ghost Town"):{a=29.914373;b=107.739404;}break;
            //Shanxi
            case("The City Wall"):{a=34.257963;b=108.954727;}break;
            case("The Museum of Terracotta Warriors and Horses"):{a=34.390016;b=109.289145;}break;
            case("Huaqing Pool"):{a=34.370878;b=109.218140;}break;
            case("The Big Wild Goose Pagoda"):{a=34.225619;b=108.971152;}break;
            case("Bell Tower"):{a=34.265679;b=108.953459;}break;
            case("Qianling Tomb"):{a=34.565932;b=108.245551;}break;
            case("Huashan Mountain"):{a=34.497647;b=110.073028;}break;
            case("Hukou Waterfall"):{a=36.151015;b=110.455427;}break;
            case("Heihe Forest Park"):{a=33.900206;b=107.872399;}break;
            case("Lishan Mountain"):{a=34.360621;b=109.220232;}break;
            case("Wave Valley"):{a=37.536064;b=109.007819;}break;
            case("Qinling Wildlife Park"):{a=34.053407;b=108.873847;}break;
            case("Lehua Happy World"):{a=34.480955;b=108.923743;}break;
            case("The Qujiang Ocean World"):{a=34.221386;b=108.986960;}break;
            case("Tang Paradise"):{a=34.218949;b=108.980724;}break;
            //Zhejiang
            case("Wuzhen"):{a=30.754544;b=120.494407;}break;
            case("Lingyin Temple"):{a=30.246569;b=120.108260;}break;
            case("Hengdian Film and Television City"):{a=29.143633;b=120.323376;}break;
            case("Hefang Street"):{a=30.245310;b=120.182128;}break;
            case("Shenyuan"):{a=29.996662;b=120.596483;}break;
            case("Nanxun"):{a=30.881340;b=120.437105;}break;
            case("The West Lake"):{a=30.227400;b=120.117768;}break;
            case("Yandang Mountain"):{a=28.379665;b=121.040296;}break;
            case("Putuo Mountain"):{a=30.007976;b=122.397608;}break;
            case("Qiandao Lake"):{a=29.553864;b=118.934232;}break;
            case("Jinhua Shuanglong Cave"):{a=29.210831;b=119.637685;}break;
            case("Songhuangcheng Beach"):{a=29.249293;b=121.968896;}break;
            case("Fangte Oriental Spiritual Painting"):{a=30.328663;b=121.187093;}break;
            case("Hello Kitty Paradise Park"):{a=30.626774;b=119.745075;}break;
            case("Romon Universal Paradise"):{a=29.804457;b=121.550653;}break;
        }
    }
}
