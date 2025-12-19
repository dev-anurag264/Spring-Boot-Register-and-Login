package todo.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todo.project.entity.UserEntity;
import todo.project.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean registerUser(UserEntity user) {
		try {
			userRepository.save(user);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public UserEntity loginUser(String email, String password) {
		
		UserEntity loggedinuser = userRepository.findByEmail(email);
		
		if(loggedinuser != null && loggedinuser.getPassword().equals(password)) {
			return loggedinuser;
		}
		return null;
	}
}
	
//We can send object in the form of model//