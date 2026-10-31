package in.satyaprogramming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.satyaprogramming.entity.Orders;

@Repository
public interface OrdersChartRepository extends JpaRepository<Orders, Long>
{
    // Graph 1 - Courses Sold Per Day
    String SQL_QUERY1 = "SELECT SPLIT_PART(date_of_purchase, ',', 1) AS purchased_date, COUNT(*) AS number_of_courses_sold FROM orders GROUP BY purchased_date ORDER BY purchased_date";

    @Query(value = SQL_QUERY1, nativeQuery = true)
    List<Object[]> findCoursesSoldPerDay();


    // Graph 2 - Course Wise Sales
    String SQL_QUERY2 = "SELECT course_name, COUNT(*) AS total_sold FROM orders GROUP BY course_name";

    @Query(value = SQL_QUERY2, nativeQuery = true)
    List<Object[]> findCoursesTotalSales();
    
    // Graph 3 - Amount Sales (FIX THIS BASED ON YOUR COLUMN)
    String SQL_QUERY3 =
    		"SELECT SPLIT_PART(date_of_purchase, ',', 1), " +
    		"SUM(course_amount) " +
    		"FROM orders GROUP BY 1 ORDER BY 1";

    @Query(value = SQL_QUERY3, nativeQuery = true)
    List<Object[]> findCoursesAmountTotalSales();
}