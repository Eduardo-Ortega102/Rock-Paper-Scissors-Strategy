import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RockShould {

    @Test
    public void lose_against_paper() {
        assertThat(Hand.ROCK.against(Hand.PAPER)).isEqualTo("PAPER");
    }

    @Test
    public void tie_against_rock() {
        assertThat(Hand.ROCK.against(Hand.ROCK)).isEqualTo("TIE");
    }

    @Test
    public void beat_scissors() {
        assertThat(Hand.ROCK.against(Hand.SCISSORS)).isEqualTo("ROCK");
    }
}
