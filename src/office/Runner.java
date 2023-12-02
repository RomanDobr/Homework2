//Создать босса (Петр Николаевич), Менеджера (Володя), охранника (Петрович)
//Секретаря.
//Создать офис
//Запустить рабочий день в офисе
package office;

public class Runner {
    public Runner() {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office();
        office.setWorkDay(boss, manager, secretary, security);
    }
}
