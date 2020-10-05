package com.ashish.trip_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.ashish.trip_java.model.SearchFare;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home")
	public String home(@ModelAttribute("searchFare") SearchFare searchFare){
		System.out.println("hi");
		return "welcome";
	}
	
	@RequestMapping(value="/search-fare")
	public String processSearchRequest(@ModelAttribute("searchFare") SearchFare searchFare, ModelMap model){

		final String uri = "http://localhost:8081/trip/fare/"+searchFare.getSource()+"/"+searchFare.getDestination();
		//System.out.println("URL ----- >" + uri); 
	    RestTemplate restTemplate = new RestTemplate();
	    
	    String result = restTemplate.getForObject(uri, String.class);
	    System.out.println(result.toString());
	    /*String[] val = result.split(",");
	    String[] colVal1 = val[0].split(":");
	    String[] colVal2 = val[1].split(":");
	    String[] colVal3 = val[2].split(":");
	    String[] colVal4 = val[3].split(":");
	    System.out.println(colVal1[1].toString());
	    searchFare.setAmount(colVal1[1].toString());
	    searchFare.setCurrency(colVal2[1].toString());
	    searchFare.setSource(colVal3[1].toString());
	    searchFare.setDestination(colVal4[1].toString().replace("}", ""));*/
	    model.addAttribute("result", result);
	    //model.addAttribute("searchFare", searchFare);
		return "search-fare";
	}
	
	


}
