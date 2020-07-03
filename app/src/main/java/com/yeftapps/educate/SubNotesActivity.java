package com.yeftapps.educate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

import android.view.View;

public class SubNotesActivity extends AppCompatActivity {

    CardView CNcardview,DSAcardview,OScardview,COMPILERcardview,PROGcardview,
            DELDcardview,TOCcardview,EMcardview,DMcardview,DBMScardview,COAcardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_notes);

        COAcardview=findViewById(R.id.coaCard);
        CNcardview=findViewById(R.id.cnCard);
        DSAcardview=findViewById(R.id.dsaCard);
        OScardview=findViewById(R.id.osCard);
        COMPILERcardview=findViewById(R.id.compilerCard);
        DELDcardview=findViewById(R.id.deldCard);
        TOCcardview=findViewById(R.id.tocCard);
        EMcardview=findViewById(R.id.emCard);
        DMcardview=findViewById(R.id.dmCard);
        DBMScardview=findViewById(R.id.dbmsCard);
        PROGcardview=findViewById(R.id.progCard);

        CNcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,cnIndexActivity.class);
                startActivity(i);
            }
        });

        COAcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,coaIndexActivity.class);
                startActivity(i);
            }
        });

        DSAcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,DsaIndexActivity.class);
                startActivity(i);
            }
        });
        OScardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,OsIndexActivity.class);
                startActivity(i);
            }
        });

        COMPILERcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,CompilerIndexActivity.class);
                startActivity(i);
            }
        });

        DELDcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,DeldIndexActivity.class);
                startActivity(i);
            }
        });

        TOCcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,TocIndexActivity.class);
                startActivity(i);
            }
        });

        EMcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,EmIndexActivity.class);
                startActivity(i);
            }
        });

        DMcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,DmIndexActivity.class);
                startActivity(i);
            }
        });

        PROGcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,ProgIndexActivity.class);
                startActivity(i);
            }
        });

        DBMScardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubNotesActivity.this,DbmsIndexActivity.class);
                startActivity(i);
            }
        });
    }
}
