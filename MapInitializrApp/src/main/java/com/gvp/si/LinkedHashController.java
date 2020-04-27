package com.gvp.si;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkedHashController {
	
	@RequestMapping(value="/linkedHash")
	public String index() {
		System.out.println("Key+value = Entity -> Linked Hash Map");
		
		System.out.println("Same order & Allow duplicates!");
		
		Map<String,Integer> hm = new LinkedHashMap<>();
		hm.put("Vijayawada", 520000);
		hm.put("Hyderabad", 500000);
		hm.put("Vizag",530000);
		hm.put("Vijayawada", 520000);
		hm.put("Guntur",510000);
		
		System.out.println(hm);
		
		
		Set<String> s= hm.keySet();//Get Key's
		
		for(Object o: s) {
			System.out.println(o+"\t Pincode is:"+hm.get(o));//Get Key Values
		}
		
		return "Key Values List:"+hm.keySet();
	}

}
