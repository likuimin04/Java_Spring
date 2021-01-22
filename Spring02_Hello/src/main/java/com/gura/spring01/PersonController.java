package com.gura.spring01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* component scan 될때 PersonController 객체가 생성이 되고 관리가 된다. */
@Controller
public class PersonController {
	@RequestMapping("/person.do")
	public String person(HttpServletRequest request) {
		String personToday="우리 쌤"; //data type=model 이라고도 불린다.
		request.setAttribute("personToday", personToday);
		
		// forward 이동할 view page 의 위치를 리턴해준다.
		return "person"; // /WEB-INF/view/persom.jsp
	}
}
