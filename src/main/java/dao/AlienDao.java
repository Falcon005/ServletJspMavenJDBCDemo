package dao;

import model.Alien;

import java.sql.*;

public class AlienDao {

    private final String URL="jdbc:postgresql://localhost:5432/navin";
    private final String user="postgres";
    private final String pass = "1404";
    public Alien getAlien(int aid){
        Alien a = new Alien();


        try {
            Class.forName("org.postgresql.Driver");
            Connection connection= DriverManager.getConnection(URL,user,pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from alien where aid="+aid);

            if(resultSet.next()){
                a.setAid(resultSet.getInt("aid"));
                a.setName(resultSet.getString("aname"));
                a.setTech(resultSet.getString("tech"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
}
