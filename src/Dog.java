public class Dog {
    String name;
    String breed;
    double weight;
    int speed;

    void infoDog () {
        System.out.println("Собака " + name + " породы " + breed + " и весом " + weight + " кг.");
    }
    void run (){
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу " + (i+1) + " раз.");
        }
    }
}
