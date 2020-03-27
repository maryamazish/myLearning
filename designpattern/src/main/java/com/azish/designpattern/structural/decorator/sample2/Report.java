package com.azish.designpattern.structural.decorator.sample2;

public interface Report {
    public Object[][] getReportData(final String reportId);
    public String getFirstColumnData();
}
