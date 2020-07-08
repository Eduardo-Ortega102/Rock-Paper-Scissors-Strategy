import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PaperShould {

    @Test
    public void tie_against_paper() {
        assertThat(Gesture.PAPER.against(Gesture.PAPER)).isEqualTo("Draw");
    }

    @Test
    public void beat_rock() {
        assertThat(Gesture.PAPER.against(Gesture.ROCK)).isEqualTo("Paper defeats Rock");
    }

    @Test
    public void lose_against_scissors() {
        assertThat(Gesture.PAPER.against(Gesture.SCISSORS)).isEqualTo("Scissors defeats Paper");
    }
}
