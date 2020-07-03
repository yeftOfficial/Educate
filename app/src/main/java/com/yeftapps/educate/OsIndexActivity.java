package com.yeftapps.educate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class OsIndexActivity extends AppCompatActivity {

    CardView scheduling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_index);

        scheduling = findViewById(R.id.OS_scheduling_card);

        scheduling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OsIndexActivity.this,OS_scheduling.class);
                startActivity(intent);
            }
        });
    }
}
