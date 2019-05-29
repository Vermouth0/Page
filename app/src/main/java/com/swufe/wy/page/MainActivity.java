package com.swufe.wy.page;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //viewPager控件指定区域显示Fragment，具体显示哪一个Fragment由MyPageAdapter管理
        ViewPager viewPager = findViewById(R.id.viewpager);
        //获取pageAdapter对象
        MyPageAdapter pageAdapter = new MyPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager); //将tab与viewPager绑定

    }
}
