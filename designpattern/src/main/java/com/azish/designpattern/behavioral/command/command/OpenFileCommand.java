package com.azish.designpattern.behavioral.command.command;

import com.azish.designpattern.behavioral.command.filesystemtype.FileSystemReceiver;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }

}
