package de.jonas.jattt.handler;

import de.jonas.jattt.constant.PlayerType;
import de.jonas.jattt.object.Player;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import static de.jonas.jattt.constant.PlayerType.BOT;
import static de.jonas.jattt.constant.PlayerType.USER;

public final class GameHandler {

    public static final GameHandler INSTANCE = new GameHandler();


    @Getter
    @NotNull
    private final Player user = new Player(USER);
    @Getter
    @NotNull
    private final Player bot = new Player(BOT);

    @Getter
    @NotNull
    private PlayerType current = USER;
    @Getter
    @Setter
    private boolean gameRunning = true;


    public void finishCurrentPlayer() {
        this.current = this.current.getOpposite();
    }
}
