package com.example.android.cardsgrid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.android.cardsgrid.databinding.ActivityGallerybigBinding;

public class Gallerybig extends AppCompatActivity {
    ImageView bigImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallerybig);
        bigImage=findViewById(R.id.imageView2);
        MyData myData = getIntent().getParcelableExtra("Image");
        ActivityGallerybigBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_gallerybig);
        binding.setMyData(myData);


    }
}
