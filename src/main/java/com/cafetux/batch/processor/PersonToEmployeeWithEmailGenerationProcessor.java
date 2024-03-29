package com.cafetux.batch.processor;

import com.cafetux.batch.model.Employee;
import com.cafetux.batch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.text.MessageFormat;

/**

 */
public class PersonToEmployeeWithEmailGenerationProcessor implements ItemProcessor<Person,Employee> {

    private static final Logger LOGGER= LoggerFactory.getLogger(PersonToEmployeeWithEmailGenerationProcessor.class);
    private static final String EMAIL_FORMAT="%s.%s@supermail.fr";

    @Override
    public Employee process(Person item) throws Exception {
        LOGGER.info("process entry {}",item);
        Employee employee=new Employee();
        employee.setFirstName(item.getFirstName());
        employee.setLastName(item.getLastName());
        employee.setSexe(item.getSexe());
        employee.setEmail(String.format(EMAIL_FORMAT,item.getFirstName(),item.getLastName()));
        return employee;
    }
}
