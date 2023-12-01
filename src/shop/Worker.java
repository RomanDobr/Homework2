//Создать класс Worker (работник). У работника есть: имя, возраст, пол(М/Ж), набор вещей.
//Работник умеет хвастаться своими вещами: брать по очереди вещь, и кричать:
//{Имя работника}: смотрите какая у меня вещь - {имя вещи}.
package shop;

public class Worker {
    public String name;
    public int age;
    public String sex; //man = true, woman = false;
    public Item[] items;

    public void getItemAndScream(Item[] items) {
        for (Item item : items) {
            System.out.println("{" + this.name + "}:" + " смотрите какая у меня вещь - {" + item.name + "}");
        }
    }
    public Worker (String name, int age, String sex, Item[] items) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.items = items;
    }
}
