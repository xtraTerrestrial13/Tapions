package designpatterns.creational.factory.basics.abstractcreator;

interface Shape{
    public void draw();
}


class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Square");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}