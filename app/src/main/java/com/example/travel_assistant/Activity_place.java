package com.example.travel_assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_place extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
    }
    public void BTN_culture(View view){
        Data.city_type = "culture";
        startActivity(new Intent(Activity_place.this,Activity_culture.class));
    }
    public void BTN_scenery(View view){
        Data.city_type = "scenery";
                startActivity(new Intent(Activity_place.this,Activity_scenery.class));
    }
    public void BTN_entertainment(View view){
        Data.city_type = "entertainment";
                startActivity(new Intent(Activity_place.this,Activity_entertainment.class));
    }
}
