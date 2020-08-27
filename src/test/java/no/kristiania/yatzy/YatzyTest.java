package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] {1, 1, 2, 1, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[] {6, 5, 2, 1, 1}));

    }

    @Test
    void shouldScoreTwos(){
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[] {3, 2, 2, 6, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[] {1, 4, 4, 2, 1}));

    }
    @Test
    void shouldScorePair() {
        assertEquals(10, yatzyGame.score(YatzyCategory.PAIR, new int[] {1, 2 ,5, 5, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[] {1, 6 ,3, 6, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[] {1, 5 ,5, 6, 6}));
    }

}
