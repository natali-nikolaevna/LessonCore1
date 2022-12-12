package lesson1;

public class Team {
    private String name;



    Animal[] animals = new Animal[4];

    public Team(String name, Animal animal1, Animal animal2, Animal animal3, Animal animal4) {
        this.name =name;
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;
        animals[3] = animal4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }

}


