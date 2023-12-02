//Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
package office;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }
    public void setScreamManager() {
        System.out.println("{" + this.name + "} " + "я ничего не успеваю, помогите!");
    }

    public String getName() {
        return this.name;
    }
}
