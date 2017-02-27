/**
 * 
 */
package com.josh.code.general;

import java.io.File;

/**
 * @author munish
 *
 */
public class FindFileOrFolderSize {

	 
		public static void main(String[] args) {
			File file = new File("/Users/munish/dell/eclipse_workspaces/newStuff/javatest/src/com/josh/learn");
			long size = 0;
			size = getFileFolderSize(file);
	 
			double sizeMB = (double) size / 1024 / 1024;
			String s = " MB";
			if (sizeMB < 1) {
				sizeMB = (double) size / 1024;
				s = " KB";
			}
				
			System.out.println(file.getName()+ " (in bytes) : "+size);
			System.out.println(file.getName() + " : " + sizeMB + s);
		}
	 
		public static long getFileFolderSize(File dir) {
			long size = 0;
			if (dir.isDirectory()) {
				for (File file : dir.listFiles()) {
					if (file.isFile()) {
						size += file.length();
					} else
						size += getFileFolderSize(file);
				}
			} else if (dir.isFile()) {
				size += dir.length();
			}
			return size;
		}
	}
