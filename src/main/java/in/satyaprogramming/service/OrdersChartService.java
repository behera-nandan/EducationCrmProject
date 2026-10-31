package in.satyaprogramming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satyaprogramming.repository.OrdersChartRepository;


@Service
public class OrdersChartService
{
	@Autowired
	private OrdersChartRepository ordersChartRepository;
	
	public List<Object[]> findCoursesAmountTotalSales()
	{
		return ordersChartRepository.findCoursesAmountTotalSales();
	}
	
	public List<Object[]> findCoursesSoldPerDay()
	{
		return ordersChartRepository.findCoursesSoldPerDay();
	}
	
	public List<Object[]> findCoursesTotalSales()
	{
		return ordersChartRepository.findCoursesTotalSales();
	}
}
