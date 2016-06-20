package com.carturo8824.petagram;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mikhaellopez.circularimageview.CircularImageView;

public class Acerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarAcerca);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CircularImageView circularImageView = (CircularImageView)findViewById(R.id.imgFotoAcerca);
// Set Border
        //circularImageView.setBorderColor(getResources().getColor(R.color.GrayLight));
        circularImageView.setBorderWidth(10);
// Add Shadow with default param
        circularImageView.addShadow();
// or with custom param
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.RED);
    }
}
