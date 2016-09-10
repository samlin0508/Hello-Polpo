package com.polpolink.hellopolpo.action;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.json.JSONStringer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.polpolink.hellopolpo.service.IHelloPolpoService;

@RestController()
public class HelloPolpoAjaxController {
	@Autowired
	private IHelloPolpoService helloPolpoService;
	
	@RequestMapping(value = "/helloajax", method = RequestMethod.POST)
	@ResponseBody
	public String helloAjax(@RequestParam String p1, @RequestParam String p2) {
		String jsonString = new JSONStringer().object().key("p1").value(p1).key("p2").value(new JSONObject(p2)).endObject().toString();
		return jsonString;
	}
	
	@RequestMapping(value = "/getData", method = RequestMethod.POST)
	@ResponseBody
	public String getData() {
		List<Map<String, Object>> data = this.helloPolpoService.getData();
		String result = new JSONStringer().object().key("p1").value(data).endObject().toString();
		return result;
	}
}
