package com.example.andrewm.a175tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView Text1;
    TextView DiceText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int nuumber = getIntent().getIntExtra("number", 3);

        //Text1 = (TextView)findViewById(R.id.text1);

        //Text1.setText(Integer.toString(nuumber));

    }

    public void D6Message(View view) {
        rollDice(6);
    }

    public void rollDice(int dice){
        Random random  = new Random();
        int result = random.nextInt(dice) + 1;
        Text1 = (TextView)findViewById(R.id.TxtDiceResult);
        DiceText = (TextView)findViewById(R.id.TxtDice);

        Text1.setText(Integer.toString(result));
        DiceText.setText(getString(R.string.dice_roll,dice));
                //"Result from rolling a D" + Integer.toString(dice));
    }

    public void D8Message(View view) {
        rollDice(8);
    }

    public void D20Message(View view) {
        rollDice(20);
    }

    public void D10Message(View view) {
        rollDice(10);
    }

    public void D12Message(View view) {
        rollDice(12);
    }

    public void D4Message(View view) {
        rollDice(4);
    }
}
