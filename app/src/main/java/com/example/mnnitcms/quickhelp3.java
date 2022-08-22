package com.example.mnnitcms;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class quickhelp3 extends AppCompatActivity
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


        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ip_address_schemes);
        TextView all_ip= findViewById(R.id.whole_campus);
        all_ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,PDFActivity.class);
                startActivity(intent);
            }
        });
        TextView dep= findViewById(R.id.departments);
        dep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,Departmentspdf.class);
                startActivity(intent);
            }
        });
        TextView dj_girlsh= findViewById(R.id.dj_girls_hostel);
        dj_girlsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,DJ_GIRLSPDF.class);
                startActivity(intent);
            }
        });
        TextView patel= findViewById(R.id.patel_hostel);
        patel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,PatelPDF.class);
                startActivity(intent);
            }
        });
        TextView tilak= findViewById(R.id.Tilak_hostel);
        tilak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,TilakPDF.class);
                startActivity(intent);
            }
        });
        TextView malviya= findViewById(R.id.Malviya_hostel);
        malviya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,MalviyaPDF.class);
                startActivity(intent);
            }
        });
        TextView tandon= findViewById(R.id.tandon_hostel);
        tandon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,TandonPDF.class);
                startActivity(intent);
            }
        });
        TextView raman= findViewById(R.id.raman_hostel);
        raman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,RamanPDF.class);
                startActivity(intent);
            }
        });
        TextView tagore= findViewById(R.id.tagore_hostel);
        tagore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,Tagorepdf.class);
                startActivity(intent);
            }
        });
        TextView cc= findViewById(R.id.cc);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,CCPDF.class);
                startActivity(intent);
            }
        });
        TextView sms= findViewById(R.id.sms2);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,smsPDF.class);
                startActivity(intent);
            }
        });
        TextView pg= findViewById(R.id.pg_hostel);
        pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,pgPDF.class);
                startActivity(intent);
            }
        });
        TextView king= findViewById(R.id.kingh);
        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,KNGHPDF.class);
                startActivity(intent);
            }
        });
        TextView singh= findViewById(R.id.singhh);
        singh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,SNGHPDF.class);
                startActivity(intent);
            }
        });
        TextView newpg= findViewById(R.id.new_pg);
        newpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,newPGPDF.class);
                startActivity(intent);
            }
        });
        TextView cblock= findViewById(R.id.c_block);
        cblock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,cblockpdf.class);
                startActivity(intent);
            }
        });
        TextView col= findViewById(R.id.colony);
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,colonyPDF.class);
                startActivity(intent);
            }
        });
        TextView wblock= findViewById(R.id.w_block);
        wblock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,wblockpdf.class);
                startActivity(intent);
            }
        });
        TextView bcblock= findViewById(R.id.bc_combine);
        bcblock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,bcblockpdf.class);
                startActivity(intent);
            }
        });
        TextView bfnih= findViewById(R.id.bf_ih);
        bfnih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,bfihpdf.class);
                startActivity(intent);
            }
        });
        TextView edcc= findViewById(R.id.edc);
        edcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,edcpdf.class);
                startActivity(intent);
            }
        });
        TextView dispens= findViewById(R.id.dispensary);
        dispens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,dispensarypdf.class);
                startActivity(intent);
            }
        });
        TextView gblock= findViewById(R.id.gblock);
        gblock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(quickhelp3.this,gblockpdf.class);
                startActivity(intent);
            }
        });



    }
}
