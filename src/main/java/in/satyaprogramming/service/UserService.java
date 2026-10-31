package in.satyaprogramming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satyaprogramming.entity.User;
import in.satyaprogramming.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	public void registerUserService(User user)
	{
		userRepository.save(user);
	}
	
	public boolean loginUserService(String email,String password)
	{
		User user=userRepository.findByEmail(email);
		if(user!=null)
		{
			return password.equals(user.getPassword());
		}
		else
		{
			return false;
		}
	}
	public User getUserByEmail(String email)
	{
	    return userRepository.findByEmail(email);
	}
}
