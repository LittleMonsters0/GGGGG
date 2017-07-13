package com.app.activity.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import imgbutton.dibu_fly;
import imgbutton.dibu_hight;
import imgbutton.dibu_togo;
import imgbutton.zhongbu_KTV;
import imgbutton.zhongbu_dianying;
import imgbutton.zhongbu_jiudian;
import imgbutton.zhongbu_meifa;
import imgbutton.zhongbu_meishi;
import imgbutton.zhongbu_piao;
import imgbutton.zhongbu_waimai;
import imgbutton.zhongbu_xiuxian;
import imgbutton.zhongbu_zhoubian;

/**
 * Created by abc on 2017/7/12.
 */

public class fragment_Shouye extends Fragment implements View.OnClickListener {

    private View view;
    private ImageButton _meishi,_dianying,_jiudian,
            _xiuxian,_waimai,_piao,_KTV,_zhoubian,
            _meifa,_lvxing,
            _img1,_img2,_img3;
    private Button _img1text,_img1text1,
            _img2text,_img2text1,
            _img3text,_img3text1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

            view=inflater.inflate(R.layout.fragment_shouye, container, false);

        initView(view);
        return view;
    }
    private void initView(View v) {
        _meishi=v.findViewById(R.id.zhongbu_meishi);
        _dianying=v.findViewById(R.id.zhongbu_dianying);
        _jiudian=v.findViewById(R.id.zhongbu_jiudian);
        _xiuxian=v.findViewById(R.id.zhongbu_xiuxian);
        _waimai=v.findViewById(R.id.zhongbu_waimai);
        _piao=v.findViewById(R.id.zhongbu_piao);
        _KTV=v.findViewById(R.id.zhongbu_KTV);
        _zhoubian=v.findViewById(R.id.zhongbu_zhoubian);
        _meifa=v.findViewById(R.id.zhongbu_meifa);
        _lvxing=v.findViewById(R.id.zhongbu_lvxing);
        _img1=v.findViewById(R.id.dibu_img1);
        _img2=v.findViewById(R.id.dibu_img2);
        _img3=v.findViewById(R.id.dibu_img3);
        _img1text=v.findViewById(R.id.dibu_img1text);
        _img1text1=v.findViewById(R.id.dibu_img1text1);
        _img2text=v.findViewById(R.id.dibu_img2text);
        _img2text1=v.findViewById(R.id.dibu_img2text1);
        _img3text=v.findViewById(R.id.dibu_img3text);
        _img3text1=v.findViewById(R.id.dibu_img3text1);

        _meishi.setOnClickListener(this);
        _dianying.setOnClickListener(this);
        _jiudian.setOnClickListener(this);
        _xiuxian.setOnClickListener(this);
        _waimai.setOnClickListener(this);
        _piao.setOnClickListener(this);
        _KTV.setOnClickListener(this);
        _zhoubian.setOnClickListener(this);
        _meifa.setOnClickListener(this);
        _lvxing.setOnClickListener(this);

        _img1.setOnClickListener(this);
        _img1text.setOnClickListener(this);
        _img1text1.setOnClickListener(this);

        _img2.setOnClickListener(this);
        _img2text.setOnClickListener(this);
        _img2text1.setOnClickListener(this);

        _img3.setOnClickListener(this);
        _img3text.setOnClickListener(this);
        _img3text1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.zhongbu_meishi:
                Intent intent=new Intent(fragment_Shouye.this, zhongbu_meishi.class);
                startActivity(intent);
                break;
            case R.id.zhongbu_dianying:
                Intent intent1=new Intent(fragment_Shouye.this, zhongbu_dianying.class);
                startActivity(intent1);
                break;
            case R.id.zhongbu_jiudian:
                Intent intent2=new Intent(fragment_Shouye.this, zhongbu_jiudian.class);
                startActivity(intent2);
                break;
            case R.id.zhongbu_xiuxian:
                Intent intent3=new Intent(fragment_Shouye.this, zhongbu_xiuxian.class);
                startActivity(intent3);
                break;
            case R.id.zhongbu_waimai:
                Intent intent4=new Intent(fragment_Shouye.this, zhongbu_waimai.class);
                startActivity(intent4);
                break;
            case R.id.zhongbu_piao:
                Intent intent5=new Intent(fragment_Shouye.this, zhongbu_piao.class);
                startActivity(intent5);
                break;
            case R.id.zhongbu_KTV:
                Intent intent6=new Intent(fragment_Shouye.this, zhongbu_KTV.class);
                startActivity(intent6);
                break;
            case R.id.zhongbu_zhoubian:
                Intent intent7=new Intent(fragment_Shouye.this, zhongbu_zhoubian.class);
                startActivity(intent7);
                break;
            case R.id.zhongbu_meifa:
                Intent intent8=new Intent(fragment_Shouye.this, zhongbu_meifa.class);
                startActivity(intent8);
                break;
            case R.id.zhongbu_lvxing:
                Intent intent9=new Intent(fragment_Shouye.this,zhongbu_lvxing.class);
                startActivity(intent9);
                break;
            case R.id.dibu_img1:
                Intent intent10 = new Intent(fragment_Shouye.this,dibu_hight.class);
                startActivity(intent10);
                break;
            case R.id.dibu_img1text:
                Intent intent11=new Intent(fragment_Shouye.this,dibu_hight.class);
                startActivity(intent11);
                break;
            case R.id.dibu_img1text1:
                Intent intent12=new Intent(fragment_Shouye.this,dibu_hight.class);
                startActivity(intent12);
                break;
            case R.id.dibu_img2:
                Intent intent13=new Intent(fragment_Shouye.this,dibu_togo.class);
                startActivity(intent13);
                break;
            case R.id.dibu_img2text:
                Intent intent14=new Intent(fragment_Shouye.this,dibu_togo.class);
                startActivity(intent14);
                break;
            case R.id.dibu_img2text1:
                Intent intent15=new Intent(fragment_Shouye.this,dibu_togo.class);
                startActivity(intent15);
                break;
            case R.id.dibu_img3:
                Intent intent16=new Intent(fragment_Shouye.this,dibu_fly.class);
                startActivity(intent16);
                break;
            case R.id.dibu_img3text:
                Intent intent17=new Intent(fragment_Shouye.this,dibu_fly.class);
                startActivity(intent17);
                break;
            case R.id.dibu_img3text1:
                Intent intent18=new Intent(fragment_Shouye.this,dibu_fly.class);
                startActivity(intent18);
                break;
        }
    }
}
