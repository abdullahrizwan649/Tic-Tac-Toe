package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    int flag;
    int count;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String player;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();
        initialize();


//update


    }

    private void initialize() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        result = findViewById(R.id.result_txt);
    }

    @SuppressLint("SetTextI18n")
    public void Check(View view) {
        Button btnCurrent = (Button) view;
        count++;

        if(flag == 0)
        {
            result.setText("PLAYER 1's\n     TURN");
        }else{
            result.setText("PLAYER 2's\n     TURN");
        }

        if (flag == 0) {
            btnCurrent.setText("X");
            btnCurrent.setClickable(false);
            flag = 1;
        } else {
            btnCurrent.setText("O");
            btnCurrent.setClickable(false);
            flag = 0;
        }

        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            //Conditions


            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                if (b1.equals("X")) {
                    player = "PLAYER 1";
                } else {
                    player = "PLAYER 2";
                }
                result.setText(player + " WINS");

            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                if (b4.equals("X")) {
                    player = "PLAYER 1";
                } else {
                    player = "PLAYER 2";
                }
                result.setText(player + " WINS");


            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                if (b7.equals("X")) {
                    player = "PLAYER 1";
                } else {
                    player = "PLAYER 2";
                }
                result.setText(player + " WINS");


            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                if (b1.equals("X")) {
                    player = "PLAYER 1";
                } else {
                    player = "PLAYER 2";
                }
                result.setText(player + " WINS");


            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                if (b2.equals("X")) {
                    player = "PLAYER 1";
                } else {
                    player = "PlAYER 2";
                }
                result.setText(player + " WINS");


            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                if (b3.equals("X")) {
                    player = "PLAYER 1";
                } else {
                    player = "PLAYER 2";
                }
                result.setText(player + " WINS");


            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                if (b1.equals("X")) {
                    player = "PLAYER 1";
                } else {
                    player = "PLAYER 2";
                }
                result.setText(player + " WINS");


            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                if (b3.equals("X")) {
                    player = "PLAYER 1";
                } else {
                    player = "PLAYER 2";
                }
                result.setText(player + " WINS");


            } else if (count == 9) {
               result.setText("DRAW");
            }
        }

    }


    public void newGame(View view) {

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        result.setText("PLAYER 1\n   TURN");
        flag = 0;
        count = 0;

    }
}