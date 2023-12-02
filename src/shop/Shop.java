//Создать класс Shop (магазин). У которого есть работники.
//Магазин умеет печатать своих работников:
//{Имя работника}: {возраст} лет, {мужчина или женщина}, список вещей: {набор вещей работника}
package shop;

public class Shop {
    public Worker[] workers;

    public void printWorkers(Worker[] workers) {
        for (Worker worker : workers) {
            System.out.print("{" + worker.name + "}:" + "{" + worker.age + "} лет," + "{" + worker.sex + "}, ");
            System.out.print("список вещей: {");
            String items = "";
            for (Item item : worker.items) {
                items += item.name + ", ";
            }
            System.out.println(items.substring(0,items.length()-2) + "}");
        }
    }
}
