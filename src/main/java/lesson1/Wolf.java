package lesson1;

public class Wolf extends Animal implements CanSwim{
    int maxJump;
    public Wolf(String name, String color, int age, int maxJump) {
        super(name, color, age);
        this.maxJump = maxJump;
    }
    public void voice (){
        System.out.println("Волк рычит");
    }

    public double swim(Pool pool) {
        System.out.println("Я волк, я плыву!");
        return pool.getLength() / swimmingSpeed;

    }
    @Override
    public void doIt(Course course) {
        if (maxJump >= course.getPrevention()) {
            System.out.println("Волк " + getName() + " прыгнул на " + course.getPrevention() + " метров");
        } else {
            System.out.println("Волк " + getName() + " не взял высоту");
        }
    }


}
