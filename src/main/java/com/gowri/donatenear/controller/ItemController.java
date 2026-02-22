package com.gowri.donatenear.controller;

import com.gowri.donatenear.entity.Item;
import com.gowri.donatenear.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping
    public List<Item> getItems() {
        return itemService.getAllItems();
    }
}