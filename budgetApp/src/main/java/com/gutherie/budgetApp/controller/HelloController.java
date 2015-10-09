package com.gutherie.budgetApp.controller;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
	@RequestMapping(value = "/foo/hi", method = RequestMethod.GET)
	@ResponseBody
	public String hi() {
		
		Map<String,String> env = System.getenv();
		Properties props = System.getProperties();
		
		StringBuffer hello = new StringBuffer();
		hello.append("<html><head><title>Hello!</title></head><body>");
		hello.append("<h3>Request info</h3><ul>"
				+ "<li>"+ aRequest.getCharacterEncoding() +"</li>"
						+ "<li>" + aRequest.getContentType() + "</li>"
						+ "<li>" +  aRequest.getMethod() + "</li>"
						+ "<li>" +  aRequest.getRemoteAddr() + "</li>"
						+ "<li>" +  aRequest.getSession().getId() + ""
						+ "<li>" +  aRequest.getRequestURI() + "</li></ul>"	);
		
		hello.append("<h3>Environment</h3><ul>");
		Iterator iter = env.keySet().iterator();
		while (iter.hasNext()){
			hello.append("<li>" + env.get(iter.next())+"</li>");
		}
		hello.append("</ul>");
		
		hello.append("<h3>Properties</h3><ul>");
		Enumeration keys = props.keys();
		while (keys.hasMoreElements()){
			hello.append("<li>" + props.get(keys.nextElement().toString())+"</li>");
		}

		hello.append("</ul>");

		hello.append("</body></html>");
	    return hello.toString();
	}
	
	@Autowired
	private HttpServletRequest aRequest;
}
