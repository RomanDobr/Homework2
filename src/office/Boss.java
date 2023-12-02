//Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
package office;

public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public void setScreamBoss(Manager manager) {
        System.out.println("{" + this.name + "}" + " {" + manager.getName() + "}" + " быстрее!");
    }

    public String getName() {
        return this.name;
    }
}
