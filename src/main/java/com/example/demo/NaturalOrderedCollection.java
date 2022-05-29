package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Profile("natural")
public class NaturalOrderedCollection implements OrderedStorage {

    private List<Integer> list = new ArrayList<>();

    @Override
    public void add(Integer number) {
        list.add(number);
    }

    @Override
    public List<Integer> getAll() {
        return list;
    }
}
