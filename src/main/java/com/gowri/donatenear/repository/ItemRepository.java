package com.gowri.donatenear.repository;

import com.gowri.donatenear.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}