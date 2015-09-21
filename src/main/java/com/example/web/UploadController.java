package com.example.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.JsonTool;

@RestController
public class UploadController {

	private static final Logger logger = LoggerFactory
			.getLogger(UploadController.class);

	@RequestMapping("/upload/**")
	public void upload(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String[]> map = request.getParameterMap();
		String[] uri = {request.getRequestURI()};
		map.put("autonavi.com/route", uri);
		logger.info(JsonTool.toJson(map));
	}

}