package com.azish.designpattern.structural.decorator.sample2;

public class SupportLinkDecorator extends ColumnDecorator {

    public SupportLinkDecorator(Report report) {
        super(report);
    }

    public String getFirstColumnData() {
        return addMoreInfo (super.getFirstColumnData()) ;
    }

    private String addMoreInfo(String data){
        return data  + " - support link - ";
    }
}
