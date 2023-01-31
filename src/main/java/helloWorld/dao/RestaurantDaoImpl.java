package helloWorld.dao;

import helloWorld.config.Util;
import helloWorld.model.Restaurant;

import java.sql.*;
import java.util.Collection;
import java.util.List;

/**
 * The golden boy
 */
public class RestaurantDaoImpl implements RestaurantDao {
    Connection connection = Util.getConnection();

    public void create() {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE  table  restaurant(id serial primary key ," +
                    "name varchar ," +
                    "address varchar," +
                    "openingYear varchar)");
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String save(Restaurant restaurant) {
        try {
            PreparedStatement statement= connection.prepareStatement("insert into restaurant (name ,address,openingYear)values(?,?,?)");

            statement.setString(1,restaurant.getName());
            statement.setString(2,restaurant.getAddress());
            statement.setString(3,restaurant.getOpeningYear());
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return "Successfully saved!!";
    }

    public Restaurant findById(Long id) {
        Restaurant restaurant=null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from  restaurant where id=1?;");
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                restaurant.setId(resultSet.getLong(1));
                restaurant.setName( resultSet.getString(2));
                restaurant.setAddress(resultSet.getString(3));
                restaurant.setOpeningYear(resultSet.getString(4));
                resultSet.close();
            }        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return restaurant;


    }

    public List<Restaurant> getAll() {
        return null;
    }

    public void delete() {

    }

    public String update(Long id) {
        return null;
    }
}
