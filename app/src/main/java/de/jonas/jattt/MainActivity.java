package de.jonas.jattt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public final class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        final Button play = super.findViewById(R.id.play_button);
        play.setOnClickListener(this);
    }

    @Override
    public void onClick(final View view) {
        final Intent ticTacToe = new Intent(this, TicTacToeActivity.class);
        super.finish();
        super.startActivity(ticTacToe);
    }
}