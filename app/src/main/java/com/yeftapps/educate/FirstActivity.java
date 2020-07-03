package com.yeftapps.educate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.RelativeLayout;

public class FirstActivity extends AppCompatActivity {

    RelativeLayout notes,ques,book,video,formulae;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        notes = findViewById(R.id.notesRL);
        ques = findViewById(R.id.quesRL);
        book = findViewById(R.id.booksRL);
        video = findViewById(R.id.videoRL);
        formulae = findViewById(R.id.formulaeRL);

        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstActivity.this,SubNotesActivity.class);
                startActivity(i);
            }
        });

        ques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstActivity.this,SubQuesActivity.class);
                startActivity(i);
            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstActivity.this,BookActivity.class);
                startActivity(i);
            }
        });
    }
}
