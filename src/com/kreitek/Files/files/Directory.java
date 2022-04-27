package com.kreitek.Files.files;

import com.kreitek.Interfaces.FileChanges;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItemBase implements FileChanges {


    private final List<FileSystemItemBase> files;

    public Directory(String name) {

        super(name);

        files = new ArrayList<>();
    }

    @Override
    public void addFile(FileSystemItemBase file) {

        if (!getFiles().contains(file)) {

            getFiles().add(file);

            file.setParent(this);
        }
    }

    @Override
    public int getSize() {

        int size = 0;

        for (FileSystemItemBase file : getFiles()){

            size += file.getSize();
        }
        return size;
    }

    public List<FileSystemItemBase> getFiles() {

        return files;

}}
