/**
 * 
 */
package com.josh.code.tfly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.StringTokenizer;

/**
 * @author munish
 *
 */
public class TicketFly {

	//

	public static void main(String[] args) {

		mergeFiles("/Users/munish/dell/eclipse_workspaces/newStuff/javatest/src/com/josh/ticketfly/city.txt", "");
		
		
	}

	private static void mergeFiles(String f1, String f2) {

		HashMap cityAndCord = new HashMap();

		String line;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(f1);
			
			BufferedReader bread = new BufferedReader(fileReader);

			BufferedReader br = Files.newBufferedReader(Paths.get(f1));

			while ((line = br.readLine()) != null) {

				String firstToken = null;
				String secondToken = null;
				String thirdToken = null;

				StringTokenizer st = new StringTokenizer(line, ",");

				if (st.countTokens() < 3) {
					continue;

				} else {

					while (st.hasMoreTokens()) {
						firstToken = st.nextToken();
						secondToken = st.nextToken();
						thirdToken = st.nextToken();

						cityAndCord.put(firstToken, new Coordinates(secondToken, thirdToken));

					}

				}

			}

			for (Iterator iterator = cityAndCord.entrySet().iterator(); iterator.hasNext();) {
				Entry type = (Entry<String, Coordinates>) iterator.next();
				
				System.out.println("key = "+type.getKey());
				System.out.println("Value = "+type.getValue());
			}
	
			// Always close files.
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + f1 + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + f2 + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

	}

}

class Coordinates{
	
	String longi;
	String lati;
	
	public Coordinates(String longi, String lati) {
	
		this.longi = longi;
		this.lati = lati;
		
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coordinates [longi=");
		builder.append(longi);
		builder.append(", lati=");
		builder.append(lati);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}



