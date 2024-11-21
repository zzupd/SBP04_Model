package com.exam.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	
	// 메서드 => 패턴과 실행할 메서드 매핑
	@RequestMapping("/test1")
	public String test1(Model model) {
		
		model.addAttribute("name", "딸기");
		
		return "test1";
	}
	
	@RequestMapping("/mv")
	public ModelAndView test2() {
		
		ModelAndView mv = new ModelAndView();
		
		List<String> objList = new ArrayList<>();
		objList.add("딸기");
		objList.add("귤");
		objList.add("수박");
		mv.addObject("lists", objList);
		
		mv.addObject("ObjectTest", "점검용 텍스트");
		mv.addObject("name", "테스터2");
		mv.setViewName("subDir/sampleView");
		
		return mv;
		
	}

}









