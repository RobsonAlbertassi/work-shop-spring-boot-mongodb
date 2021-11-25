package com.robsonalbertassi.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robsonalbertassi.workshopmongo.domain.User;

@RestController // rest resource
@RequestMapping(value = "/users") // ending point path
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User Mary = new User("1", "Mary Jane", "maryjane@gmail.com");
		User Alex = new User("2", "Alex Grey", "alexgrey@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(Mary,Alex));
		return ResponseEntity.ok().body(list);
	}
}
