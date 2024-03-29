package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public  void readFile()  {
        ClassLoader classLoader=getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
       // Path path = Paths.get(file.getPath());
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("blad.........................." + e);
        }finally {
            System.out.println("blad finally..........................") ;
        }
        //System.out.println("blad.........................."+e);
        //System.out.println(file.getPath());
    }
}
