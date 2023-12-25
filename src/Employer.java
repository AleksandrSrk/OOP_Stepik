public class Employer {
    String name;
    String post;
    int salary;

    /** Создали конструктор**/
    public Employer(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    /** Метод показвыает инфо о сотруднике**/
    void schowInfo () {
        System.out.println("Сотрудник " + name + " на должности " + post + " имеет ЗП " + salary + " руб.");
    }

}
