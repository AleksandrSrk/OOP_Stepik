public class Rectangle {
    int lenght;
    int width;

    void setParam (int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    void square (){
        System.out.println("Площадь прямоугольника = " + (lenght * width));
    }
}
