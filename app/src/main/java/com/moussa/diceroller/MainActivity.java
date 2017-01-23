package com.moussa.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button rButton = null;
    ImageView diceImg = null;
    LinearLayout result = null;
    //Die die1, die2, die3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting the roll
        //die1 = new Die
        rButton = (Button) findViewById(R.id.rollButton);
        diceImg = (ImageView) findViewById(R.id.diceImg);
        result =   (LinearLayout) findViewById(R.id.theResult);

        rButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                diceImg.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
            }
        });





    }
}
