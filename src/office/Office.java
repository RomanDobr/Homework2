//Создать класс офис, в котором есть босс, менеджер, секретарь, охранник.
//В офисе есть метод рабочий день:
//--Босс начинает подгонять менеджера
//--Менеджер кричит
//--Охранник просит аванс
//--Секретарша всех успокаивает, и просит подождать
package office;

public class Office {
    private Boss boss;
    private Manager manager;
    private Secretary secretary;
    private Security security;

    public void setWorkDay(Boss boss, Manager manager, Secretary secretary, Security security) {
        boss.setScreamBoss(manager);
        manager.setScreamManager();
        security.setScreamSecurity();
        secretary.setSpeakSecretary(boss, manager, security);
    }

}
