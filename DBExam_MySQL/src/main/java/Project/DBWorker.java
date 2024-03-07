package Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;
//            КОМАНДЫ!!!
//            statement.execute("INSERT into animals(anim_name,anim_desc) values ('Gosha','desc1')");//execute-универсальная команда(вставка, получение данных, получение (нескольких) ResultSet)
//            statement.executeUpdate("delete from animals where id =2 or id =5");//executeUpdate-(insert, update, delete)
//             /*ResultSet res=*/statement.executeQuery("select * from animals");// только select
//            statement.addBatch("INSERT into animals(anim_name,anim_desc) values ('Gosha','desc1')");//добавляем в пачку
//            statement.addBatch("INSERT into animals(anim_name,anim_desc) values ('Holly','desc2')");
//            statement.addBatch("INSERT into animals(anim_name,anim_desc) values ('Danny','desc3')");
//            statement.executeBatch();// выполняем пачку
//            statement.clearBatch();// очищаем пачку

public class DBWorker {
    private static final String URL="jdbc:mysql://localhost:3306/mydbtest";

    private static final String USERNAME="root";

    private static final String PASSWORD="root1";

    private Connection connection;
    private static final String INSERT_NEW="insert into dish value(?,?,?,?,?,?,?)";
    private static final String GET_ALL="select * from dish";
    private static final String DELETE="delete from dish where id=?";

    public Connection getConnection() {
        return connection;
    }

    public DBWorker(){
        try{
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
//            1)
//            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW);
//            2)
//            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL);
//            3)
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
//            1)
//            preparedStatement.setInt(1,2);
//            preparedStatement.setString(2,"title");
//            preparedStatement.setString(3,"description");
//            preparedStatement.setDouble(4,10);
//            preparedStatement.setBoolean(5,true);
//            preparedStatement.setDate(6,new Date(Calendar.getInstance().getTimeInMillis()));
//            preparedStatement.setBlob(7,new FileInputStream("smiley.png"));
//
//            preparedStatement.execute();


//            2)
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()){
//                int id = resultSet.getInt("id");
//                String title= resultSet.getString("title");
//                String description= resultSet.getString("description");
//                double rating= resultSet.getDouble("rating");
//                boolean published=resultSet.getBoolean("published");
//                Date date=resultSet.getDate("created");
//                byte[] icon= resultSet.getBytes("icon");
//
//                System.out.println("id "+id+", title"+title+
//                        ", description"+description+", rating"+rating+
//                        ", published"+published+", date"+date+", icon length: "+icon.length);
//            }



//            3)
            preparedStatement.setInt(1,2);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        }catch(SQLException /*| FileNotFoundException */e) {
            e.printStackTrace();
        }

    }










}
