public abstract class Gesture {
    private static final String drawMessage = "Draw";
    private static final String paperAgainstRockMessage = "Paper defeats Rock";
    private static final String rockAgainstScissorsMessage = "Rock defeats Scissors";
    private static final String scissorsAgainstPaperMessage = "Scissors defeats Paper";

    public static final Gesture ROCK = new Gesture() {
        @Override
        public String against(Gesture gesture) {
            return gesture.againstRock();
        }

        @Override
        public String againstPaper() {
            return paperAgainstRockMessage;
        }

        @Override
        public String againstRock() {
            return drawMessage;
        }

        @Override
        public String againstScissors() {
            return rockAgainstScissorsMessage;
        }
    };

    public static final Gesture PAPER = new Gesture() {
        @Override
        public String against(Gesture gesture) {
            return gesture.againstPaper();
        }

        @Override
        public String againstPaper() {
            return drawMessage;
        }

        @Override
        public String againstRock() {
            return paperAgainstRockMessage;
        }

        @Override
        public String againstScissors() {
            return scissorsAgainstPaperMessage;
        }
    };

    public static final Gesture SCISSORS = new Gesture() {
        @Override
        public String against(Gesture gesture) {
            return gesture.againstScissors();
        }

        @Override
        public String againstRock() {
            return rockAgainstScissorsMessage;
        }

        @Override
        public String againstPaper() {
            return scissorsAgainstPaperMessage;
        }

        @Override
        public String againstScissors() {
            return drawMessage;
        }
    };


    private Gesture() { }

    public abstract String against(Gesture gesture);
    public abstract String againstPaper();
    public abstract String againstRock();
    public abstract String againstScissors();
}
