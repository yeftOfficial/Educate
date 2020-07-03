package com.yeftapps.educate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class DmIndexActivity extends AppCompatActivity {

    CardView proposition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm_index);

        proposition = findViewById(R.id.DM_proposition_card);

        proposition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DmIndexActivity.this,DM_proposition.class);
                startActivity(intent);
            }
        });
    }
}
