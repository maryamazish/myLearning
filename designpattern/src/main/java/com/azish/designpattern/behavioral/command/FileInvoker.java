package com.azish.designpattern.behavioral.command;

import com.azish.designpattern.behavioral.command.command.Command;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command c){
        this.command=c;
    }

    public void execute(){
        this.command.execute();
    }
}
