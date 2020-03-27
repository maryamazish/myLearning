package com.azish.designpattern.j2ee.interceptingfilterpattern;

class Client
{
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager)
    {
        this.filterManager = filterManager;

    }

    public void sendRequest(String request)
    {
        filterManager.filterRequest(request);
    }
}
