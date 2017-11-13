package org.exampledriven.customer.rest;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteCommand extends HystrixCommand<String> {

    private static final Logger logger = LoggerFactory.getLogger(DeleteCommand.class);

    public DeleteCommand() {
        super(HystrixCommandGroupKey.Factory.asKey("DeleteCommand"));
        }

    @Override
    protected String run() throws Exception {
        logger.info("Delete Command Invoked");
        return "Delete invoked";
    }
}
