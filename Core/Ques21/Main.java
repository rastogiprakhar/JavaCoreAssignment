package Core.Ques21;

class Employee
{
    private long empId;
    private String empName;
    private String designation;

    public Employee(long empId, String empName, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
    }

    public long getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDesignation() {
        return designation;
    }
}

public class Main {
    public static void main(String[] args) {

        if(args.length%3!=0)
        {
            System.out.println("Please check number of arguments");
            return;
        }

        Employee[] emp=new Employee[args.length/3];
        int index=0;

        try {
            for (int i = 0; i < args.length; i += 3) {
                Employee temp = new Employee(Long.valueOf(args[i]), args[i + 1], args[i + 2]);
                emp[index] = temp;
                index++;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        for(int i=0;i<emp.length;i++)
        {
            System.out.println("ID: "+emp[i].getEmpId()+" , Name: "+emp[i].getEmpName()+" , Designation: "+emp[i].getDesignation());
        }
    }
}
