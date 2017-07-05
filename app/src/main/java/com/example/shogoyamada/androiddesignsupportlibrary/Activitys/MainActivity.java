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
        tablayoutButton.setOnClickListener((View v) -> {
            next(TabLayoutActivity.class);
        });

        Button navigationview = (Button) findViewById(R.id.navigation_view);
        navigationview.setOnClickListener((View v) -> {
            next(NavigationViewActivity.class);
        });

        Button textInputLayput = (Button) findViewById(R.id.text_input_layout);
        textInputLayput.setOnClickListener((View v) -> {
            next(TextInputLayoutActivity.class);
        });

        Button flatingActionButton = (Button)findViewById(R.id.floating_action_button);
        flatingActionButton.setOnClickListener((View v) -> {
            next(FloatingActionButtonActivity.class);
        });
    }


    /**
     * 画面遷移する
     * @param clazz 遷移先クラス
     */
    private void next(Class<? extends AppCompatActivity> clazz){
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
