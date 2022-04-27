package com.kreitek.Utils;

import com.kreitek.Files.files.Directory;
import com.kreitek.Files.files.File;
import com.kreitek.Files.files.FileSystemItemBase;

public class FileSystemBuilder {

    private final Directory root;

    private Directory currentDirectory;

    public FileSystemBuilder addFile(String name, int size) {

        File file = new File(name);

        file.open();

        file.write(new byte[size]);

        file.close();

        currentDirectory.addFile(file);

        return this;
    }

    public FileSystemBuilder() {

        root = new Directory("");

        currentDirectory = root;
    }

    public static FileSystemBuilder getBuilder() {

        return new FileSystemBuilder();
    }

    public FileSystemBuilder addDirectory(String name) {

        Directory directory = new Directory(name);

        currentDirectory.addFile(directory);

        currentDirectory = directory;

        return this;
    }

    public FileSystemBuilder upOneDirectory() {

        if (currentDirectory.getParent() != null) {

            currentDirectory = (Directory) currentDirectory.getParent();
        }
        return this;
    }

    public FileSystemItemBase build() {

        return root;

}}