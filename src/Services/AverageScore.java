package Services;

import java.sql.*;

public class AverageScore {
    public void getAverageScore(){
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
            String sql = "CREATE TEMPORARY TABLE temp SELECT * FROM (SELECT results.StudentID, results.CourseID, MAX(results.Mark)*courses.Credits AS Total, courses.Credits FROM manage_student.results LEFT JOIN manage_student.courses ON results.CourseID = courses.CourseID GROUP BY CourseID, StudentID ORDER BY StudentID ASC) AS derivedTable; SELECT StudentID, SUM(Total)/SUM(Credits) AS AVERAGE FROM temp GROUP BY StudentID; DROP TABLE temp";
            ResultSet resultSet = statement.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
