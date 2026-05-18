package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {
	@PostMapping("/url")
	public String method(@RequestBody List<CarInformation> l) {

		CarInformation s = l.get(0);
		CarInformation s1 = l.get(1);
		CarInformation s2 = l.get(2);
		CarInformation s3 = l.get(3);

		String store = "";

		store = store + s.getName() + " ," + s.getMyear() + "  ||  ";
		store = store + s1.getName() + " ," + s1.getMyear() + "  ||  ";
		store = store + s2.getName() + " ," + s2.getMyear() + "  ||  ";
		store = store + s3.getName() + " ," + s3.getMyear() + "  ||  ";
		return store;

	}

	@PostMapping("/lurl")
	public String method1(@RequestBody List<CarInformation> l) {

		String store = "";
		for (int i = 0; i < l.size(); i++) {
			CarInformation c = l.get(i);
			store = store + c.getName() + " ," + c.getMyear() + "  ||  ";

		}

		return store;

	}

	@PostMapping("/eurl")
	public String method11(@RequestBody List<CarInformation> l) {

		String store = "";
		for (CarInformation c : l) {
			store = store + c.getName() + " ," + c.getMyear() + "  +|  ";

		}

		return store;

	}
}
