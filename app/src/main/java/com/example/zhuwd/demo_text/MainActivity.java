package com.example.zhuwd.demo_text;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tv_show;
    public Button bt_action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setListening();

    }

    private void findView() {
        tv_show = (TextView) findViewById(R.id.tv_show);
        bt_action = (Button) findViewById(R.id.bt_action);
    }

    private void setListening() {
        bt_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                haveAction();
            }
        });
    }

    private void haveAction() {
        tv_show.setText("123");
    }
}
