package in.satyaprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.satyaprogramming.entity.Feedback;
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long>
{

}
