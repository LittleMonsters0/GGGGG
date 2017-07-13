package com.app.activity.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abc on 2017/7/12.
 */

public class HomeActivity extends Activity implements View.OnClickListener {

    private ViewPager viewPager;
    private RadioGroup rg;
    private RadioButton shouyeBtn,fujingBtn,guangyiguangBtn,dingdanBtn,wodeBtn;
    private List<Fragment> fragments;
    private FragmentPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        viewPager = (ViewPager) findViewById(R.id.vp);
        shouyeBtn = (RadioButton) findViewById(R.id.home);
        fujingBtn = (RadioButton) findViewById(R.id.fujin);
        guangyiguangBtn = (RadioButton) findViewById(R.id.guangyiguang);
        dingdanBtn = (RadioButton) findViewById(R.id.dingdan);
        wodeBtn = (RadioButton) findViewById(R.id.wode);
        rg =(RadioGroup) findViewById(R.id.rg);
        shouyeBtn.setOnClickListener(this);
        fujingBtn.setOnClickListener(this);
        guangyiguangBtn.setOnClickListener(this);
        dingdanBtn.setOnClickListener(this);
        wodeBtn.setOnClickListener(this);

        fragments = new ArrayList<>();
        fragments.add(new fragment_Shouye());

        adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public android.support.v4.app.Fragment getItem(int position) {
                return fragments.get(position);
            }


            @Override
            public int getCount() {
                return fragments.size();
            }
        };
        viewPager.setAdapter(adapter);
        rg.check(R.id.home);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        rg.check(R.id.home);
                        break;
                    case 1:
                        rg.check(R.id.fujin);
                        break;
                    case 2:
                        rg.check(R.id.guangyiguang);
                        break;
                    case 3:
                        rg.check(R.id.dingdan);
                        break;
                    case 4:
                        rg.check(R.id.wode);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }




    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.home:
                viewPager.setCurrentItem(0,true);
                break;
            case R.id.fujin:
                viewPager.setCurrentItem(1,true);
                break;
            case R.id.guangyiguang:
                viewPager.setCurrentItem(2,true);
                break;
            case R.id.dingdan:
                viewPager.setCurrentItem(3,true);
                break;
            case R.id.wode:
                viewPager.setCurrentItem(4,true);
                break;
        }
    }


}
