import java.sql.*;

public class Main {
    static private final String USERNAME="root";
    static private final String PASSWORD="root1";
    static private final String URL="jdbc:mysql://localhost:3306/newdb";
    public static void main(String[] args) {
        try (Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
             Statement statement=connection.createStatement();){
//            statement.executeUpdate("insert into users (id, name, password ) values (1,'Mich','123')");
//            statement.executeUpdate("insert into users (id, name, password ) values (2,'Jan','123')");

//            int  userId=1;
//            String querySQL = "select * from users where id= ?";
//            PreparedStatement preparedStatement= connection.prepareStatement(querySQL);
//            preparedStatement.setInt(1,userId);
//            ResultSet resultSet=preparedStatement.executeQuery();



//            ResultSet resultSet=statement.executeQuery("select * from users where id="+userId);

//            while(resultSet.next()){
//                System.out.println("Username: "+resultSet.getString("name"));
//                System.out.println("Password: "+resultSet.getString("password"));
//            }
//            PreparedStatement preparedStatement= connection.prepareStatement("");
//



        } catch (SQLException e) {
        e.printStackTrace();
        }
    }
}
