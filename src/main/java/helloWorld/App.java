package helloWorld;

import helloWorld.dao.RestaurantDao;
import helloWorld.dao.RestaurantDaoImpl;
import helloWorld.model.Restaurant;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        RestaurantDaoImpl restaurantDao = new RestaurantDaoImpl();
//        restaurantDao.create();
        System.out.println(restaurantDao.save(new Restaurant("ala too", "tunguch", "hello")));;



    }
}
