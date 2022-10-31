public class Cat {
    // для переменной name есть getter и setter поэтому можно изменить модификатор на private
    private String name;

    // для переменной age есть getter и setter поэтому можно изменить модификатор на private
    private int age;

    // для переменной weight отсутствует getter и setter поэтому не изменяется модификатор доступа
    public int weight;

    public Cat(String name, int age, int weight) {
        this.name = name; //ключевое слово которое указывает что мы ссылаемся на переменную name внутри класса Cat и ей присваивается строковое значение
        this.age = age; //ключевое слово которое указывает что мы ссылаемся на переменную age внутри класса Cat и ей присваивается целочисленное значение
        this.weight = weight; //ключевое слово которое указывает что мы ссылаемся на переменную weight внутри класса Cat и ей присваивается целочисленное значение
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}