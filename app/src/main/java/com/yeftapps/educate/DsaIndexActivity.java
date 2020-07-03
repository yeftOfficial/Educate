package com.yeftapps.educate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class DsaIndexActivity extends AppCompatActivity {

    CardView intro,recursion,sort,greedy,tree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsa_index);

        recursion = findViewById(R.id.recursionCard);
        sort = findViewById(R.id.sortCard);
        intro = findViewById(R.id.DSAintroCard);
        greedy = findViewById(R.id.greedyCard);
        tree = findViewById(R.id.treeCard);

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DsaIndexActivity.this,DSA_Introduction.class);
                startActivity(intent);
            }
        });

        greedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DsaIndexActivity.this,DSA_greedy.class);
                startActivity(intent);
            }
        });
        recursion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DsaIndexActivity.this,DSA_recursion.class);
                startActivity(intent);
            }
        });

        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(DsaIndexActivity.this,DSAsortActivity.class);
                startActivity(intent);
            }
        });

        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(DsaIndexActivity.this,DSA_tree.class);
                startActivity(intent);
            }
        });
    }
}
