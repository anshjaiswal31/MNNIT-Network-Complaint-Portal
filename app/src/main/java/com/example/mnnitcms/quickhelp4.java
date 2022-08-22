package com.example.mnnitcms;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class quickhelp4 extends AppCompatActivity
{
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.super_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.back_menu:
                onBackPressed();
                break;
            case R.id.refresh_menu:
                web.reload();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        web= findViewById(R.id.websiteview);
        web.setWebViewClient(new WebViewClient());

        WebSettings webs = web.getSettings();
        webs.setJavaScriptEnabled(true);
        web.loadUrl("mailto:helpemail@mnnit.ac.in");

    }
    public void onBackPressed()
    {
        if(web.canGoBack())
        {
            web.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
