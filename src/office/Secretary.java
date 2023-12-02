//Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
//"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
package office;

public class Secretary {

    public void setSpeakSecretary(Boss boss, Manager manager, Security security) {
        System.out.println("{Секретарь}" + " {" + boss.getName() + "}" + " не волнуйтесь,"
                + " {" + manager.getName() + "} " + "все успеет. " + "{" + security.getName() + "}" + " - подождите!");
    }
}
