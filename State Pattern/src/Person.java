/**
 * 採用enum 的寫法
 * */

public class Person {
    private String name;
    private String mood;
    MoodState moodState;

    public Person(String name, MoodState.MoodEnum moodEnum) {
        this.name = name;
        this.mood = moodEnum.getMood();
//        this.moodState = getMoodState();
        this.moodState = MoodState.MoodEnum.getMoodState(mood); //重要
    }

    public String getName() {
        return name;
    }

    /*直覺式寫法
    重複性太高了，每做一件事都要再做判斷，所以提取成interface
     **/
//    public void doWork() {
//        if (mood.equals("happy")) {
//            System.out.println(name + " 快樂工作去");
//        } else if (mood.equals("sad")) {
//            System.out.println(name + " 不快樂也要工作");
//        }
//    }
//    public void doExercise(){
//        if (mood.equals("happy")) {
//            System.out.println(name + " 快樂運動去");
//        } else if (mood.equals("sad")) {
//            System.out.println(name + " 不快樂也要運動");
//        }
//    }

//重新
    public void doWork() {
        moodState.doWork(this);
    }

    public void doExercise() {
        moodState.doExercise(this);
    }
}
