package me.mtron.mobile_application_development_labsheet9.question_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.mtron.mobile_application_development_labsheet9.R;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3, et4, et5, et6, et7;
    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);

        submit_btn = findViewById(R.id.btn1);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayData.class);
                intent.putExtra("NAME", et1.getText().toString());
                intent.putExtra("AGE", et2.getText().toString());
                intent.putExtra("GENDER", et3.getText().toString());
                intent.putExtra("CITY", et4.getText().toString());
                intent.putExtra("MOBILE", et5.getText().toString());
                intent.putExtra("EMAIL", et6.getText().toString());
                intent.putExtra("DEPARTMENT", et7.getText().toString());

                Toast.makeText(MainActivity.this, "Data entered successfully", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

    }
}