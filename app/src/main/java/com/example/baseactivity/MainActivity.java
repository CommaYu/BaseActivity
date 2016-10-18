package com.example.baseactivity;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private Button button1,button2;

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initFindViewById() {
        button1 = (Button) findViewById(R.id.id_button1);
        button2 = (Button) findViewById(R.id.id_button2);
    }

    @Override
    protected void setListener() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "1<---多次点击，看看多久消失--->1", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("2<---多次点击，看看多久消失--->2");
            }
        });
    }
}
