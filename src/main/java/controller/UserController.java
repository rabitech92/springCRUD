package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import service.UserService;

@CrossOrigin(origins = "api")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/add")
    public String adduser(@RequestBody User user){
         userService.addUser(user);
         return "User added Successfully";
    }
	
	@GetMapping("/users")
	public List<User> getUser(){
		System.out.println("users");
		return userService.getUser();
		
	}
	
	@GetMapping("/users/{id}")
	public User getById(@PathVariable("id")int id) {
		return userService.getUserByid(id);
		
	}
	@GetMapping("update/{id}")
	public User updateUser(@PathVariable("id") int id,@RequestBody User user) {
		return userService.updateUser(id, user);
		 	
	}	
	@PostMapping("/delete/{id}")
	public User deleteUser(@PathVariable("id")int id) {
		return deleteUser(id);
	}
	

}
