public class Monstr {
    int eye;
    int hand;
    int foot;

    /**
     * конструктор принимает три значения и передает их переменным
     **/
    public Monstr(int eye, int hand, int foot) {
        this.eye = eye;
        this.hand = hand;
        this.foot = foot;
    }


    /**
     * конструктов принимает количество передает всем полям
     **/

    Monstr(int count) {
        this(count, count, count); // Вызвали первый конструктор
    }

    /**
     * Конструктор без параметров
     **/
    public Monstr() {
        this(2);
    }




    void voice() {
        // System.out.println("Grrrrrrrrrrr...");
        voice(1,"Grrrrrrrrrrr..." ); // Воспользовались последним методом
    }

    void voice(int count) {
//        for (int i = 0; i < count; i++) {
//            System.out.println("Grrrrrrrrrrr...");
//        }
        voice(count, "Grrrrrrrrrrr..."); // Воспользовались последним методом
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }


}
