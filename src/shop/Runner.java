//Создать класс Runner. В классе Runner:
//Создать 4 вещи: молот (1000гр), отвертка(50гр), тетрадь(30гр), ручка(10гр)
//Создать 2 работников:
//-Василий,30 лет, мужчина, обладатель молота и отвертки.
//-Марьяна,25 лет, женщина, обладательница тетради и ручки.
//Создать магазин с работниками выше.
//Вызвать у магазина печать.
//Вызвать у каждого работника магазина хвастовство его вещами (достать работника из магазина).
package shop;

public class Runner {

    public Runner() {
        Item hammer = new Item("молот", 1000);
        Item screwdriver = new Item("отвертка", 50);
        Item notebook = new Item("тетрадь", 30);
        Item pen = new Item("ручка", 10);
        Worker vasiliy = new Worker("Василий", 30, "мужчина", new Item[] {hammer,screwdriver});
        Worker mariana = new Worker("Марьяна", 25, "женщина", new Item[] {notebook,pen});
        Shop shop = new Shop();
        shop.workers = new Worker[] {vasiliy,mariana};
        shop.printWorkers(shop.workers);
        for (Worker worker : shop.workers) {
            worker.getItemAndScream(worker.items);
        }
    }
}
