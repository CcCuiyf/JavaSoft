import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception{
        //int id=222;
        String url="jdbc:mysql://localhost:3306/java?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String username="root";
        String password="Cqupt@2020";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,username,password);
        Statement statement=con.createStatement();
        String string;
        Sql.insert(statement);
        Sql.selectAdmin(statement);

//        sql="delete from new_table1 where Stu_id = 3";
//        statement.execute(sql);
//        sql="select * from new_table1";
//        ResultSet resultSet=statement.executeQuery(sql);
//        while(resultSet.next()){
//            String name=resultSet.getString("Stu_name");
//            System.out.println(name);
//        }
        // System.out.println(sql);
    }


}
