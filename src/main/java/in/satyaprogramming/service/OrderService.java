package in.satyaprogramming.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satyaprogramming.entity.Orders;
import in.satyaprogramming.repository.OrdersRepository;

@Service
public class OrderService
{
	@Autowired
	private OrdersRepository ordersRepository;
	
	public void storeUserOrders(Orders orders)
	{
		ordersRepository.save(orders);
	}
}