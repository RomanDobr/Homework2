//Создать класс Item (вещь). У вещи есть вес и наименование.
package shop;

public class Item {
    public double weight;
    public String name;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
