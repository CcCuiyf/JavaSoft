import java.sql.*;
import java.util.*;

public class Sql {

    public static void selectAdmin(Statement statement) throws SQLException {
        //System.out.println("Please input table name");
        //Scanner scanner = new Scanner(System.in);
        //String tableQuery = scanner.nextLine();
        String sql="select * from administrator";
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            String name=resultSet.getString("name");
            int sno=resultSet.getInt("sno");
            int pid=resultSet.getInt("power_id");
            System.out.println(" "+name+' '+sno+' '+pid);
        }

    }
    public static void update(Statement statement) throws SQLException {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please input which label you wamt to change");
        String UpdatecolumnLabel=scan.next();
        System.out.println("Please input what you want change to");
        String newelement= scan.next();
        System.out.println("Please input where you want apply this change");
        System.out.print("label:");
        String TargetcolumnLabel=scan.next();
        System.out.print("element:");
        String oldelement=scan.next();
        String sql="set sql_safe_updates = 0";
        statement.execute(sql);
        sql="update new_table1 set '"+UpdatecolumnLabel+"'='"+newelement+"'where '"+TargetcolumnLabel+"'='"+oldelement+"'";
        statement.execute(sql);
        sql="set sql_safe_updates = 1";
        statement.execute(sql);
    }

    public static void insert(Statement statement) throws SQLException {
        Scanner scan=new Scanner(System.in);
        System.out.println("which table do you want to insert:");
        String string = scan.nextLine();
        if(string == "administrator"){
            System.out.println("Please input the message you want to insert");
            System.out.println("name:");
            String name=scan.nextLine();
            System.out.println("sno:");
            int sno=scan.nextInt();
            System.out.println("power_id");
            int pid=scan.nextInt();
        }
        if(string == "class"){
            System.out.println("Please input the message you want to insert");
            System.out.println("Stu_id:");
            int id=scan.nextInt();
            System.out.println("Stu_name:");
            String name=scan.next();
            System.out.println("Stu_sex:");
            String sex=scan.next();
            System.out.println("Stu_age:");
            int age=scan.nextInt();

        }
        if(string == "student"){
            System.out.println("Please input the message you want to insert");
            System.out.println("Stu_id:");
            int id=scan.nextInt();
            System.out.println("Stu_name:");
            String name=scan.next();
            System.out.println("Stu_sex:");
            String sex=scan.next();
            System.out.println("Stu_age:");
            int age=scan.nextInt();
        }

        String sql = "insert ";
        statement.execute(sql);
    }
    public static void delete(Statement statement) throws SQLException {
        System.out.println("please input the line you want to delete");
        Scanner scan=new Scanner(System.in);
        String sql="";
        statement.execute(sql);

    }

}
