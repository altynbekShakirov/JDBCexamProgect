package helloWorld.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


/**
 * The golden boy
 */
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Restaurant {
    private  Long id;
     private String name;
     private  String address;
     private  String openingYear;

    public Restaurant(String name, String address, String openingYear) {
        this.name = name;
        this.address = address;
        this.openingYear = openingYear;
    }
}
