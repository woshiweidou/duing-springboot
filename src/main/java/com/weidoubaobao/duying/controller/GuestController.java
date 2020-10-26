package com.weidoubaobao.duying.controller;

import com.weidoubaobao.duying.entity.Guest;
import com.weidoubaobao.duying.service.GuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
//放在类上面说明类当中的方法以此开头
public class GuestController {
    @Autowired
    private GuestServiceImpl guestService;

    //@
    @GetMapping()
    public String list(Model model){
        List<Guest> list = guestService.list();
        model.addAttribute("guestlist",list);
        return "/thymeleaf/list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "/thymeleaf/add";
    }

   @PostMapping
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }


    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "/thymeleaf/update";
    }

    @PutMapping
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }

   @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";
    }
}
