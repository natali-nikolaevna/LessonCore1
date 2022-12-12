package lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Гав", "коричневый",1, 30);
        System.out.println(cat1);


        Cat cat2 = new Cat("Бегемот","черный",2, 50);
        Cat cat3 = new Cat("Леопольд","рыжий",5, 70);
        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Дик","серый",6, 5);
        Animal cat4 = new Cat("Мурзик", "белый", 7, 60);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        } else {
            System.out.println("Не является волком!");
        }

        cat1.voice();
        wolf.voice();

        Pool pool = new Pool(300);

        cat1.swimmingSpeed = 2.0;

        double timeToOvercomeCat1 = cat1.swim(pool);
        System.out.println(timeToOvercomeCat1);

        Pool[] pools = {new Pool(150),new Pool(200),new Pool(300)};
        wolf.swimmingSpeed = 2.0;

        for (Pool pool1 : pools) {
             System.out.println("Проплыл за " + wolf.swim(pool1) + " минуты");
         }

        System.out.println();

        Course[] courses = {new Course(20),new Course(40), new Course(60)};
        Team team = new Team("Кошки чемпионы",cat1, cat2, cat3, wolf);


        for (int i = 0; i < team.animals.length; i++) {
            for (int j = 0; j < courses.length; j++) {
                team.animals[i].doIt(courses[j]);
            }
        }
    }
}
