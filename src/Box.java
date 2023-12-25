public class Box {
    // Это класс, шаблон по которому строятся обьекты
    double lengts;
    double width;
    double height;

    Box(double lengts, double width, double height) {
        this.lengts = lengts;
        this.width = width;
        this.height = height;
    }

    Box(Box another) { // создали новую коробку в которой все размеры совпадают с текущей
        this(another.lengts, another.width, another.height);
    }

    void setDimens(double lengts, double width, double height) {
        this.lengts = lengts;
        this.width = width;
        this.height = height;
        // this. - значит что обращаемся к переменным экземпляра, а не параметрам из скобки, которые передаем
    }

    double getVolume() {
        return lengts * width * height;
    }

    void showVolume() {
        System.out.println(getVolume());
    }

    /**
     * Создадим конструктор, который принимает один параметр и передает его всем трем переменным, создаем куб
     **/

    Box(double size) {
        this(size, size, size);
    }

    Box() {
        this(10);
    }

    //    void compare (Box another) { // метод сравнения объемов коробки
//        double currentvolume = getVolume(); // обьем текущей коробки
//        double anotherVolume = another.getVolume();
//        if (currentvolume > anotherVolume) {
//            System.out.println("Текущая коробка больше чем та которую передали");
//        } else if (currentvolume < anotherVolume) {
//            System.out.println("Текущая коробка меньше чем та которую передали");
//        } else System.out.println("Коробки равны");
//    }
    int compare(Box another) { // метод сравнения объемов коробки
        double currentvolume = getVolume(); // обьем текущей коробки
        double anotherVolume = another.getVolume();
        int res;
        if (currentvolume > anotherVolume) {
            System.out.println("Текущая коробка больше чем та которую передали");
            res = 1;
        } else if (currentvolume < anotherVolume) {
            System.out.println("Текущая коробка меньше чем та которую передали");
            res = -1;
        } else System.out.println("Коробки равны");
        res = 0;
        return res;
    }

    Box copyBox() {
        return new Box(this.lengts, this.width, this.height);
    }

    Box copyM2Box() {

        return new Box(this.lengts * 2.0, this.width * 2.0, this.height * 2.0);
    }


}
