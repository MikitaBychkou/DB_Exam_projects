import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class Main3 {
    static final String USERNAME="root";
    static final String PASSWORD="root1";
    static final String URL="jdbc:mysql://localhost:3306/newdb";
    public static void main(String[] args) throws SQLException {
        ResultSet resultSet=getData();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name"));
        }
        CachedRowSet cachedRowSet=(CachedRowSet) resultSet;
//        cachedRowSet.setUrl(URL);
//        cachedRowSet.setUsername(USERNAME);
//        cachedRowSet.setPassword(PASSWORD);
//        cachedRowSet.setCommand("select * from books where id = ?");
//        cachedRowSet.setInt(1,1);
//        cachedRowSet.execute();
//        do{
//            while (cachedRowSet.next()){
//                System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name"));
//            }
//        }while (cachedRowSet.nextPage());
    }
    static ResultSet getData() throws SQLException {
        try(Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);) {
            RowSetFactory rowSetFactory= RowSetProvider.newFactory();
            CachedRowSet cachedRowSet = rowSetFactory.createCachedRowSet();

            ResultSet resultSet = statement.executeQuery("select * from books");
            cachedRowSet.populate(resultSet);
            return cachedRowSet;

        }
    }
}
