import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RockShould {

    @Test
    public void lose_against_paper() {
        assertThat(Gesture.ROCK.against(Gesture.PAPER)).isEqualTo("Paper defeats Rock");
    }

    @Test
    public void tie_against_rock() {
        assertThat(Gesture.ROCK.against(Gesture.ROCK)).isEqualTo("Draw");
    }

    @Test
    public void beat_scissors() {
        assertThat(Gesture.ROCK.against(Gesture.SCISSORS)).isEqualTo("Rock defeats Scissors");
    }
}
