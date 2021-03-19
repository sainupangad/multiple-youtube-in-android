package com.ZainuSchool;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView w1,w2,w3,w4;
    ImageView A1,A2,A3,A4,B1,B2,B3,B4,C1,C2,C3,C4,D1,D2,D3,D4;
    String ALL;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w1=findViewById(R.id.wb1);
        w2=findViewById(R.id.wb2);
        w3=findViewById(R.id.wb3);
        w4=findViewById(R.id.wb4);

        A1=findViewById(R.id.a1);
        A2=findViewById(R.id.a2);
        A3=findViewById(R.id.a3);
        A4=findViewById(R.id.a4);
        B1=findViewById(R.id.b1);
        B2=findViewById(R.id.b2);
        B3=findViewById(R.id.b3);
        B4=findViewById(R.id.b4);
        C1=findViewById(R.id.c1);
        C2=findViewById(R.id.c2);
        C3=findViewById(R.id.c3);
        C4=findViewById(R.id.c4);
        D1=findViewById(R.id.d1);
        D2=findViewById(R.id.d2);
        D3=findViewById(R.id.d3);
        D4=findViewById(R.id.d4);



        w1.getSettings().setJavaScriptEnabled(true);
        w1.setWebChromeClient(new WebChromeClient());
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl("https://www.youtube.com/watch?v=zcrUCvBD16k");



        w2.getSettings().setJavaScriptEnabled(true);
        w2.setWebChromeClient(new WebChromeClient());
        w2.setWebViewClient(new WebViewClient());
        w2.loadUrl("https://www.youtube.com/watch?v=t_3rHQtjy-o");

        w3.getSettings().setJavaScriptEnabled(true);
        w3.setWebChromeClient(new WebChromeClient());
        w3.setWebViewClient(new WebViewClient());
        w3.loadUrl("https://www.youtube.com/watch?v=jjH6v95z3Nw");

        w4.getSettings().setJavaScriptEnabled(true);
        w4.setWebChromeClient(new WebChromeClient());
        w4.setWebViewClient(new WebViewClient());
        w4.loadUrl("https://www.youtube.com/watch?v=d1iwUB9YFnA");

        Intent i = new Intent(MainActivity.this,MainActivity2.class);


        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/zcrUCvBD16k";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/zcrUCvBD16k";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/zcrUCvBD16k";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/zcrUCvBD16k";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/iL53Y28Rp84";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/iL53Y28Rp84";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/iL53Y28Rp84";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/iL53Y28Rp84";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/jjH6v95z3Nw";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/jjH6v95z3Nw";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/jjH6v95z3Nw";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/jjH6v95z3Nw";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/d1iwUB9YFnA";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/d1iwUB9YFnA";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/d1iwUB9YFnA";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });
        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL ="https://youtu.be/d1iwUB9YFnA";

                i.putExtra("w1",ALL);
                startActivity(i);
                finish();

            }
        });










    }



}
