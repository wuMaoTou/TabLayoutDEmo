package com.example.tablayoutdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by wuchundu on 17-1-10.
 */

public class BaseFragmentAdapter extends FragmentPagerAdapter {

    private List<String> titles;

    public BaseFragmentAdapter(FragmentManager fm, List<String> titles) {
        super(fm);
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {

        BaseFragment baseFragment = new BaseFragment();
        Bundle bundle = new Bundle();
        bundle.putString("position",titles.get(position));
        baseFragment.setArguments(bundle);

        return baseFragment;
    }

    @Override
    public int getCount() {
        return titles == null?0:titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles == null?"":titles.get(position);
    }
}
