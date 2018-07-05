package springdemo.springmvc.springwebflow.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza {
    private String size;
    private List<Topping> toppingList;
}
