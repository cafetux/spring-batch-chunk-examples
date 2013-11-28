package com.cafetux.batch.writer;

import com.cafetux.batch.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.concurrent.Future;

/**
 * un simple writer qui écrit un trace, mais simule un temps de traitement
 */
public class SimpleLogFutureWriter implements ItemWriter<Future<Employee>> {
    private static final Logger LOGGER= LoggerFactory.getLogger(SimpleLogFutureWriter.class);

    @Override
    public void write(List<? extends Future<Employee>> items) throws Exception {
        for(Future<Employee> employee:items){
            LOGGER.info("write employee {}",employee.get());
            Thread.sleep(1000);
        }
    }

}
