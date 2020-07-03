public abstract class Hand {

    private Hand() { }

    public abstract String against(Hand hand);
    public abstract String againstPaper();
    public abstract String againstRock();
    public abstract String againstScissors();
    public abstract String toString();


    public static final Hand ROCK = new Hand() {
        @Override
        public String against(Hand hand) {
            return hand.againstRock();
        }

        @Override
        public String againstPaper() {
            return PAPER.toString();
        }

        @Override
        public String againstRock() {
            return "TIE";
        }

        @Override
        public String againstScissors() {
            return ROCK.toString();
        }

        @Override
        public String toString() {
            return "ROCK";
        }
    };

    public static final Hand PAPER = new Hand() {
        @Override
        public String against(Hand hand) {
            return hand.againstPaper();
        }

        @Override
        public String againstPaper() {
            return "TIE";
        }

        @Override
        public String againstRock() {
            return PAPER.toString();
        }

        @Override
        public String againstScissors() {
            return SCISSORS.toString();
        }

        @Override
        public String toString() {
            return "PAPER";
        }
    };

    public static final Hand SCISSORS = new Hand() {
        @Override
        public String against(Hand hand) {
            return hand.againstScissors();
        }

        @Override
        public String againstPaper() {
            return SCISSORS.toString();
        }

        @Override
        public String againstRock() {
            return ROCK.toString();
        }

        @Override
        public String againstScissors() {
            return "TIE";
        }

        @Override
        public String toString() {
            return "SCISSORS";
        }
    };


}
