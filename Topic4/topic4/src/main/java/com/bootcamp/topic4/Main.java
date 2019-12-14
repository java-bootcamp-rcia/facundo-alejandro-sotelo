package com.bootcamp.topic4;


import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/high_school?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "Alquimia12";
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            String query =
                    "select *" +
                    "from high_school.teachers tc\n" +
                    "inner join high_school.courses cs\n" +
                    "on cs.assigned_Teacher = tc.id_Teacher\n" +
                    "inner join high_school.schedules sc\n" +
                    "on sc.course_Number_id = cs.course_Number\n" +
                    "inner join high_school.day_week dw\n" +
                    "on sc.day_Week = dw.id_Day_Week\n" +
                    "where tc.last_Name = \"Castañeda\"\n" +
                    "order by dw.name_Day;";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                System.out.print("Teacher: ");
                System.out.println(rs.getString("first_Name")+"  "
                        + rs.getString("last_Name"));
                System.out.println("Schedule: ");
                System.out.println(rs.getString("name_Day")+ "  "+ rs.getString("start_Time")
                +"  "+rs.getString("end_Time")+"  "+rs.getString("course_Name"));
            }
        }catch (Exception e){
            e.getMessage();
        }
        finally {
            System.out.println("What's up doug?...");
        }


    }
}
