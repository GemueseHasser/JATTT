package de.jonas.jattt.constant;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public enum WinningOpportunities {

    H_1(
        new Integer[]{
            0,
            1,
            2
        }
    ),
    H_2(
        new Integer[]{
            3,
            4,
            5
        }
    ),
    H_3(
        new Integer[]{
            6,
            7,
            8
        }
    ),
    V_1(
        new Integer[]{
            0,
            3,
            6
        }
    ),
    V_2(
        new Integer[]{
            1,
            4,
            7
        }
    ),
    V_3(
        new Integer[]{
            2,
            5,
            8
        }
    ),
    D_1(
        new Integer[]{
            0,
            4,
            8
        }
    ),
    D_2(
        new Integer[]{
            2,
            4,
            6
        }
    );

    @NotNull
    private final Integer @NotNull [] fields;


    public static boolean hasWon(@NotNull final List<Integer> fields) {
        for (@NotNull final WinningOpportunities opportunity : WinningOpportunities.values()) {
            if (fields.containsAll(Arrays.asList(opportunity.fields))) return true;
        }

        return false;
    }
}
