package com.example.mnnitcms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DJ_GIRLSPDF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        PDFView pdfview=findViewById(R.id.pdfview);
        pdfview.fromAsset("3.DJ_GIRLS_HOSTEL.pdf").load();
    }
}