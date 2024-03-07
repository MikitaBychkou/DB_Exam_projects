import java.sql.*;

public class Main2 {

    public static void main(String[] args) {
         final String USERNAME="root";
         final String PASSWORD="root1";
         final String URL="jdbc:mysql://localhost:3306/newdb";
         try(Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);){
 //Scroll
/*             Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                PreparedStatement preparedStatement= connection.prepareStatement("sql",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             ResultSet resultSet = statement.executeQuery("select * from users");
             if(resultSet.next())
                 System.out.println(resultSet.getString("name"));
             if(resultSet.next())
                 System.out.println(resultSet.getString("name"));
             if(resultSet.previous())
                 System.out.println(resultSet.getString("name"));


             if(resultSet.relative(2))
                 System.out.println(resultSet.getString("name"));
             if(resultSet.relative(-2))
                 System.out.println(resultSet.getString("name"));


             if(resultSet.absolute(3))
                 System.out.println(resultSet.getString("name"));*/
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //PreparedStatement preparedStatement= connection.prepareStatement("sql", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
             ResultSet resultSet=statement.executeQuery("select * from users");
             while (resultSet.next()){
                 System.out.println(resultSet.getString("name")+", "+resultSet.getString("password"));
             }

//             resultSet.last();
//             resultSet.updateString("name", "Max");
//             resultSet.updateRow();
//
//             resultSet.moveToInsertRow();
//             resultSet.updateString("name","Rita");
//             resultSet.updateString("password","890");
//             resultSet.insertRow();

             while (resultSet.next()){
                 System.out.println(resultSet.getString("name")+", "+resultSet.getString("password"));
             }

         }catch (SQLException e){
             e.printStackTrace();
         }
    }
}