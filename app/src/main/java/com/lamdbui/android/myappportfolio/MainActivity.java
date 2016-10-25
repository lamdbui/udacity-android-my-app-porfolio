package com.lamdbui.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mPopularMoviesButton;
    private Button mStockHawkButton;
    private Button mBuildItBiggerButton;
    private Button mMakeYourAppMaterialButton;
    private Button mGoUbiquitousButton;
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopularMoviesButton = (Button) findViewById(R.id.popular_movies_button);
        mPopularMoviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAppToast("Popular Movies");
            }
        });
        mStockHawkButton = (Button) findViewById(R.id.stock_hawl_button);
        mStockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAppToast("Stock Hawk");
            }
        });
        mBuildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAppToast("Build it Bigger");
            }
        });
        mMakeYourAppMaterialButton = (Button) findViewById(R.id.make_your_app_material_button);
        mMakeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAppToast("Make Your App Material");
            }
        });
        mGoUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_button);
        mGoUbiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAppToast("Go Ubiquitous");
            }
        });
        mCapstoneButton = (Button) findViewById(R.id.capstone_button);
        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAppToast("Capstone");
            }
        });
    }

    private void generateAppToast(String appName) {
        Toast.makeText(this, getString(R.string.toast_text, appName), Toast.LENGTH_SHORT).show();
    }
}
