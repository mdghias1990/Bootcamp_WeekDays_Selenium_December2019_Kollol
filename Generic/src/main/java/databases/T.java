package databases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class T {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        sqlConnection();
        System.out.println("Database connected");
    }

//    provides the following classes and interfaces
//
//    Driver Manager
//    Driver Connection
//    Statement
//            ResultSet
//    SQLException

    public static Properties loadProperties() throws IOException {
        Properties properties = new Properties();
        InputStream ism = new FileInputStream("/Users/mdghiasuddin/Downloads/Bootcamp_WeekDays_Selenium_December2019_Kollol/Generic/src/main/resources/secret.properties");
        properties.load(ism);
        ism.close();
        return properties;
    }

    public static Connection connect;

    public static Connection sqlConnection() throws IOException, ClassNotFoundException, SQLException {
        String driverClass = loadProperties().getProperty("MYSQLJDBC.driver");
        String url = loadProperties().getProperty("MYSQLJDBC.url");
        String password = loadProperties().getProperty("MYSQLJDBC.password");
        String userName = loadProperties().getProperty("MYSQLJDBC.userName");

        Class.forName(driverClass);
        connect = DriverManager.getConnection(url, userName, password);

        return connect;
    }

public static List<String>  makeList() {
        List<String> list=new ArrayList<>();
        list.add("Kollol");
        list.add("Niaz");
        list.add("Zahid");
        list.add("Shuvro");

        return list;
}


}

