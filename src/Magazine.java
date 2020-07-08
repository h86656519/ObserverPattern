import java.util.ArrayList;

public class Magazine implements Observible {
    ArrayList<Observer> subcribeList = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        subcribeList.add(observer);
        inForm();
    }

    @Override
    public void unRegister(Observer observer) {
        subcribeList.remove(observer);
        System.out.println("取消訂閱");
    }

    @Override
    public void inForm() {
        System.out.println("更新通知讀者");
        for (Observer observer:subcribeList){
            observer.update();
        }
    }
}
