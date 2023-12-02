//Охранник обладает именем. Просит выдать ему аванс.
package office;

public class Security {
    private String name;

    public Security(String name) {
        this.name = name;
    }
    public void setScreamSecurity() {
        System.out.println("{" + this.name + "}" + " выдать мне аванс!!!");
    }

    public String getName() {
        return this.name;
    }
}
