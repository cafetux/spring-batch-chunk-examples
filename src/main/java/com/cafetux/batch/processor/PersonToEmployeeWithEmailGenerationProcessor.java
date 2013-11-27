package com.cafetux.batch.processor;

import com.cafetux.batch.model.Employee;
import com.cafetux.batch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**

 */
public class PersonToEmployeeWithEmailGenerationProcessor implements ItemProcessor<Person,Employee> {

    private static final Logger LOGGER= LoggerFactory.getLogger(PersonToEmployeeWithEmailGenerationProcessor.class);

    @Override
    public Employee process(Person item) throws Exception {
        LOGGER.info("process entry {}",item);
        Employee employee=new Employee(item);
        return employee;
    }
}
