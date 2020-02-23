package databases;

import java.io.IOException;
import java.sql.SQLException;

public class T {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        ConnectToSqlDB a=new ConnectToSqlDB();
        a.connectToSqlDatabase();
    }
}
