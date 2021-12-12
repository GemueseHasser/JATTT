package de.jonas.jattt.listener;

import android.view.View;
import androidx.annotation.IntRange;
import de.jonas.jattt.handler.GameHandler;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public final class ClickListener implements View.OnClickListener {

    @IntRange(from = 0, to = Integer.MAX_VALUE)
    private final int field;

    @Override
    public void onClick(@NotNull final View view) {
        GameHandler.INSTANCE.getUser().press(view, this.field);
    }
}
