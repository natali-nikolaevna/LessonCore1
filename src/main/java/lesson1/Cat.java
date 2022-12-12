package lesson1;


import java.util.Objects;

public class Cat extends Animal implements CanSwim{

    int maxJump;
    public Cat(String name, String color, int age, int maxJump) {

        super(name,color,age);
        this.maxJump = maxJump;
    }
    public void voice (){
        System.out.println("Кот мяукает");

    }
    public double swim(Pool pool) {
        System.out.println("Я кот, я плыву!");
        return pool.getLength() / swimmingSpeed;
    }

    @Override
    public void doIt(Course course) {
        if(maxJump >= course.getPrevention()) {
            System.out.println("Кот " + getName() + " прыгнул на " + course.getPrevention() + " метров");
        }else {
            System.out.println("Кот " + getName() + " не взял высоту");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getAge() == cat.getAge() &&
                Objects.equals(getName(), cat.getName()) &&
                Objects.equals(getColor(), cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getAge());
    }






}
