package Entity;

public class Student {
    private String StudentID;
    private String LastName;
    private String FirstName;
    private String Sex;
    private String DateOfBirth;
    private String PlaceOfBirth;
    private String DeptID;
    private String Scholarship;
    private float AverageScore;

    public Student(){}

    public Student(String StudentID, String LastName, String FirstName, String Sex, String DateOfBirth, String PlaceOfBirth, String DeptID, String Scholarship, float AverageScore){
        this.StudentID = StudentID;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Sex = Sex;
        this.DateOfBirth = DateOfBirth;
        this.PlaceOfBirth = PlaceOfBirth;
        this.DeptID = DeptID;
        this.Scholarship = Scholarship;
        this.AverageScore = AverageScore;
    }

    public float getAverageScore() {
        return AverageScore;
    }

    public void setAverageScore(float averageScore) {
        AverageScore = averageScore;
    }

    public String getScholarship() {
        return Scholarship;
    }

    public void setScholarship(String scholarship) {
        Scholarship = scholarship;
    }

    public String getDeptID() {
        return DeptID;
    }

    public void setDeptID(String deptID) {
        DeptID = deptID;
    }

    public String getPlaceOfBirth() {
        return PlaceOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        PlaceOfBirth = placeOfBirth;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
}
