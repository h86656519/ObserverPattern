public class Reader implements Observer {
    private String name = null;
    Observible observible = null;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void subcribe(Observible observible) {
        this.observible = observible;
        this.observible.register(this);
    }

    @Override
    public void unSubcribe(Observible observible) {
        this.observible.unRegister(this);
    }

    @Override
    public void update() {
        System.out.println("收到更新通知了");
    }
}
