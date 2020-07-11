/*
*練習Decorator Pattern
* 應用場景: 1.想要新增目前類別，卻不想要更動原有的程式碼時
*         2.或是想動態新功能在類別上時
*         3.或是類別想搭配不同特性的多種組合
*
* 關鍵元件:
* Component:既有原有interface，但你不想修改它ex: shape
* ConcreteComponent:己有原有的class，這class 會implement Component
* Decorator:子己動手實作的部分，會是一個abstract 然後會implement Component，建構子會用 Component 來依賴注入，overrideMethod
* ComcreteDecorator:繼承Decorator 的實作類別，想要新增外掛的功能寫這
 */
public class main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redShape = new RedShapeDecorator(new Circle()); //設定顏色的動作沒有寫在shape 或是 Circle 裡面，而是寫在decorator 裡面
       // Shape redRectangle = new RedShapeDecorator(new Retangle());
//        circle.draw();
        redShape.draw();
//        redRectangle.draw();
    }
}
