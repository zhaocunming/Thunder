package com.android.thunder.utils;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

import com.android.thunder.ThunderApplication;

/**
 * Copyright(c) 2016 All Rights Reserved.
 * Author: ZhaoCunming
 * Time: 16-8-21 14:31
 * E-mail: zhaocunming@dayima.com
 * Version：V1.0.1
 * ProjectName: Thunder
 * Description: TODO
 */
public class MiscUtil {
    public static int px2dip(float pxValue){
        final float scale= ThunderApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (pxValue/scale+0.5f);
    }
    public static int dip2px(float dipValue){
        final  float scale=ThunderApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (dipValue*scale+0.5f);
    }
    public static int dip2px(double dipValue){
        final  float scale=ThunderApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (dipValue*scale+0.5f);
    }
    public static Display display = null;

    public static Display getDisplay(Context context) {
        if (display == null) {
            WindowManager wm = ((Activity) context).getWindowManager();
            display = wm.getDefaultDisplay();
        }
        return display;
    }

    public static int getScreenWidth(Context context) {
        return getDisplay(context).getWidth();
    }

    public static int getScreenHeight(Context context) {
        return getDisplay(context).getHeight();
    }

}
