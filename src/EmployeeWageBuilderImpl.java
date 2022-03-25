import java.util.ArrayList;

public class EmployeeWageBuilderImpl implements EmployeeWageBuilder {

    static ArrayList<EmployeeWage> arrayList = new ArrayList();

    @Override
    public int getTotalWage(String companyName) {
        int totalWage = 0;
        for (EmployeeWage employeeObject : EmployeeWageBuilderImpl.arrayList) {
            if (companyName.equals(employeeObject.companyName)) {
                totalWage = employeeObject.totalWage;
            }
        }
        return totalWage;
    }



    @Override
      public void createWageBuilder(){
        EmployeeWage emp = new EmployeeWage("tcs",21,21,22,88);
        emp.calculateWage();
        EmployeeWage emp1 = new EmployeeWage("capgemini",21,1,22,89);
        emp1.calculateWage();
        EmployeeWage emp2 = new EmployeeWage("tata",22,22,88,99);
        emp2.calculateWage();
        arrayList.add(emp);
        arrayList.add(emp1);
        arrayList.add(emp2);
    }
}