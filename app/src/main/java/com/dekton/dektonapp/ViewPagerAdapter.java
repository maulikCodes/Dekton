package com.dekton.dektonapp;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {

    //Declare variables
    Context context;
    int[] background;
    int[] icon;
    String[] title;
    String[] title_2;
    String[] description;
    LayoutInflater inflater;

    public ViewPagerAdapter(Context context, int[] background, int[] icon, String[] title, String[] title_2, String[] description) {
        this.context = context;
        this.background = background;
        this.icon = icon;
        this.title = title;
        this.title_2 = title_2;
        this.description = description;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public int getCount() {
        return background.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        //Declare variables
        ImageView iconimage, whitebox, bgimage;
        TextView titletext, title_2text, descriptiontext;
        Animation translate, slide;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.slidescreen_item, container, false);

        //Locate textviews in slidescreen_item.xml
        titletext = (TextView) itemView.findViewById(R.id.title);
        title_2text = (TextView) itemView.findViewById(R.id.title_2);
        descriptiontext = (TextView) itemView.findViewById(R.id.description);

        //Capture position and set to textviews
        titletext.setText(this.title[position]);
        title_2text.setText(this.title_2[position]);
        descriptiontext.setText(this.description[position]);

        //Locate imageview in slidescreen_item.xml
        iconimage = (ImageView) itemView.findViewById(R.id.icon);
        whitebox = (ImageView) itemView.findViewById(R.id.whitebox);
        bgimage = (ImageView) itemView.findViewById(R.id.bgimage);

        //Capture position and set to the Imageview
        bgimage.setBackgroundResource(this.background[position]);
        iconimage.setImageResource(this.icon[position]);
        //Apply font
        Typeface BryantProBold = Typeface.createFromAsset(this.context.getAssets(), "BryantProBold.otf");
        Typeface PFHighwaySansProRegular = Typeface.createFromAsset(this.context.getAssets(), "PFHighwaySansProRegular.ttf");
        titletext.setTypeface(PFHighwaySansProRegular);
        title_2text.setTypeface(PFHighwaySansProRegular);
        descriptiontext.setTypeface(BryantProBold);

        //Apply animations
       translate = new TranslateAnimation(TranslateAnimation.ABSOLUTE, 0f, TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.ABSOLUTE, -48f, TranslateAnimation.ABSOLUTE, 150f);
        translate.setDuration(5000);
        translate.setRepeatCount(-1);
        translate.setRepeatMode(Animation.REVERSE);
        translate.setInterpolator(new LinearInterpolator());
        bgimage.setAnimation(translate);
        slide = new TranslateAnimation(TranslateAnimation.ABSOLUTE, 150f , TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.ABSOLUTE,0f,TranslateAnimation.ABSOLUTE,0f);
        slide.setDuration(3000);
        slide.setInterpolator(new LinearInterpolator());
        whitebox.startAnimation(slide);
        iconimage.startAnimation(slide);
        titletext.startAnimation(slide);
        title_2text.startAnimation(slide);
        descriptiontext.startAnimation(slide);

        ((ViewPager) container).addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //Remove slidescreen_item.xml from viewpager
        ((ViewPager) container).removeView((RelativeLayout) object);
    }

}

