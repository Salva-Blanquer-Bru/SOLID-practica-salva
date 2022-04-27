package com.kreitek.Files.files;

import com.kreitek.Interfaces.FileOperator;

public  class File extends FileSystemItemBase implements FileOperator {

    private boolean isOpen = false;

    private int position = 0;

    private int size = 0;

    @Override
    public void open() {

        isOpen = true;
    }

    public File(String name) {

        super(name);
    }

    @Override
    public void write(byte[] buffer) {

        size += buffer.length;

        position += buffer.length;
    }

    @Override
    public int getSize(){

        return size;
    }

    @Override
    public void close() {

        isOpen = false;

}}

