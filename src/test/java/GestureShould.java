import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GestureShould {
    @Test
    public void give_a_random_gesture() {
        assertThat(Gesture.getRandom()).isIn(Gesture.ROCK, Gesture.PAPER, Gesture.SCISSORS);
    }
}
