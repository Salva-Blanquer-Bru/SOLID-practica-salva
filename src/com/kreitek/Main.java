package com.kreitek;

import com.kreitek.Files.files.FileSystemItemBase;
import com.kreitek.Utils.FileSystemBuilder;
import com.kreitek.Utils.FileSystemPrinter;

public class Main {

    public static void main(String[] args) {

        FileSystemItemBase root = TestFileSystem();

        Result(root);
    }

    private static void Result(FileSystemItemBase root) {

        System.out.println(

                "#********************#\n" +
                "* Resultado esperado *\n" +
                "#********************#\n" +
                "/ = 382 bytes\n" +
                "\t/readme.txt = 42 bytes\n" +
                "\t/src = 190 bytes\n" +
                "\t\t/src/main.java = 10 bytes\n" +
                "\t\t/src/hello.txt = 50 bytes\n" +
                "\t\t/src/resources = 130 bytes\n" +
                "\t\t\t/src/resources/icon.ico = 30 bytes\n" +
                "\t\t\t/src/resources/index.html = 100 bytes\n" +
                "\t/doc = 150 bytes\n" +
                "\t\t/doc/manual.md = 150 bytes\n\n" +
                "---------------------------------------------------\n\n" +
                "#********************#\n" +
                "* Resultado Final      *\n" +
                "#********************#");

        FileSystemPrinter.print(root, 0);
    }

    private static FileSystemItemBase TestFileSystem() {

        return FileSystemBuilder.getBuilder()

                .addFile("readme.txt", 42)
                .addDirectory("src")
                .addFile("main.java", 10)
                .addFile("hello.txt", 50)
                .addDirectory("resources")
                .addFile("icon.ico", 30)
                .addFile("index.html", 100)
                .upOneDirectory()
                .upOneDirectory()
                .addDirectory("doc")
                .addFile("manual.md", 150)
                .build();

}}
