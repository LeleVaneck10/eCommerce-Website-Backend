package com.lele.eCommerce.repository;

import com.lele.eCommerce.model.Cart;
import com.lele.eCommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}