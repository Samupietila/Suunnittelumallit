package composite;
import java.util.List;
import java.util.ArrayList;

public class Department extends OrganizationAbstract {
    public Department(String name) {
        super(name);
    }
    private List<OrganizationAbstract> employee = new ArrayList<>();
    @Override
    public void add(OrganizationAbstract organization) {
        this.employee.add(organization);
    }
    @Override
    public void remove(OrganizationAbstract organization) {
        this.employee.remove(organization);
    }
    @Override
    public void print() {
        System.out.println("    <Department>" + "\n" + "      <Name>" + getName() + "</Name>");
        for (OrganizationAbstract employees : employee) {
            employees.print();
        }
        System.out.println("    </Department>");
    }
    @Override
    public OrganizationAbstract getChild(int i) {
        return this.employee.get(i);
    }
    @Override
    public float getSalary() {
        float totalSalary = 0;
        for (OrganizationAbstract employees : employee) {
            totalSalary += employees.getSalary();
        }
        return totalSalary;
    }
}