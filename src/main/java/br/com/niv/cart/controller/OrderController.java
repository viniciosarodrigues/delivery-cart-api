package br.com.niv.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.niv.cart.domain.Order;
import br.com.niv.cart.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping
	public ResponseEntity<Order> save(@RequestBody Order order) {
		return ResponseEntity.ok(orderService.save(order));
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable("id") Long id) {
		return ResponseEntity.ok(orderService.findById(id));
	}

	@GetMapping
	public ResponseEntity<Iterable<Order>> findAll() {
		return ResponseEntity.ok().body(orderService.findAll());
	}

	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		orderService.delete(id);
		return ResponseEntity.ok().build();
	}
}