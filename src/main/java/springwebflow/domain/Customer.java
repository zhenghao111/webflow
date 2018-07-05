package springdemo.springmvc.springwebflow.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Customer implements Serializable {

    private String phoneNumber;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;

}
