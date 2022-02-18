package sample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Person {

    private String name="John";
    private Car car;

    @Autowired
    public Person(Car car){
        this.car = car;
    }
}
