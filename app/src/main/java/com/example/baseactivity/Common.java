package com.example.baseactivity;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by ysc on 10/24/2016.
 */

public class Common {
    //设置字体
    public static Typeface setFont(Context context){
        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/PingFang-SC-Regular.ttf");
        return font;
    }
}
