public interface Observer {
    //訂閱
    void subcribe(Observible observible);

    //取消訂閱
    void unSubcribe(Observible observible);

    //更新
    void update();
}
