package todo.project.services;

import org.springframework.stereotype.Service;

import todo.project.entity.UserEntity;
@Service
public interface UserService {
	public boolean registerUser(UserEntity user);
	public UserEntity loginUser(String email, String password);
	

}
