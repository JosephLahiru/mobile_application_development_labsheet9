package me.mtron.mobile_application_development_labsheet9.question_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet9.R;

public class MainActivity extends AppCompatActivity {

    Button n0_btn, n1_btn, n2_btn, n3_btn, n4_btn, n5_btn, n6_btn, n7_btn, n8_btn, n9_btn;
    Button add_btn, sub_btn, clear_btn, mul_btn, div_btn, eq_btn;
    TextView display;

    StringBuilder currentInput = new StringBuilder();
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        display = findViewById(R.id.textView2);

        n0_btn = findViewById(R.id.n0_btn);
        n1_btn = findViewById(R.id.n1_btn);
        n2_btn = findViewById(R.id.n2_btn);
        n3_btn = findViewById(R.id.n3_btn);
        n4_btn = findViewById(R.id.n4_btn);
        n5_btn = findViewById(R.id.n5_btn);
        n6_btn = findViewById(R.id.n6_btn);
        n7_btn = findViewById(R.id.n7_btn);
        n8_btn = findViewById(R.id.n8_btn);
        n9_btn = findViewById(R.id.n9_btn);
        add_btn = findViewById(R.id.add_btn);
        sub_btn = findViewById(R.id.sub_btn);
        clear_btn = findViewById(R.id.clr_btn);
        mul_btn = findViewById(R.id.multi_btn);
        div_btn = findViewById(R.id.div_btn);
        eq_btn = findViewById(R.id.eq_btn);

        n0_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("0");
                display.setText(currentInput.toString());
            }
        });

        n1_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("1");
                display.setText(currentInput.toString());
            }
        });

        n2_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("2");
                display.setText(currentInput.toString());
            }
        });

        n3_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("3");
                display.setText(currentInput.toString());
            }
        });

        n4_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("4");
                display.setText(currentInput.toString());
            }
        });

        n5_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("5");
                display.setText(currentInput.toString());
            }
        });

        n6_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("6");
                display.setText(currentInput.toString());
            }
        });

        n7_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("7");
                display.setText(currentInput.toString());
            }
        });

        n8_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("8");
                display.setText(currentInput.toString());
            }
        });

        n9_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.append("9");
                display.setText(currentInput.toString());
            }
        });

        add_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = "/+";
                currentInput.append(operator);
                display.setText(currentInput.toString());
            }
        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = "-";
                currentInput.append(operator);
                display.setText(currentInput.toString());
            }
        });

        mul_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = "/*";
                currentInput.append(operator);
                display.setText(currentInput.toString());
            }
        });

        div_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = "/";
                currentInput.append(operator);
                display.setText(currentInput.toString());
            }
        });

        eq_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String[] parts = currentInput.toString().split(operator);
                double num1 = Double.parseDouble(parts[0]);
                double num2 = Double.parseDouble(parts[1]);
                double result;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            display.setText("Error: Division by zero");
                            return;
                        }
                        break;
                    default:
                        result = 0;
                        break;
                }
                display.setText(String.valueOf(result));
            }
        });

        clear_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentInput.setLength(0);
                operator = "";
                display.setText("");
            }
        });
    }
}

