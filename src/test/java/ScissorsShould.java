import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScissorsShould {

    @Test
    public void beat_paper() {
        assertThat(Gesture.SCISSORS.against(Gesture.PAPER)).isEqualTo("Scissors defeats Paper");
    }

    @Test
    public void lose_against_rock() {
        assertThat(Gesture.SCISSORS.against(Gesture.ROCK)).isEqualTo("Rock defeats Scissors");
    }

    @Test
    public void tie_against_scissors() {
        assertThat(Gesture.SCISSORS.against(Gesture.SCISSORS)).isEqualTo("Draw");
    }

}
