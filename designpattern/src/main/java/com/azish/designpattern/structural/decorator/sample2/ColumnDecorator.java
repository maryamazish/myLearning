package com.azish.designpattern.structural.decorator.sample2;

public abstract class ColumnDecorator implements Report
{
    private Report report;

    public ColumnDecorator(Report report){
        this.report = report;
    }

    public String getFirstColumnData() {
        return report.getFirstColumnData();
    }

    public Object[][] getReportData(String reportId) {
        return report.getReportData(reportId);
    }
}
