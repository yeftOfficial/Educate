package com.yeftapps.educate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class TocIndexActivity extends AppCompatActivity {

    CardView fa,cfl,rl,pda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toc_index);

        fa = findViewById(R.id.finiteAutomataCard);
        pda = findViewById(R.id.pdaCard);
        rl = findViewById(R.id.regularLangCard);
        cfl = findViewById(R.id.CFLcard);

        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TocIndexActivity.this,TOC_finiteAutomata.class);
                startActivity(intent);
            }
        });

        pda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TocIndexActivity.this,TOC_PDA.class);
                startActivity(intent);
            }
        });

        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TocIndexActivity.this,TOC_rl.class);
                startActivity(intent);
            }
        });

        cfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TocIndexActivity.this,TOC_CFL.class);
                startActivity(intent);
            }
        });
    }
}
