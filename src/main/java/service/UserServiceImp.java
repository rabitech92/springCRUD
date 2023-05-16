package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.User;
import repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getUser() {		
		return userRepository.findAll();
	}

	@Override
	public User getUserByid(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User updateUser(int id, User user) {
		User rabi = userRepository.findById(id).get();
		rabi.setName(user.getName());
		rabi.setAddress(user.getAddress());
		rabi.setEmail(user.getEmail());
		
		return userRepository.save(rabi);
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
		
	}

}
