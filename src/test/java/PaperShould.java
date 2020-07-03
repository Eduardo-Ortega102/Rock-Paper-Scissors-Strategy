import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PaperShould {

    @Test
    public void tie_against_paper() {
        assertThat(Hand.PAPER.against(Hand.PAPER)).isEqualTo("TIE");
    }

    @Test
    public void beat_rock() {
        assertThat(Hand.PAPER.against(Hand.ROCK)).isEqualTo("PAPER");
    }

    @Test
    public void lose_against_scissors() {
        assertThat(Hand.PAPER.against(Hand.SCISSORS)).isEqualTo("SCISSORS");
    }
}
