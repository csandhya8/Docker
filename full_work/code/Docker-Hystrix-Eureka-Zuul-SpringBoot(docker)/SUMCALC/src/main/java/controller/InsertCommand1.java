package controller;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertCommand1 extends HystrixCommand<String> {

    private static final Logger logger = LoggerFactory.getLogger(InsertCommand1.class);

        public InsertCommand1() 
        {
        super(HystrixCommandGroupKey.Factory.asKey("InsertCommand1"));
        }

    @Override
    protected String run() throws Exception {
       logger.info("Insert Command Invoked");
        return "Insert invoked";
    }
}
