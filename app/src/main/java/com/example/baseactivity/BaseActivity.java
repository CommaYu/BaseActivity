package com.example.baseactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ysc on 10/18/2016.
 * BaseActivity不用在AndroidManifest.xml中声明
 */

public abstract class BaseActivity extends Activity {
    /** 高德地图会用到 */
    protected Bundle savedInstanceState;
    /** 太多地方需要定义String TAG */
    protected String TAG = getClass().getSimpleName();
    private ImageView title_back;
    private TextView title_name;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "当前页面Activity="+getClass().getSimpleName());// 如果工程的activity都集成BaseActivity，在我们点击的时候，就可以知道是哪一个activity了
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());

        this.savedInstanceState = savedInstanceState;
        mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);

        initFindViewById();
        setListener();
        initViews();

//        title_back = (ImageView) findViewById(R.id.title_back);
//        if (title_back != null) {
//            title_back.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    finish();
//                }
//            });
//        }
//
//        title_name = (TextView) findViewById(R.id.title_name);
//        if (title_name != null) {
//            title_name.setText(getTitleText());
//        }
    }



    /**
     * 声明所在的页面的资源文件xml - (R.layout.xxx);
     */
    protected abstract int getContentViewId();

    /**
     * 一些其他的声明
     */
    protected abstract void initViews();

    /**
     * 控件findViewById()
     */
    protected abstract void initFindViewById();

    /**
     * 控件的监听setOnClickListener()
     */
    protected abstract void setListener();

//    /**
//     * 声明所在页面的title名称
//     */
//    protected abstract String getTitleText();

    // 这种方式显示的Toast，就只会显示一次
    protected void showToast(final String str) {
        mToast.setText(str);
        mToast.show();
    }

    // 这种方式写的Toast消息，会显示多次，建议不要使用这种方式
    protected void showToast2(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}

