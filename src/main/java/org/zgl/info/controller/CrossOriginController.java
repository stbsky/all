package org.zgl.info.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:8888", "null"})
@RestController
@RequestMapping(value="/cross")
public class CrossOriginController {

	@RequestMapping(value="/test")
	public Map<String,Object> getInfo(){
		Map<String,Object> result = new HashMap<String,Object>();
		
		result.put("result",true);
		return result;
	}
}
