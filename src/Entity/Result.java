package Entity;

public class Result {
    private String StudentID;
    private String CourseID;
    private int Year;
    private int Semester;
    private double Mark;
    private String Grade;

    public Result(){}

    public Result(String StudentID, String CourseID, int Year, int Semester, double Mark, String Grade){
        this.StudentID = StudentID;
        this.CourseID = CourseID;
        this.Year = Year;
        this.Semester = Semester;
        this.Mark = Mark;
        this.Grade = Grade;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double mark) {
        Mark = mark;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
}
