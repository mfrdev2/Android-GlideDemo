package com.frabbi.glidedemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.frabbi.glidedemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private String imgLink = "https://www.pexels.com/photo/7396/download/";
    private String imgLink2 = "https://unsplash.com/photos/cYpqYxGeqts/download?ixid=MnwxMjA3fDB8MXxzZWFyY2h8NXx8ZnJlZXx8MHx8fHwxNjM1MjY0NDgx&force=true";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        Glide.with(this)
                .load(imgLink).override(250)
                .into(mBinding.imageView);

        Glide.with(this)
                .load(imgLink).override(250)
                .fitCenter()
                .centerCrop()
                .circleCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(mBinding.imageView2);
    }
}