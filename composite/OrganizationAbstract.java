package composite;
public abstract class OrganizationAbstract {
    protected String name;

    public OrganizationAbstract(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract float getSalary();

    public abstract void add(OrganizationAbstract organization);

    public abstract void remove(OrganizationAbstract organization);

    public abstract void print();

    public abstract OrganizationAbstract getChild(int i);
}