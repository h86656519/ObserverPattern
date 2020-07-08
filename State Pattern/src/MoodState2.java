public interface MoodState2 {
    void doWork(Person2 person);

    void doExercise(Person2 person);

    class Happy implements MoodState2 {

        @Override
        public void doWork(Person2 person) {
            System.out.println("開心上班");
        }

        @Override
        public void doExercise(Person2 person) {
            System.out.println("開心運動");
        }
    }

    class Pain implements MoodState2 {

        @Override
        public void doWork(Person2 person) {
            System.out.println("痛苦工作");
        }

        @Override
        public void doExercise(Person2 person) {
            System.out.println("痛苦運動");
        }
    }
}
