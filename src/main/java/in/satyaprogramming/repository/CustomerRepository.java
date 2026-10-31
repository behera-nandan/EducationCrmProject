package in.satyaprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.satyaprogramming.entity.User;



public interface CustomerRepository extends JpaRepository<User, Long> 
{
	User findByEmail(String email);
}
