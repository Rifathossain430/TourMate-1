package com.example.tourmate.activity.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tourmate.R;

public class DetailsTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_tour);
    }

    public void back(View view) {
        onBackPressed();
    }
}
