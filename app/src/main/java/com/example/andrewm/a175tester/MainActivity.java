package com.example.andrewm.a175tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int nuumber = getIntent().getIntExtra("number", 3);

        Text1 = (TextView)findViewById(R.id.text1);

        Text1.setText(Integer.toString(nuumber));

    }
}
