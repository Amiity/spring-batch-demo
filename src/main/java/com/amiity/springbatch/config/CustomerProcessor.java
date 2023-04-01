package com.amiity.springbatch.config;

import com.amiity.springbatch.model.Customers;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customers, Customers> {


    @Override
    public Customers process(Customers item) throws Exception {
        return item;
    }
}
