package com.josh.code.general3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by munish on 5/3/17.
 */
public class FileReaderClass {

    static Set<String> set = new HashSet<String>();
    static Set<String> set2 = new HashSet<String>();

    static Map<String,String> map = new HashMap<String,String>();

    public static void main(String[] args) {
        set = readingFiles("abc.txt" );
        set2 = readingFiles("abc2.txt");

        map = readingFilesMap("abc.txt");


        if (set.size() < set2.size()) {

            for (String commonString : set) {

                if (set2.contains(commonString)) {
                    System.out.println(commonString);
                }
            }
        } else {
            for (String commonString : set2) {


                if (set.contains(commonString)) {
                    System.out.println(commonString);
                }

            }
        }
    }


    public static Set readingFiles(String file) {

        //List<String> list = new ArrayList<String>();

        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        lines = lines.filter(line -> line.trim().length() > 0)
                .map(line -> line.substring(line.lastIndexOf(" ")));

        return lines.collect(Collectors.toSet());//.forEach(System.out::print);
        //lines.forEach(Collections.list());


        //set.forEach(System.out::print);


    }


    public static Map readingFilesMap(String file) {

        //List<String> list = new ArrayList<String>();

        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* lines = lines.filter(line -> line.trim().length() > 0)
                .map(line -> line.substring(line.lastIndexOf(" ")));
*/
        Map map = lines.collect(Collectors.toMap(
                line -> line.substring(line.lastIndexOf(" ")),
                line -> line.substring(0, line.lastIndexOf(" "))
        ));//.forEach(System.out::print);
        //lines.forEach(Collections.list());

        map.forEach((k, v) -> {
            System.out.println("key:"+k+ " Value="+v);
        } );
        return map;

        //set.forEach(System.out::print);


    }
}
