package com.example.shogoyamada.androiddesignsupportlibrary.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.shogoyamada.androiddesignsupportlibrary.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button tablayoutButton = (Button) findViewById(R.id.tab_layout);
        tablayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                next(TabLayoutActivity.class);
            }
        });

        Button navigationview = (Button) findViewById(R.id.navigation_view);
        navigationview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(NavigationViewActivity.class);
            }
        });
    }


    private void next(Class<? extends AppCompatActivity> clazz){
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
