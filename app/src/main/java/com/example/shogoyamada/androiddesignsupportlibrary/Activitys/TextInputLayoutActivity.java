package com.example.shogoyamada.androiddesignsupportlibrary.Activitys;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.shogoyamada.androiddesignsupportlibrary.R;

public class TextInputLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);

        Button error = (Button) findViewById(R.id.error_button);
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showErrorMessage();
            }
        });
    }

    /**
     * エラーメッセージを表示する
     */
    private void showErrorMessage(){

        TextInputLayout textInputLayout = (TextInputLayout)findViewById(R.id.name);
        textInputLayout.setError("エラーメッセージを表示！！！");
        textInputLayout.setErrorEnabled(true);
    }

}
