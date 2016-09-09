package com.polpolink.hellopolpo.action;

import org.json.JSONObject;
import org.json.JSONStringer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPolpoAjaxController {
	@RequestMapping(value = "/helloajax", method = RequestMethod.POST)
	@ResponseBody
	public String helloAjax(@RequestParam String p1, @RequestParam String p2) {
		String sutraJSON = new JSONStringer().object().key("p1").value(p1).key("p2").value(new JSONObject(p2)).endObject().toString();
		return sutraJSON;
//		AjaxResponseBody result = new AjaxResponseBody();
//		if (isValidSearchCriteria(search)) {
//			List<User> users = findByUserNameOrEmail(search.getUsername(), search.getEmail());
//			if (users.size() > 0) {
//				result.setCode("200");
//				result.setMsg("");
//				result.setResult(users);
//			} else {
//				result.setCode("204");
//				result.setMsg("No user!");
//			}
//		} else {
//			result.setCode("400");
//			result.setMsg("Search criteria is empty!");
//		}
//		//AjaxResponseBody will be converted into json format and send back to the request.
//		return result;
	}
}
