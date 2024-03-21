package com.elopez.design.patterns.structurals.adapter.App;

public class CodeAdapter implements GenerateCode{

    private com.elopez.design.patterns.structurals.adapter.service.GenerateCode generateCode;

    public CodeAdapter(com.elopez.design.patterns.structurals.adapter.service.GenerateCode generateCode) {
        this.generateCode = generateCode;
    }

    @Override
    public String generateCode() {
        return String.valueOf(generateCode.generateCode());
    }
    
}
