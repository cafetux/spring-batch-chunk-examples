package com.cafetux.batch.listener;

import com.cafetux.batch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;

/**
 */
public class LogItemReaderListener implements ItemReadListener<Person>{

    private static final Logger LOGGER= LoggerFactory.getLogger(LogItemReaderListener.class);

    @Override
    public void beforeRead() {
    //noop
    }

    @Override
    public void afterRead(Person item) {
        LOGGER.info("reading item = {}",item);
    }

    @Override
    public void onReadError(Exception ex) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
