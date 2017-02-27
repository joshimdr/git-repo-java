package com.josh.code.learn2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();

		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");
		ht.put(4, "four");
		// ht.put(5,null);

		Set<Entry> entrySet = ht.entrySet();
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());

		}

		System.out.println(" *** *** *** *** *** *** ");

		for (Iterator iterator2 = ht.keySet().iterator(); iterator2.hasNext();) {
			int key = (int) iterator2.next();
			System.out.println("key:" + key + " value:" + ((ht.get(key) == null) ? "null" : ht.get(key)));
		}
		
		
		Charset utf8 = StandardCharsets.UTF_8;
		List<String> lines = Arrays.asList("1st line", "2nd line");
		byte[] data = {1, 2, 3, 4, 5};
		String stringToWrite = "This is the a string going to file";
		
		 
		

		try {
			
			/*
		    Files.write(Paths.get("file1.bin"), data);
		    Files.write(Paths.get("file2.bin"), data,
		            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		    Files.write(Paths.get("file3.txt"), "content".getBytes());
		    Files.write(Paths.get("file4.txt"), "content".getBytes(utf8));
		    Files.write(Paths.get("file5.txt"), lines, utf8);
		    Files.write(Paths.get("file6.txt"), lines, utf8,
		            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		            
		            */
		    Files.write(Paths.get("writeToFile.txt"), Arrays.asList(stringToWrite), utf8);
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		Path sampleOutputPath = Paths.get("writeToFile2.txt");
				BufferedWriter writer = null;
				try {
					writer = Files.newBufferedWriter(sampleOutputPath);
					writer.write("Hello, world!");
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(writer!=null){
					try {
						writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
				
		
		
		

	}

}
