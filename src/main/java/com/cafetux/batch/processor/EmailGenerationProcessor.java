package com.cafetux.batch.processor;

import com.cafetux.batch.model.Employee;
import com.cafetux.batch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**

 */
public class EmailGenerationProcessor implements ItemProcessor<Employee,Employee> {

    private static final Logger LOGGER= LoggerFactory.getLogger(EmailGenerationProcessor.class);
    private static final String EMAIL_FORMAT="%s.%s@supermail.fr";

    @Override
    public Employee process(Employee employee) throws Exception {
        employee.setEmail(String.format(EMAIL_FORMAT,employee.getFirstName(),employee.getLastName()));
        LOGGER.info("email generated",employee.getEmail());
        Thread.sleep(500);
        return employee;
    }
}
