package com.dekton.dektonapp;



import android.content.Intent;
import android.graphics.Typeface;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import android.widget.TextView;


public class intro extends ActionBarActivity{

    TextView AboveImage1, AboveImage2, BelowImage1, BelowImage2;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        AboveImage1 = (TextView) findViewById(R.id.AboveImage1);
        AboveImage2 = (TextView) findViewById(R.id.AboveImage2);
        BelowImage1 = (TextView) findViewById(R.id.BelowImage1);
        BelowImage2 = (TextView) findViewById(R.id.BelowImage2);
        Typeface BryantProBold = Typeface.createFromAsset(getAssets(), "BryantProBold.otf");
        Typeface BryantProRegularAlt = Typeface.createFromAsset(getAssets(), "BryantProRegularAlt.otf");
        AboveImage1.setTypeface(BryantProBold);
        AboveImage2.setTypeface(BryantProBold);
        BelowImage1.setTypeface(BryantProRegularAlt);
        BelowImage2.setTypeface(BryantProRegularAlt);
        getSupportActionBar().hide();
    }

    public void onClickSlideDown(View view) {

        Intent i1 = new Intent(this, slidescreen.class);
        startActivity(i1);
        overridePendingTransition(R.anim.ltr12, R.anim.rtl12);

    }

    public void onClickCloseButton(View view) {
        Intent i = new Intent(this,glass_3.class);
        startActivity(i);
    }


}
