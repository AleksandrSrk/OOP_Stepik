public class Main {
    /**
     * Создать конструктор хоткейс Альт + Инсерт
     * Переименовать класс ШИФТ + F6
     * Выбор вариантов перегрузок методов КТРЛ + Р. Чтобы метод был перегружаемый, параметры в нем должны отличаться количеством или типом
     * Чтобы обращаться к методу класса без создания объекта, нужно к методу добавить STATIC (при условии что в классе не создана переменная из этого метода)
     * Перегрузка метода - когда создаем несколько конструкторов, при создании объекта и вызове метода из конструктора, ИДЕ сама выбирает какой метод подставить по вводимым параметрам
     **/
    public static void main(String[] args) {
//        Employer emp1 = new Employer("Petr", "STO", 2_000);
//        emp1.schowInfo();

//        Box box1 = new Box(10,10,10); // создали новый объект Box и ссылочную переменную box1
////        box1.height = 10;
////        box1.lengts = 10;
////        box1.width = 10;
////        box1.setDimens(10,10,10);
//
//        Box box2 = new Box(20,20,20);
////        box2.setDimens(20,20,20);
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
//        Rectangle rect = new Rectangle();
//        rect.setParam(10,20);
//        rect.square();

//        Math math = new Math();
//        System.out.println(MyMath.multiple(5));
//        Box box = new Box(10.5);
//        box.showVolume();
//        Monstr monstr = new Monstr(5);
//        monstr.voice(5, "qweqwe");

        Box current = new Box(5);
        Box another = current.copyM2Box();
//        another.setDimens(20,20,20);
        current.showVolume();
        another.showVolume();

    }


}