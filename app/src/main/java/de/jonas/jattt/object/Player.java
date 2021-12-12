package de.jonas.jattt.object;

import android.view.View;
import androidx.annotation.IntRange;
import de.jonas.jattt.constant.PlayerType;
import de.jonas.jattt.constant.WinningOpportunities;
import de.jonas.jattt.handler.GameHandler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public final class Player {

    @Getter
    @NotNull
    private final List<Integer> fields = new ArrayList<>();
    @NotNull
    private final PlayerType type;


    public void press(
        @NotNull final View view,
        @IntRange(from = 0, to = Integer.MAX_VALUE) final int field
    ) {
        // check if game is running
        if (GameHandler.INSTANCE.isGameRunning()) return;

        // check if player has turn
        if (GameHandler.INSTANCE.getCurrent() != this.type) return;

        // check if field is already placed
        if (GameHandler.INSTANCE.getBot().getFields().contains(field)
            || GameHandler.INSTANCE.getUser().getFields().contains(field)) return;

        // render image
        view.setBackgroundResource(this.type.getImageId());

        // add field to placed fields
        this.fields.add(field);

        // check if player has won
        if (WinningOpportunities.hasWon(this.fields)) {
            win();
            GameHandler.INSTANCE.setGameRunning(false);
            return;
        }

        // finish
        GameHandler.INSTANCE.finishCurrentPlayer();
    }

    private void win() {
        System.out.println("win");
    }

}
