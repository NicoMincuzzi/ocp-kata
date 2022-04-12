import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    public void gutterGame() {
        BowlingGame game = new BowlingGameFactory().create();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    public void allOnesGame() {
        BowlingGame game = new BowlingGameFactory().create();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

    @Test
    public void oneSpare() {
        BowlingGame game = new BowlingGameFactory().create();
        game.roll(5);
        game.roll(5);
        game.roll(3);
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertEquals(16, game.score());
    }

    @Test
    public void spareInTheLastRoll() {
        BowlingGame game = new BowlingGameFactory().create();
        for (int i = 0; i < 18; i++) {
            game.roll(1);
        }
        game.roll(5);
        game.roll(5);
        game.roll(3);
        assertEquals(31, game.score());
    }

    @Test
    public void oneStrike() {
        BowlingGame game = new BowlingGameFactory().create();
        game.roll(10);
        game.roll(3);
        game.roll(4);
        for (int i = 0; i < 16; i++) {
            game.roll(0);
        }
        assertEquals(24, game.score());
    }

    @Test
    public void strikeInTheLastRoll() {
        BowlingGame game = new BowlingGameFactory().create();
        for (int i = 0; i < 18; i++) {
            game.roll(1);
        }
        game.roll(10);
        game.roll(5);
        game.roll(3);
        assertEquals(36, game.score());
    }

    @Test
    public void allStrike() {
        BowlingGame game = new BowlingGameFactory().create();
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        assertEquals(300, game.score());
    }

    @Test
    public void strikePlusSparePlusNormalRoll() {
        BowlingGame game = new BowlingGameFactory().create();
        game.roll(10);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(1);
        for (int i = 0; i < 14; i++) {
            game.roll(0);
        }
        assertEquals(41, game.score());
    }

    @Test
    public void sparePlusSparePlusNormalRoll() {
        BowlingGame game = new BowlingGameFactory().create();
        game.roll(6);
        game.roll(4);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(1);
        for (int i = 0; i < 14; i++) {
            game.roll(0);
        }
        assertEquals(36, game.score());
    }

    @Test
    public void strikePlusStrikePlusNormalRoll() {
        BowlingGame game = new BowlingGameFactory().create();
        game.roll(10);
        game.roll(10);
        game.roll(2);
        game.roll(6);
        for (int i = 0; i < 13; i++) {
            game.roll(0);
        }
        assertEquals(48, game.score());
    }

    @Test
    public void strikePlusStrikePlusSparePlusNormalRoll() {
        BowlingGame game = new BowlingGameFactory().create();
        game.roll(10);
        game.roll(10);
        game.roll(4);
        game.roll(6);
        game.roll(4);
        game.roll(3);
        for (int i = 0; i < 11; i++) {
            game.roll(0);
        }
        assertEquals(65, game.score());
    }
}
