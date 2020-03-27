package com.azish.designpattern.behavioral.command.filesystemtype;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
