public class RedShapeDecorator extends ShaprDecorator{
    RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape shape){
        System.out.println("設定紅色");
    }
}
