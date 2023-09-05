package com.examp.wabbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);

        WebViewClient webViewClient=new WebViewClient();
        webView.setWebViewClient(webViewClient);
        webView.loadUrl("https://www.youtube.com/");


        webView1 = findViewById(R.id.webView1);

        webView1.setWebViewClient(webViewClient);
        webView1.getSettings().setJavaScriptEnabled(true);

        webView1.loadUrl("https://www.facebook.com/");


    }
}