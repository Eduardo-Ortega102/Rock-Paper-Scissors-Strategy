import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScissorsShould {

    @Test
    public void beat_paper() {
        assertThat(Hand.SCISSORS.against(Hand.PAPER)).isEqualTo("SCISSORS");
    }

    @Test
    public void lose_against_rock() {
        assertThat(Hand.SCISSORS.against(Hand.ROCK)).isEqualTo("ROCK");
    }

    @Test
    public void tie_against_scissors() {
        assertThat(Hand.SCISSORS.against(Hand.SCISSORS)).isEqualTo("TIE");
    }

}
