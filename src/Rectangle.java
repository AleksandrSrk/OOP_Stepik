public class Rectangle {
    int lenght;
    int width;


    void setParam (int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    int square (){
        System.out.println("Площадь прямоугольника = " + (lenght * width));
        return lenght * width;
    }
}
