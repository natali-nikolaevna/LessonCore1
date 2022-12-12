package lesson1;

public class Turtle extends Animal implements CanSwim{
    public Turtle(String name, String color, int age) {
        super(name,color,age);
    }

    public void voice (){
        System.out.println("Черепаха издает звук");

    }

    @Override
    public void doIt(Course course) {

    }

    public double swim(Pool pool) {
        System.out.println("Я черепаха, я плыву!");
        return pool.getLength() / swimmingSpeed;

    }


}
