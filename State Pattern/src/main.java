public class main {
    /*狀態模式
    *主要是解決行為會依照狀態做改變時的應對，也是方便後續擴增時可以寫在同一個地方，而不用重複寫代碼，不用在把判斷的代碼寫在各個地方
    **/
    public static void main(String[] args) {
//        Person john = new Person("John","Happy");
        Person john = new Person("John",MoodState.MoodEnum.Happy);
        john.doWork();
//        Person2 marry = new Person2("marry" ,"happy");
//        marry.doExercise();
    }

}
