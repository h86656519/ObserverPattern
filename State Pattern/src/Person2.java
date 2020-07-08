/**
 * 不採用enum寫法
 * */

public class Person2 {
    String name;
    String mood;
    MoodState2 moodState2;

    public Person2(String name, String mood) {
        this.name = name;
        this.mood = mood;
        moodState2 = getMoodState2(mood);
    }

    public void doWork() {
        moodState2.doWork(this);
    }

    public void doExercise(){
        moodState2.doExercise(this);
    }

    private MoodState2 getMoodState2(String mood){
        if (mood.equals("happy")){
            return new MoodState2.Happy();
        }else if (mood.equals("pain")){
            return new MoodState2.Pain();
        }
        return null;
    }
}
