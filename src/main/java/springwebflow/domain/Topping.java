package springdemo.springmvc.springwebflow.domain;

import java.util.Arrays;
import java.util.List;

public enum  Topping {
    T1,T2,T3;

    public List<Topping> asList() {
        Topping[] all = Topping.values();
        return Arrays.asList(all);
    }
}
