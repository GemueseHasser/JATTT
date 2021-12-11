package de.jonas.jattt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public final class TicTacToeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_tic_tac_toe);
    }
}