package br.com.niv.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.com.niv.cart.domain.Order;
import br.com.niv.cart.exception.ObjectNotFoundException;
import br.com.niv.cart.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Order save(@Validated Order order) {
		return orderRepository.save(order);
	}

	public Order findById(Long id) {
		return orderRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException(String.format("Order not found, id: ", id)));
	}

	public Iterable<Order> findAll() {
		return orderRepository.findAll();
	}

	public void delete(Long id) {
		orderRepository.delete(findById(id));
	}
}
