package de.jonas.jattt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public final class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button play = super.findViewById(R.id.play_button);
        play.setOnClickListener(this);
    }

    @Override
    public void onClick(final View view) {

    }

    @Override
    public void onPointerCaptureChanged(final boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}