package com.utkarsh.my_freak_kk;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Splash extends AppCompatActivity {
    TextView tv_apptitle;
//    declare the typeface for varibable for font change

    Typeface typeface_baloo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        //initialization of variables
        tv_apptitle=findViewById(R.id.tv_apptitle);

        //initialization of font face
        typeface_baloo=Typeface.createFromAsset(getAssets(),"fonts/baloo.ttf");

//        attach the typeface to textview

        tv_apptitle.setTypeface(typeface_baloo);


        // to navigate to the login after 2 sec
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                to navigate to login page
                startActivity(new Intent(Splash.this,Login.class));
            }
        }, 2000);
    }
}