package com.cafetux.batch.writer;

import com.cafetux.batch.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * un simple writer qui écrit un trace, mais simule un temps de traitement
 */
public class SimpleLogWriter implements ItemWriter<Employee> {
    private static final Logger LOGGER= LoggerFactory.getLogger(SimpleLogWriter.class);

    @Override
    public void write(List<? extends Employee> items) throws Exception {
        for(Employee employee:items){
            LOGGER.info("write employee {}",employee);
            Thread.sleep(1000);
        }
    }
}
