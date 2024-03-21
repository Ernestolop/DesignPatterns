package com.elopez.design.patterns.structurals.adapter;

import com.elopez.design.patterns.structurals.adapter.App.CodeAdapter;
import com.elopez.design.patterns.structurals.adapter.App.GenerateCode;
import com.elopez.design.patterns.structurals.adapter.service.GenerateCodeImpl;

public class Client {
    public static void main(String[] args) {
        GenerateCode generateCode = new CodeAdapter(new GenerateCodeImpl());
        String code = generateCode.generateCode();
        System.out.println("Generated code: " + code);
    }
}
