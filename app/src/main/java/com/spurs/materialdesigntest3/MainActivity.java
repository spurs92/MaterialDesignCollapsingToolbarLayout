package com.spurs.materialdesigntest3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    ImageView imgToolbar;
    ImageView img01,img02,img03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("SAM");
        actionBar.setDisplayHomeAsUpEnabled(true);

        imgToolbar=(ImageView)findViewById(R.id.img_toolbar);
        img01=(ImageView) findViewById(R.id.img01);
        img02=(ImageView) findViewById(R.id.img02);
        img03=(ImageView) findViewById(R.id.img03);

        //res폴더 창고관리자 객체 얻어오기..
        Resources res=getResources();
        InputStream is=null;

        is=res.openRawResource(R.raw.bg);
        Bitmap bm= BitmapFactory.decodeStream(is);
        imgToolbar.setImageBitmap(bm);

        is=res.openRawResource(R.raw.a_lion);
        bm= BitmapFactory.decodeStream(is);
        img01.setImageBitmap(bm);

        is=res.openRawResource(R.raw.a_monkey);
        bm= BitmapFactory.decodeStream(is);
        img02.setImageBitmap(bm);

        is=res.openRawResource(R.raw.a_pig);
        bm= BitmapFactory.decodeStream(is);
        img03.setImageBitmap(bm);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
