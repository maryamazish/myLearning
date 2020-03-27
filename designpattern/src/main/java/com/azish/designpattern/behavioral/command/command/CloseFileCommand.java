package com.azish.designpattern.behavioral.command.command;

import com.azish.designpattern.behavioral.command.filesystemtype.FileSystemReceiver;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}
