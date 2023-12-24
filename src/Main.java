public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(); // создали новый объект Box и ссылочную переменную box1
////        box1.height = 10;
////        box1.lengts = 10;
////        box1.width = 10;
//        box1.setDimens(10,10,10);
//
//        Box box2 = new Box();
//        box2.setDimens(20,20,20);
////        box2.height = 20;
////        box2.lengts = 20;
////        box2.width = 20;
//
////        Box box3 = box2; // Создали третью ссылочную переменную. Всего два обьекта и три переменных.
//        // box3.width = 0; если будет активно, то результат обьема обьекта box2 станет 0
////        double volume = box1.height * box1.lengts * box1.width; - вместо этого вычисления воспользуемся методом из класа Бокс
//        double volume = box1.getVolume();
//        System.out.println(volume);
//
////        double volume2 = box2.height * box2.lengts * box2.width; - вместо этого вычисления воспользуемся методом из класа Бокс
//        double volume2 = box2.getVolume();
//        System.out.println(volume2);
//
//        // Создать клас человек поля имя возраст вес после этого создать три экземпляра класса человек и вывести стредний возраст
//
////        Human igor = new Human();
////        igor.name = "Igor";
////        igor.age = 20;
////        igor.height = 70;
////
////        Human john = new Human();
////        john.name = "John";
////        john.age = 30;
////        john.height = 85;
////
////        Human jimm = new Human();
////        jimm.name = "Jimm";
////        jimm.age = 40;
////        jimm.height = 55;
////
////        double middleAge = (igor.age + john.age + jimm.age) / 3;
////        System.out.println("Средний возраст " + igor.name + ", " + john.name + ", " + jimm.name + " = " + middleAge + " лет.");

//        Dog dog1 = new Dog();
//
//        dog1.name = "Bobik";
//        dog1.breed = "Boxer";
//        dog1.weight = 22;
//        dog1.speed = 5;
//        dog1.infoDog();
//        dog1.run();
//        Test test = new Test();
//
//        System.out.println(test.square(20));
        Rectangle rect = new Rectangle();
        rect.setParam(10,20);
        rect.square();
    }
}