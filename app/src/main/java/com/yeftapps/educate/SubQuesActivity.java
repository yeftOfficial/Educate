package com.yeftapps.educate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class SubQuesActivity extends AppCompatActivity {

    CardView C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_ques);

        C = findViewById(R.id.C_ques_Card);

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubQuesActivity.this, Ques_C_Pointer.class);
                startActivity(intent);
            }
        });
    }
}
