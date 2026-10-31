package in.satyaprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.satyaprogramming.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>
{
	Course findByName(String courseName);
}
