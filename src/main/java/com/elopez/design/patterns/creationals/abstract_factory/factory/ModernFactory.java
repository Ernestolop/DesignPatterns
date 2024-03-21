package com.elopez.design.patterns.creationals.abstract_factory.factory;

import com.elopez.design.patterns.creationals.abstract_factory.couch.Couch;
import com.elopez.design.patterns.creationals.abstract_factory.table.Table;
import com.elopez.design.patterns.creationals.abstract_factory.chair.Chair;
import com.elopez.design.patterns.creationals.abstract_factory.couch.ModernCouch;
import com.elopez.design.patterns.creationals.abstract_factory.table.ModernTable;
import com.elopez.design.patterns.creationals.abstract_factory.chair.ModernChair;

public class ModernFactory implements FurnitureFactory{
    
    public Couch createCouch() {
        return new ModernCouch();
    }
    
    public Table createTable() {
        return new ModernTable();
    }

    public Chair createChair() {
        return new ModernChair();
    }
}
