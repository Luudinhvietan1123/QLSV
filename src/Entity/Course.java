package Entity;

public class Course {
    private String CourseID;
    private String Name;
    private int credits;

    public Course(){}

    public Course(String CourseID, String Name, int credits) {
        this.CourseID = CourseID;
        this.Name = Name;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }
}
