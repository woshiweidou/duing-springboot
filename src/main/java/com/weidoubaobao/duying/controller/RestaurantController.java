package com.weidoubaobao.duying.controller;

import com.weidoubaobao.duying.entity.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class RestaurantController {

    @GetMapping
    public String list(){
        return "list";
    }

    @PostMapping
    public String add(){
        return "add";
    }

    @DeleteMapping
    public String delete(){
        return "delete";
    }

    @PutMapping
    public String put(){
        return "put";
    }
}
