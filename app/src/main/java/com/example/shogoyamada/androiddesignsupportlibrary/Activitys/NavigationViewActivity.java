package com.example.shogoyamada.androiddesignsupportlibrary.Activitys;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.shogoyamada.androiddesignsupportlibrary.R;

public class NavigationViewActivity extends AppCompatActivity {


    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);


        //ツールバーを初期化
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //トグルボタンを作成
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        toggle.setDrawerIndicatorEnabled(true); //ドロワーの使うか使わないかのオンオフ
        drawerLayout.addDrawerListener(toggle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        //ここでトグルボタンを作成

        // アクティビティ作成後にトグルボタンを同期
        toggle.syncState();
    }

}
