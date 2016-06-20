package com.carturo8824.petagram.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Borregos123 on 19/06/2016.
 */
public class PageAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> fragments;

    public PageAdapter(FragmentManager fm,ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments =fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
