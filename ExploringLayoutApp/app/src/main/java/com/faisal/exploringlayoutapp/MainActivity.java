package com.faisal.exploringlayoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        TextView t = findViewById(R.id.textView);
        t.setText("Enter Text Below");
    }

    //When pressing the button
    public void changeTextView(View view) {
        TextView t = findViewById(R.id.textView);
        EditText e = findViewById(R.id.textInput);

        t.setText(String.format("Hej, %s", e.getText()));
    }

    void loadConstraintLayout(View view) {
        setContentView(R.layout.activity_main);
    }

    void loadTableLayout(View view) {
        setContentView(R.layout.my_table_layout);
    }
}
