package com.weidoubaobao.duying.service;


import com.weidoubaobao.duying.entity.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();
    void add(Guest guest);
    void update(Guest guest);
    Guest get(String name);
    void delete(String name);
}
