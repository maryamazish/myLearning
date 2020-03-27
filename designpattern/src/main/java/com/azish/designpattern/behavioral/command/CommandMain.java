//https://www.journaldev.com/1624/command-design-pattern

package com.azish.designpattern.behavioral.command;
import com.azish.designpattern.behavioral.command.command.CloseFileCommand;
import com.azish.designpattern.behavioral.command.command.OpenFileCommand;
import com.azish.designpattern.behavioral.command.command.WriteFileCommand;
import com.azish.designpattern.behavioral.command.filesystemtype.FileSystemReceiver;
import com.azish.designpattern.behavioral.command.filesystemtype.UnixFileSystemReceiver;
import com.azish.designpattern.behavioral.command.filesystemtype.WindowsFileSystemReceiver;

public class CommandMain {
    public static void main(String[] args) {

        FileSystemReceiver  fileSystemReceiver = new WindowsFileSystemReceiver();
        //FileSystemReceiver  fileSystemReceiver = new UnixFileSystemReceiver();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);
        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
