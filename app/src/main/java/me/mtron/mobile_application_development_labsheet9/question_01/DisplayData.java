package me.mtron.mobile_application_development_labsheet9.question_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.text.util.Linkify;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet9.R;

public class DisplayData extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        tv1 = findViewById(R.id.tw2);
        tv2 = findViewById(R.id.tw3);
        tv3 = findViewById(R.id.tw4);
        tv4 = findViewById(R.id.tw5);
        tv5 = findViewById(R.id.tw6);
        tv6 = findViewById(R.id.tw7);
        tv7 = findViewById(R.id.tw8);

        Intent intent = getIntent();
        
        tv1.setText("Name: " + intent.getStringExtra("NAME"));
        tv2.setText("Age: " + intent.getStringExtra("AGE"));
        tv3.setText("Gender: " + intent.getStringExtra("GENDER"));
        tv4.setText("City: " + intent.getStringExtra("CITY"));
        tv5.setText("Mobile: " + intent.getStringExtra("MOBILE"));
        tv6.setText("Email: " + intent.getStringExtra("EMAIL"));
        tv7.setText("Department: " + intent.getStringExtra("DEPARTMENT"));

//        Linkify.addLinks(tv6, Linkify.EMAIL_ADDRESSES);
    }
}