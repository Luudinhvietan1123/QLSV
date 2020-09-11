package Services;

import java.sql.*;

public class UpdateStudentNumbers {
    public void updateStudentNumbers(int CEquantity, int ISquantity, int NCquantity, int SEquantity){
        try{
            Class.forName("com.mysql,cj,jdbc,Driver");
        }catch (ClassNotFoundException e){
        }
        Connection connection = null;
        try{
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/store_cms_plusplus?characterEncoding=utf8", "root", "123123");
        }catch (SQLException e){
        }
        try {
            Statement statement = connection.createStatement();
            if(CEquantity > 0){
                String sql1 = "UPDATE manage_student.department SET NoOfStudent = " + CEquantity + " WHERE DeptID = CE;";
                statement.executeQuery(sql1);
            }
            if(ISquantity > 0){
                String sql1 = "UPDATE manage_student.department SET NoOfStudent = " + ISquantity + " WHERE DeptID = IS;";
                statement.executeQuery(sql1);
            }
            if(NCquantity > 0){
                String sql1 = "UPDATE manage_student.department SET NoOfStudent = " + NCquantity + " WHERE DeptID = NC;";
                statement.executeQuery(sql1);
            }
            if(SEquantity > 0){
                String sql1 = "UPDATE manage_student.department SET NoOfStudent = " + SEquantity + " WHERE DeptID = SE;";
                statement.executeQuery(sql1);
            }
        }catch (SQLException e){
        }
    }
}
