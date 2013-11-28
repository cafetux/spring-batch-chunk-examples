package com.cafetux.batch.processor;

import com.cafetux.batch.model.Employee;
import com.cafetux.batch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**

 */
public class PersonToEmployeeProcessor implements ItemProcessor<Person,Employee> {

    private static final Logger LOGGER= LoggerFactory.getLogger(PersonToEmployeeProcessor.class);

    @Override
    public Employee process(Person item) throws Exception {
        LOGGER.info("convert entry {}",item);
        Employee employee=new Employee();
        employee.setFirstName(item.getFirstName());
        employee.setLastName(item.getLastName());
        employee.setSexe(item.getSexe());
        return employee;
    }
}
