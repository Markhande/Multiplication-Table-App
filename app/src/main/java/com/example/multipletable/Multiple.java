package com.example.multipletable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Multiple extends AppCompatActivity {
    EditText Et_text;
    Button button;
    TextView Text_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiple);

        Et_text = findViewById(R.id.inputText);
        Text_view = findViewById(R.id.outputText);
        button = findViewById(R.id.submitButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String numberString = Et_text.getText().toString();
                    int number = Integer.parseInt(numberString);

                    StringBuilder result = new StringBuilder();

                    for (int i = 1; i <= 10; i++) {
                        result.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
                    }

                    Text_view.setText(result.toString());
                } catch (NumberFormatException e) {
                    Text_view.setText("Please enter a valid number");
                } catch (Exception e) {
                    Text_view.setText("An error occurred");
                }

            }
        });
    }
}