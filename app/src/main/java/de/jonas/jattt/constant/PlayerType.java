package de.jonas.jattt.constant;

import androidx.annotation.IntRange;
import de.jonas.jattt.R;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public enum PlayerType {

    USER(
        R.drawable.img_o
    ),
    BOT(
        R.drawable.img_x
    );


    @Getter
    @IntRange(from = 0, to = Integer.MAX_VALUE)
    private final int imageId;


    @NotNull
    public PlayerType getOpposite() {
        if (this == USER) return BOT;

        return USER;
    }
}
