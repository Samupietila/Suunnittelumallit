package composite;
public class Employee extends OrganizationAbstract {
    private float salary;
    
    public Employee(String name, float salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public float getSalary() {
        return salary;
    }
    @Override
    public void add(OrganizationAbstract organization) {
        throw new UnsupportedOperationException("Not supported in Employee.");
    }
    @Override
    public void remove(OrganizationAbstract organization) {
        throw new UnsupportedOperationException("Not supported in Employee.");
    }
    @Override
    public void print() {
        
        System.out.println("            <Employee>" + "\n" + "              <Name>" + getName() + "</Name>" + "\n" + "              <Salary>" + getSalary() + "</Salary>"+"\n"+"            </Employee>");
    }
    @Override
    public OrganizationAbstract getChild(int i) {
        throw new UnsupportedOperationException("Not supported in Employee.");
    }
}