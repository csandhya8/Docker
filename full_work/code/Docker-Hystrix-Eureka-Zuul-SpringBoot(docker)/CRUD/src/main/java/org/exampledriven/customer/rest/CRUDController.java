package org.exampledriven.customer.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController()
@EnableDiscoveryClient

public class CRUDController {

	@RequestMapping("/insert")
    public String insert() {
		InsertCommand objInsertCommand = new InsertCommand();
		objInsertCommand.execute();
		return "Insert Service Invoked............";
    }
	
	@RequestMapping("/update")
    public String update() {
		UpdateCommand objUpdateCommand = new UpdateCommand();
		objUpdateCommand.execute();
		return "Update Service Invoked............";
    }

	@RequestMapping("/delete")
    public String delete() {
		DeleteCommand objDeleteCommand = new DeleteCommand();
		objDeleteCommand.execute();
		return "Delete Service Invoked............";
    }
	
}