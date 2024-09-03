package composite;

public class Main {
    public static void main(String[] args) {
        OrganizationAbstract Organization = new Organization("PizzaOrganization");

        OrganizationAbstract Department1 = new Department("PizzaChef");
        OrganizationAbstract Department2 = new Department("PizzaDelivery");

        OrganizationAbstract Employee1 = new Employee("Employee1", 1000);
        OrganizationAbstract Employee2 = new Employee("Employee2", 2000);
        OrganizationAbstract Employee3 = new Employee("Employee3", 3000);
        OrganizationAbstract Employee4 = new Employee("Employee4", 4000);
        OrganizationAbstract Employee5 = new Employee("Employee5", 5000);

        Organization.add(Department1);
        Organization.add(Department2);

        Department1.add(Employee1);
        Department1.add(Employee2);
        Department1.add(Employee3);

        Department2.add(Employee4);
        Department2.add(Employee5);

        Organization.print();
        System.out.println("Total Salary : " + Organization.getSalary());
    }
}