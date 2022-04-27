package com.kreitek.Interfaces;

public interface FileOperator {

    void open();

    void write(byte[] buffer);

    void close();

}
