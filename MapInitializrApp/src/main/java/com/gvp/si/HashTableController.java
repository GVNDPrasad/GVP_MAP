package com.gvp.si;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HashTableController {

	@RequestMapping(value = "/hashTable")
	public String index() {
		System.out.println("Key+value = Entity -> HashTable");

		System.out.println("Random order and Duplicates not allow!");

		Map<String, Integer> hm = new Hashtable<>();
		hm.put("Vijayawada", 520000);
		hm.put("Hyderabad", 500000);
		hm.put("Vizag", 530000);
		hm.put("Vijayawada", 520000);
		hm.put("Guntur", 510000);

		System.out.println(hm);

		Set<String> s = hm.keySet();// Get Key's

		for (Object o : s) {
			System.out.println(o + "\t Pincode is:" + hm.get(o));// Get Key Values
		}

		return "Key Values List:" + hm.keySet();
	}

}
