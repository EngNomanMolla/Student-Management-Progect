package com.example.studentmanagementproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView createCardView,viewCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT>=21){
            Window window=getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.statusbarcolor));
        }

        createCardView=findViewById(R.id.createCardViewId);
        viewCardView=findViewById(R.id.viewCardViewId);
        viewCardView.setOnClickListener(this);
        createCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.createCardViewId){
            Intent intent=new Intent(MainActivity.this,RegistationActivity.class);
            startActivity(intent);

        }
        if (v.getId()==R.id.viewCardViewId){
            Intent intent=new Intent(MainActivity.this, ViewActivity.class);
            startActivity(intent);

        }
    }
}
