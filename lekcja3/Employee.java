package lekcja3;

public class Employee {
    private final String fName;
    private final String sName;
    private final int salary;

    public String getAllData(){
        StringBuilder tempBuilder = new StringBuilder();
        return tempBuilder.append("Salary for ")
                .append(fName)
                .append(" ")
                .append(sName)
                .append(" is ")
                .append(String.format("%d", salary))
                .toString();
    }

    public Employee(String fName, String sName, int salary){
        this.fName = fName;
        this.sName = sName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
