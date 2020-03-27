package com.azish.designpattern.structural.adapter;

public class EmployeeDtoAdapter extends Emplyee {

    EmplyeeDto emplyeeDto = new EmplyeeDto();

    public EmployeeDtoAdapter(EmplyeeDto emplyeeDto) {
        this.emplyeeDto = emplyeeDto;
    }

    @Override
    public Integer getId() {
        return emplyeeDto.getId();
    }

    @Override
    public String getFullName() {
        return emplyeeDto.getFirsName() + " " + emplyeeDto.getLastName();
    }
}
