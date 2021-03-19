package com.ZainuSchool;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    WebView V2;
    ImageView Back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        V2 = findViewById(R.id.v2);
        Back = findViewById(R.id.goBack);
        String F1 = getIntent().getStringExtra("w1");
        V2.loadUrl(F1);
        V2.setWebViewClient(new WebViewClient());
        V2.setWebChromeClient(new WebChromeClient());
        V2.getSettings().setJavaScriptEnabled(true);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });






    }
}