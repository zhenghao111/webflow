package springdemo.springmvc.springwebflow.domain;

import java.util.Arrays;
import java.util.List;
import static org.apache.commons.lang.WordUtils.*;

public enum  PaymentType {
    CASH,CHECK,CREDIT_CARD;

    public static List<PaymentType> asList() {
        PaymentType[] all = PaymentType.values();
        return Arrays.asList(all);
    }


    @Override
    public String toString() {
        return capitalize(name().replace('_', ' '));
    }
}
