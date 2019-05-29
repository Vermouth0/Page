package com.swufe.wy.page;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    private String[] title = new String[]{"Wislawa","Tagore","Elytis"}; //保存标题名
    public MyPageAdapter(FragmentManager manager) {

        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FirstFragment();
        }else if(position==1){
            return new SecondFragment();
        }else{
            return new ThirdFragment();
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return title[position];
    }
    @Override
    public int getCount() {
        return 3;   //管理的Fragment有多少个
    }
}
