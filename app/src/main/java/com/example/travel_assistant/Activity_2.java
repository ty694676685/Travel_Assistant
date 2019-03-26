package com.example.travel_assistant;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

public class Activity_2 extends TabActivity {
    //选项卡
    private TabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ((TextView)findViewById(R.id.textView_city1)).setText(Data.city_name);
        mTabHost = getTabHost();
        mTabHost.setup();

        TabHost.TabSpec tabSpec1 = mTabHost.newTabSpec("tab_place").setIndicator("Place").setContent(new Intent(this,Activity_place.class));
        TabHost.TabSpec tabSpec2 = mTabHost.newTabSpec("tab_food").setIndicator("Food").setContent(new Intent(this,Activity_food.class));

        mTabHost.addTab(tabSpec1);
        mTabHost.addTab(tabSpec2);

    }


}
