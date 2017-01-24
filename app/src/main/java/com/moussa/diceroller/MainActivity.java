package com.moussa.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button rButton = null;
    ImageView diceImg = null;
    LinearLayout result = null;
    ThreeDice setOfDice = null;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    TextView scoreResult;
    String scoreText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setOfDice = new ThreeDice();
        img1 = (ImageView) findViewById(R.id.diceOneImg);
        img2 = (ImageView) findViewById(R.id.diceTwoImg);
        img3 = (ImageView) findViewById(R.id.diceTheeImg);
        rButton = (Button) findViewById(R.id.rollButton);
        diceImg = (ImageView) findViewById(R.id.diceImg);
        result =   (LinearLayout) findViewById(R.id.theResult);
        scoreResult = (TextView) findViewById(R.id.scoreText);
        scoreText = "";

        rButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setOfDice.roll();
                diceImg.setVisibility(View.GONE);
                img1.setImageResource(setOfDice.getFaceImgValues()[0]);
                img2.setImageResource(setOfDice.getFaceImgValues()[1]);
                img3.setImageResource(setOfDice.getFaceImgValues()[2]);
                scoreText = "Round score: "+ String.valueOf(setOfDice.getRollScore());
                scoreResult.setText(scoreText);
                scoreResult.setVisibility(View.VISIBLE);
                result.setVisibility(View.VISIBLE);

            }
        });





    }
}
