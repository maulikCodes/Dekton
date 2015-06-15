package com.dekton.dektonapp;

import android.content.Intent;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;


public class glass_3 extends ActionBarActivity {
    TextView t00, t01, t02, t03, t10, t11, t12, t13, t20, t21, t22, t23, t001, t011, t021, t031, t101, t111, t121, t131, t201, t211, t221, t231;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glass_3);
        t00 = (TextView) findViewById(R.id.t00);
        t01 = (TextView) findViewById(R.id.t01);
        t02 = (TextView) findViewById(R.id.t02);
        t03 = (TextView) findViewById(R.id.t03);
        t10 = (TextView) findViewById(R.id.t10);
        t11 = (TextView) findViewById(R.id.t11);
        t12 = (TextView) findViewById(R.id.t12);
        t13 = (TextView) findViewById(R.id.t13);
        t20 = (TextView) findViewById(R.id.t20);
        t21 = (TextView) findViewById(R.id.t21);
        t22 = (TextView) findViewById(R.id.t22);
        t23 = (TextView) findViewById(R.id.t23);
        t001 = (TextView) findViewById(R.id.t001);
        t011 = (TextView) findViewById(R.id.t011);
        t021 = (TextView) findViewById(R.id.t021);
        t031 = (TextView) findViewById(R.id.t031);
        t101 = (TextView) findViewById(R.id.t101);
        t111 = (TextView) findViewById(R.id.t111);
        t121 = (TextView) findViewById(R.id.t121);
        t131 = (TextView) findViewById(R.id.t131);
        t201 = (TextView) findViewById(R.id.t201);
        t211 = (TextView) findViewById(R.id.t211);
        t221 = (TextView) findViewById(R.id.t221);
        t231 = (TextView) findViewById(R.id.t231);

        Typeface PFHighwaySansProRegular = Typeface.createFromAsset(getAssets(), "PFHighwaySansProRegular.ttf");

        t00.setTypeface(PFHighwaySansProRegular);
        t01.setTypeface(PFHighwaySansProRegular);
        t02.setTypeface(PFHighwaySansProRegular);
        t03.setTypeface(PFHighwaySansProRegular);
        t10.setTypeface(PFHighwaySansProRegular);
        t11.setTypeface(PFHighwaySansProRegular);
        t12.setTypeface(PFHighwaySansProRegular);
        t13.setTypeface(PFHighwaySansProRegular);
        t20.setTypeface(PFHighwaySansProRegular);
        t21.setTypeface(PFHighwaySansProRegular);
        t22.setTypeface(PFHighwaySansProRegular);
        t23.setTypeface(PFHighwaySansProRegular);
        t001.setTypeface(PFHighwaySansProRegular);
        t011.setTypeface(PFHighwaySansProRegular);
        t021.setTypeface(PFHighwaySansProRegular);
        t031.setTypeface(PFHighwaySansProRegular);
        t101.setTypeface(PFHighwaySansProRegular);
        t111.setTypeface(PFHighwaySansProRegular);
        t121.setTypeface(PFHighwaySansProRegular);
        t131.setTypeface(PFHighwaySansProRegular);
        t201.setTypeface(PFHighwaySansProRegular);
        t211.setTypeface(PFHighwaySansProRegular);
        t221.setTypeface(PFHighwaySansProRegular);
        t231.setTypeface(PFHighwaySansProRegular);

        getSupportActionBar().hide();
    }

    public void onClickSlideDown(View view) {

        Intent i = new Intent(this, intro.class);
        startActivity(i);
        overridePendingTransition(R.anim.ltr12, R.anim.rtl12);
    }

    public void onClickCloseButton(View view) {
        System.exit(0);
    }


}
