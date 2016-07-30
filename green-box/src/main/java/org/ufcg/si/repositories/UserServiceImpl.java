package org.ufcg.si.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ufcg.si.models.User;

/**
 * This is a façade that is used in out Controller. It also contains the User Repository
 */
@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository repository){
		this.userRepository = repository;
	}
	
	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User save(User pessoa) {
		return userRepository.save(pessoa);
		
	}
	
	public User delete(Long id){
		User deletedUser = userRepository.findOne(id);
		userRepository.delete(id);
		return deletedUser;
	}
	
	public User update(User user){
		if (userRepository.findOne(user.getId()) != null) {
			return userRepository.save(user);
		} else {
			return null;
		}
	}

}