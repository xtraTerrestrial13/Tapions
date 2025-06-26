package designpatterns.creational.factory.basics.abstractcreator;

 class Client {
    public static void main(String[] args) {
        Shape shape = new RectangleFactory().getShape();
        shape.draw();

        shape=new CircleFactory().getShape();
        shape.draw();

        shape=new SquareFactory().getShape();
        shape.draw();
    }
}
