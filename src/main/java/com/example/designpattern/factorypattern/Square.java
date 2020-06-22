package com.example.designpattern.factorypattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square implements Shape{

    @Override
    public void draw() {
        log.info("I am draw Square!");
    }

}
