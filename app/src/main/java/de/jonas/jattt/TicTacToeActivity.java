package de.jonas.jattt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public final class TicTacToeActivity extends AppCompatActivity implements View.OnClickListener {

    private final Button[] buttons = new Button[9];


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_tic_tac_toe);

        this.buttons[0] = super.findViewById(R.id.button1);
        this.buttons[1] = super.findViewById(R.id.button2);
        this.buttons[2] = super.findViewById(R.id.button3);
        this.buttons[3] = super.findViewById(R.id.button4);
        this.buttons[4] = super.findViewById(R.id.button5);
        this.buttons[5] = super.findViewById(R.id.button6);
        this.buttons[6] = super.findViewById(R.id.button7);
        this.buttons[7] = super.findViewById(R.id.button8);
        this.buttons[8] = super.findViewById(R.id.button9);

        for (@NonNull final Button button : this.buttons) {
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(final View view) {
    }
}