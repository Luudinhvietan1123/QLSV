package Entity;

public class Department {
    private String DeptID;
    private String Name;
    private String NoOfStudent;

    public Department(){}

    public Department(String DeptID, String Name, String NoOfStudent){
        this.DeptID = DeptID;
        this.Name = Name;
        this.NoOfStudent = NoOfStudent;
    }

    public String getNoOfStudent() {
        return NoOfStudent;
    }

    public void setNoOfStudent(String noOfStudent) {
        NoOfStudent = noOfStudent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDeptID() {
        return DeptID;
    }

    public void setDeptID(String deptID) {
        DeptID = deptID;
    }
}
