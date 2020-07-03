package com.yeftapps.educate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Ques_C_Pointer extends AppCompatActivity {

    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6;
    TextView ans1,ans2,ans3,ans4,ans5,ans6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_c__pointer);

        initialise();

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ans1.setVisibility(View.VISIBLE);
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ans2.setVisibility(View.VISIBLE);
            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ans3.setVisibility(View.VISIBLE);
            }
        });

        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ans4.setVisibility(View.VISIBLE);
            }
        });

        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ans5.setVisibility(View.VISIBLE);
            }
        });

        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ans6.setVisibility(View.VISIBLE);
            }
        });

    }

    private void initialise() {

        radioGroup1 = findViewById(R.id.C_rg1);
        radioGroup2 = findViewById(R.id.C_rg2);
        radioGroup3 = findViewById(R.id.C_rg3);
        radioGroup4 = findViewById(R.id.C_rg4);
        radioGroup5 = findViewById(R.id.C_rg5);
        radioGroup6 = findViewById(R.id.C_rg6);

        ans1 = findViewById(R.id.answerC_TV1);
        ans2 = findViewById(R.id.answerC_TV2);
        ans3 = findViewById(R.id.answerC_TV3);
        ans4 = findViewById(R.id.answerC_TV4);
        ans5 = findViewById(R.id.answerC_TV5);
        ans6 = findViewById(R.id.answerC_TV6);

    }


}
