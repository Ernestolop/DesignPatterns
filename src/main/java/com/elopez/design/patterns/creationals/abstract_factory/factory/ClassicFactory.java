package com.elopez.design.patterns.creationals.abstract_factory.factory;

import com.elopez.design.patterns.creationals.abstract_factory.chair.Chair;
import com.elopez.design.patterns.creationals.abstract_factory.chair.ClassicChair;
import com.elopez.design.patterns.creationals.abstract_factory.couch.Couch;
import com.elopez.design.patterns.creationals.abstract_factory.couch.ClassicCouch;
import com.elopez.design.patterns.creationals.abstract_factory.table.ClassicTable;
import com.elopez.design.patterns.creationals.abstract_factory.table.Table;

public class ClassicFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Couch createCouch() {
        return new ClassicCouch();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
