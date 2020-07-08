public interface MoodState {
    void doWork(Person person);

    void doExercise(Person person);

    //將判斷的狀態寫成class
    class Happy implements MoodState {

        @Override
        public void doWork(Person person) {
            System.out.println(person.getName() + " 快樂工作去");
        }

        @Override
        public void doExercise(Person person) {
            System.out.println(" 快樂運動去");
        }
    }

    class Sad implements MoodState {

        @Override
        public void doWork(Person person) {
            System.out.println(" 不快樂也要工作");
        }

        @Override
        public void doExercise(Person person) {
            System.out.println(" 不快樂也要運動");
        }
    }

    enum MoodEnum {
        Happy("happy", new Happy()), Sad("sad", new Sad());
        String mood;
        MoodState moodState;

        private MoodEnum(String mood, MoodState moodState) {
            this.mood = mood;
            this.moodState = moodState;
        }

        public String getMood() {
            return mood;
        }

        public static MoodState getMoodState(String mood){  // 判斷狀態的方法由Person移到這裡
            for(MoodEnum moodEnum : values()) { //values()方法，這個方法會將列舉複製後以陣列做傳回
                if (moodEnum.getMood().equalsIgnoreCase(mood)) {
                    return moodEnum.moodState;
                }
            }
            return null;
        }
    }
}
