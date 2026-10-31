package in.satyaprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.satyaprogramming.entity.EmployeeOrders;



@Repository
public interface EmployeeOrdersRepository extends JpaRepository<EmployeeOrders, Long>
{

}