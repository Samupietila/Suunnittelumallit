package composite;
import java.util.List;
import java.util.ArrayList;
public class Organization extends OrganizationAbstract {
    public Organization (String name) {
        super(name);
    }
    private List<OrganizationAbstract> departments = new ArrayList<>();

    @Override
    public void add(OrganizationAbstract organization) {
        this.departments.add(organization);
    }

    @Override
    public void remove(OrganizationAbstract organization) {
        this.departments.remove(organization);
    }

    @Override
    public void print() {
        System.out.println("<Organization id=\"" + getName() + "\">");
        for (OrganizationAbstract department : departments) {
            department.print();
        }
        System.out.println("</Organization>");
    }

    @Override
    public OrganizationAbstract getChild(int i) {
        return this.departments.get(i);
    }

    @Override
    public float getSalary() {
        float totalSalary = 0;
        for (OrganizationAbstract department : departments) {
            totalSalary += department.getSalary();
        }
        return totalSalary;
    }
}