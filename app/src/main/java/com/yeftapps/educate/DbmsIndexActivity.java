package com.yeftapps.educate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class DbmsIndexActivity extends AppCompatActivity {

    CardView normalization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms_index);

        normalization = findViewById(R.id.DBMSnormalcard);

        normalization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DbmsIndexActivity.this,DBMS_normalisation.class);
                startActivity(intent);
            }
        });
    }
}
