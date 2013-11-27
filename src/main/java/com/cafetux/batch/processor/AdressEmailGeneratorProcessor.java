package com.cafetux.batch.processor;

import com.cafetux.batch.model.Employee;
import com.cafetux.batch.model.Person;
import org.springframework.batch.item.ItemProcessor;

/**

 */
public class AdressEmailGeneratorProcessor implements ItemProcessor<Person,Employee> {
    @Override
    public Employee process(Person item) throws Exception {
        Employee employee=new Employee(item);
        return employee;
    }
}
