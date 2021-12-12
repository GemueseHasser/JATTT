package de.jonas.jattt;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public final class TicTacToeActivity extends AppCompatActivity implements View.OnClickListener {

    private final ImageView[] views = new ImageView[9];


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_tic_tac_toe);

        this.views[0] = super.findViewById(R.id.field_1);
        this.views[1] = super.findViewById(R.id.field_2);
        this.views[2] = super.findViewById(R.id.field_3);
        this.views[3] = super.findViewById(R.id.field_4);
        this.views[4] = super.findViewById(R.id.field_5);
        this.views[5] = super.findViewById(R.id.field_6);
        this.views[6] = super.findViewById(R.id.field_7);
        this.views[7] = super.findViewById(R.id.field_8);
        this.views[8] = super.findViewById(R.id.field_9);

        for (@NonNull final ImageView view : this.views) {
            view.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(final View view) {
    }
}