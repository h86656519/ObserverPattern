public abstract class ShaprDecorator implements Shape {
    Shape decoratedShape;

    ShaprDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
