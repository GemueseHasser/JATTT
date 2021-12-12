package de.jonas.jattt.constant;

import de.jonas.jattt.R;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PlayType {

    USER(
        R.drawable.img_o
    ),
    BOT(
        R.drawable.img_x
    );


    private final int imageId;
}
