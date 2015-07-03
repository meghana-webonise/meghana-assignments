import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.MultiValueMap;

public class ReadCVS {

	public void run(String s) {

		String csvFile = "/home/webonise/Downloads/sample_data.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		List list;

		try {

			br = new BufferedReader(new FileReader(csvFile));
			MultiValueMap hmItem = new MultiValueMap();

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] Restaurant = line.split(cvsSplitBy, 3);

				hmItem.put(Restaurant[0], Restaurant[2]);

				/*
				 * System.out.println("Restaurant[code= " + Restaurant[0] +
				 * " , price=" + Restaurant[1] + " , item_label1=" +
				 * Restaurant[2] +
				 * 
				 * "]");
				 */

			}

			Set entrySet = hmItem.entrySet();
			Iterator it = entrySet.iterator();
			System.out.println("  Object key  Object value");
			while (it.hasNext()) {
				Map.Entry mapEntry = (Map.Entry) it.next();
				list = (List) hmItem.get(mapEntry.getKey());
				
				for (int j = 0; j < list.size(); j++) {
					System.out.println("\t" + mapEntry.getKey() + "\t  "
							+ list.get(j));
							
				String item=list.get(j).toString();
				String id =mapEntry.getKey().toString();
				if(item.contains(s)){
					run1(id);
					System.out.println("found");
				}
				
				}
					
				}
				

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
	}

	public void run1(String object) {

		String csvFile = "/home/webonise/Downloads/sample_data.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		List list1;

		try {

			br = new BufferedReader(new FileReader(csvFile));
			MultiValueMap hmItem = new MultiValueMap();
			MultiValueMap hmPrice = new MultiValueMap();

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] Restaurant = line.split(cvsSplitBy, 3);

				hmPrice.put(Restaurant[0], Restaurant[1]);

				/*
				 * System.out.println("Restaurant[code= " + Restaurant[0] +
				 * " , price=" + Restaurant[1] + " , item_label1=" +
				 * Restaurant[2] +
				 * 
				 * "]");
				 */

			}

			Set entrySet = hmPrice.entrySet();
			Iterator it1 = entrySet.iterator();
			//System.out.println("  Object key  Object value");
			while (it1.hasNext()) {
				Map.Entry mapEntry1 = (Map.Entry) it1.next();
				list1 = (List) hmPrice.get(mapEntry1.getKey());
				for (int j = 0; j < list1.size(); j++) {
					System.out.println("\t" + mapEntry1.getKey() + "\t  "
							+ list1.get(j));
					
					if(object.equals( mapEntry1.getKey().toString())){

						System.out.println("found price "+ list1.get(j));
					}
				}

			}

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
	}

	/*public void get(String s) {

		String csvFile = "/home/webonise/Downloads/sample_data.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		List list;

		try {
			br = new BufferedReader(new FileReader(csvFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		MultiValueMap hmItem = new MultiValueMap();
		try {
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] Restaurant = line.split(cvsSplitBy, 3);

				hmItem.put(Restaurant[0], Restaurant[1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set entrySet = hmItem.entrySet();
		Iterator it = entrySet.iterator();
		//System.out.println("  Object key  Object value");
		while (it.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) it.next();
			list = (List) hmItem.get(mapEntry.getKey());
			for (int j = 0; j < list.size(); j++) {
				
				String item=list.get(j).toString();
				if(item.contains(s)){
					System.out.println("found");
				}
			}
	}
		}*/
}

