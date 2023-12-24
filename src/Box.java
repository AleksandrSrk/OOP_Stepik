public class Box {
     // Это класс, шаблон по которому строятся обьекты
    double lengts;
    double width;
    double height;

    void setDimens (double lengts, double width, double height) {
        this.lengts = lengts;
        this.width = width;
        this.height = height;
        // this. - значит что обращаемся к переменным экземпляра, а не параметрам из скобки, которые передаем
    }

    double getVolume () {
        return lengts * width * height;
    }



}
