package br.com.niv.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.niv.cart.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
