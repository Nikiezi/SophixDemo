package com.example.cookie.mysophixdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
        show = findViewById(R.id.tv_show);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                fillInTheContent(2);
                break;
            default:
                break;
        }
    }

    private void fillInTheContent(int type) {

        String versionCode = APKVersionCodeUtils.getVersionCode(this) + "";

        String versionName = APKVersionCodeUtils.getVerName(this);

        if (type != 1) {
            show.setText("这是修复后的新版本");
            show.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else {
            show.setText("啦啦啦啦啦啦");
        }
    }
}
