package com.example.travel_assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
    public void BTN_dinner(View view){
        Data.city_type = "dinner";
                startActivity(new Intent(Activity_food.this,Activity_dinner.class));
    }
    public void BTN_snack(View view){
        Data.city_type = "snack";
                startActivity(new Intent(Activity_food.this,Activity_snack.class));
    }

}
