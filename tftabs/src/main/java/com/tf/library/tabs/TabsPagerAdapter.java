package com.tf.library.tabs;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by kamran on 11/3/15.
 */
public abstract class TabsPagerAdapter extends FragmentStatePagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public abstract Drawable getPageIcon(int position);

    public abstract Drawable getPageInactiveIcon(int position);
}
