package com.example.mnnitcms;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] items =  {"Setting I.P. Address on Windows","Setting I.P. Address on Linux","I.P. Address Scheme","Email Related Issues","MSTeams Related Issues"};

    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterItems;

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
        }
        return super.onOptionsItemSelected(item);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button register=findViewById(R.id.registercomplaint);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent init=new Intent(getApplicationContext(),WebActivity.class);
                startActivity(init);
            }
        });

        Button check=findViewById(R.id.checkcompstatus);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent init=new Intent(getApplicationContext(),CheckActivity.class);
                startActivity(init);
            }
        });
        Button login=findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent init=new Intent(getApplicationContext(),loginActivity.class);
                startActivity(init);
            }
        });
        Button dashb=findViewById(R.id.dashboard);
        dashb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent init=new Intent(getApplicationContext(),dashboardActivity.class);
                startActivity(init);
            }
        });


        autoCompleteTxt = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(this,R.layout.dropdown_item,items);
        autoCompleteTxt.setAdapter(adapterItems);


        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                if(item.equals("Setting I.P. Address on Windows"))
                {
                    Intent init=new Intent(getApplicationContext(),quickhelp1.class);
                    startActivity(init);
                }
                else if(item.equals("Setting I.P. Address on Linux"))
                {
                    Intent init=new Intent(getApplicationContext(),quickhelp2.class);
                    startActivity(init);
                }
                else if(item.equals("I.P. Address Scheme"))
                {
                    Intent init=new Intent(getApplicationContext(),quickhelp3.class);
                    startActivity(init);
                }
                else if(item.equals("Email Related Issues"))
                {
                    startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:helpemail@mnnit.ac.in")));
//                    Intent init=new Intent(getApplicationContext(),quickhelp4.class);
//                    startActivity(init);
                }
                else if(item.equals("MSTeams Related Issues"))
                {
                    startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:helpmsteams@mnnit.ac")));
//                    Intent init=new Intent(getApplicationContext(),quickhelp5.class);
//                    startActivity(init);
                }

                //Toast.makeText(getApplicationContext(),"Item: "+item, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void gotoUrl(String s)
    {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}