package Project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DBWorker dbWorker=new DBWorker();
        String query ="select * from user where id = 2";
        try {
            Statement statement=dbWorker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);//получим ResultSet


//            while(resultSet.next()){
//                User user=new User();
//                user.setId(resultSet.getInt("id"/*можно указать 1(номер колонки)*/));
//                user.setUsername(resultSet.getString("username"));
//                user.setPassword(resultSet.getString("password"));
//                System.out.println(user);
    /*                int id = resultSet.getInt(1);
                    String username = resultSet.getString(2);
                    String passrard = resultSet.getString(3);
                    System.out.println(id+" "+username+" "+passrard);*/
//            }

        } catch (SQLException e) {
            System.out.println("Ошибка");;
        }
    }
}
