package org.exampledriven.customer.rest;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertCommand extends HystrixCommand<String> {

    private static final Logger logger = LoggerFactory.getLogger(InsertCommand.class);

        public InsertCommand() {
        super(HystrixCommandGroupKey.Factory.asKey("InsertCommand"));
        }

    @Override
    protected String run() throws Exception {
       logger.info("Insert Command Invoked");
        return "Insert invoked";
    }
}
