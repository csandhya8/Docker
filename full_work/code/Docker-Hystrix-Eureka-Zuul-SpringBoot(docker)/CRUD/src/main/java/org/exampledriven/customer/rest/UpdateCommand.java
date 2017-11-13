package org.exampledriven.customer.rest;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCommand extends HystrixCommand<String> {

    private static final Logger logger = LoggerFactory.getLogger(UpdateCommand.class);

    //private final String name;

    public UpdateCommand() {
        super(HystrixCommandGroupKey.Factory.asKey("UpdateCommand"));
     //   this.name = name;
    }

    @Override
    protected String run() throws Exception {
        logger.info("Update Command Invoked");
        return "Update invoked";
    }
}
