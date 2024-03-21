package com.elopez.design.patterns.structurals.adapter.service;

public class GenerateCodeImpl implements GenerateCode{
    
    @Override
    public int generateCode() {
        return Math.abs((int) (Math.random() * 100));
    }
}
