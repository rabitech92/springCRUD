package service;

import java.util.List;

import org.springframework.stereotype.Service;



import model.User;

@Service
public interface UserService {
	
		public User addUser(User user);

	    public List<User> getUser();

	    public User getUserByid(int id);

	    public User updateUser(int id , User user);

	    public void deleteUser(int id);


}
