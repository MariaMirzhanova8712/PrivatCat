public class Main {
    public static void main(String args[]) { //точка входа в программу
        Cat cat = new Cat("Barsik",2,3); // создаем экземпляр класса cat для класса Cat с помощью конструктора new
        //выводим на печать. берем из переменной cat значения с помощью get (имя и возраст). значение weight(вес) берем сразу из переменной
        System.out.println("возраст кота " + cat.getName() + " " + cat.getAge() +" вес кота " + cat.weight);
        cat.setName("Myrzik");
        cat.setAge(4);
        cat.weight = 5;
        System.out.println("возраст кота " + cat.getName() + " " + cat.getAge() +" вес кота " + cat.weight);



    }
}
