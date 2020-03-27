package com.azish.designpattern.structural.decorator.sample2;

public class SupportPopupDecorator extends ColumnDecorator {

    public SupportPopupDecorator(Report report) {
        //  invoke superclass's constructor
        super(report);
    }

    public String getFirstColumnData() {
        return addPopup (super.getFirstColumnData()) ;
    }

    private String addPopup(String data){
        return data  + " - support popup - ";
    }
}
