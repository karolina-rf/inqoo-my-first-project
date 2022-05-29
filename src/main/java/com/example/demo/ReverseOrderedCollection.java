package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Profile("reverse")
public class ReverseOrderedCollection implements OrderedStorage {

    private List<Integer> list = new ArrayList<>();

    @Override
    public void add(Integer number) {
        list.add(number);

    }

    @Override
    public List<Integer> getAll() {
         Collections.reverse(list);
         return list;
    }
}
