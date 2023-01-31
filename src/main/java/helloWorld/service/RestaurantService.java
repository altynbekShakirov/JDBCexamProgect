package helloWorld.service;

import helloWorld.model.Restaurant;

import java.util.List;

/**
 * The golden boy
 */
public interface RestaurantService {
    void create();
    String save(Restaurant restaurant);
    Restaurant findById(Long id);
    List<Restaurant> getAll();
    void  delete();
    String  update(Long id);
}
