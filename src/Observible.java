public interface Observible {
    //註冊
    void register(Observer observer);

    //取消註冊
    void unRegister(Observer observer);

    //通知
    void inForm();
}
