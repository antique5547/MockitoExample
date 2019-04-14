package com.antique.mockito.unittesting.unittesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antique.mockito.unittesting.unittesting.model.Item;

@RestController
public class ItemsController {
@GetMapping(value="dummy-items")
public Item getDummyItem() {
	return new Item(1,"Ball",10,100);
}
}
