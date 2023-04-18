package com.scc.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.scc.architecture.databinding.ActivityMainBinding;
import com.scc.mvvm.mvc.controller.MVCLoginActivity;
import com.scc.mvvm.mvp.view.MVPLoginActivity;
import com.scc.mvvm.mvvm.view.MVVMLoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding mainBinding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        mainBinding.btnMvc.setOnClickListener(this);
        mainBinding.btnMvp.setOnClickListener(this);
        mainBinding.btnMvvm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_mvc:
                startActivity(new Intent(this, MVCLoginActivity.class));
                break;
            case R.id.btn_mvp:
                startActivity(new Intent(this, MVPLoginActivity.class));
                break;
            case R.id.btn_mvvm:
                startActivity(new Intent(this, MVVMLoginActivity.class));
                break;
        }
    }
}