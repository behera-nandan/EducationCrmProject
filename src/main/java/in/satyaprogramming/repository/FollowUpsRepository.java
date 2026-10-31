package in.satyaprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.satyaprogramming.entity.FollowUps;

import java.util.List;
import java.util.Optional;


@Repository
public interface FollowUpsRepository extends JpaRepository<FollowUps, Long>
{
	Optional<FollowUps> findByPhoneno(String phoneno);
	
	List<FollowUps> findByEmpEmailAndFollowUpDate(String empEmail, String followUpDate);
}