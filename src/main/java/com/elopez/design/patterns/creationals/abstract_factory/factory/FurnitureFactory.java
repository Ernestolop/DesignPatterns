package com.elopez.design.patterns.creationals.abstract_factory.factory;

import com.elopez.design.patterns.creationals.abstract_factory.chair.Chair;
import com.elopez.design.patterns.creationals.abstract_factory.couch.Couch;
import com.elopez.design.patterns.creationals.abstract_factory.table.Table;

public interface FurnitureFactory {
    public Chair createChair();
    public Couch createCouch();
    public Table createTable();
}
