package springdemo.springmvc.springwebflow.action;

import org.springframework.stereotype.Component;
import springdemo.springmvc.springwebflow.domain.Customer;
import springdemo.springmvc.springwebflow.domain.Order;
import springdemo.springmvc.springwebflow.exception.CustomerNotFoundException;

@Component
public class PizzaFlowActions {

    public void saveOrder(Order order) {
        System.out.println("持久化order对象");
    }

    public void lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        throw new CustomerNotFoundException();
    }

    public boolean checkDeliveryArea(String zipCode) {
        return true;
    }

    public void addCustomer(Customer customer) {
        System.out.println("持久化customer对象");
    }
}
