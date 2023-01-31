package helloWorld.dao;

import helloWorld.model.Restaurant;

import java.util.List;

/**
 * The golden boy
 */
public interface RestaurantDao {
    void create();
    String save(Restaurant restaurant);
    Restaurant findById(Long id);
    List<Restaurant> getAll();
    void  delete();
    String  update(Long id);







}
