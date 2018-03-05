package development;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {
	private  ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	public  ArrayList<Vehicle> readFile() { 	
		String line;
		try {
			FileReader fileread = new FileReader("vehicles.dat");
			BufferedReader read =new BufferedReader(fileread);
			line=read.readLine();
			while(line!=null) {
				String[] linearray=line.split(", ");
				Vehicle vec=new Vehicle(linearray[0],linearray[1],Integer.parseInt(linearray[2]),Double.parseDouble(linearray[3]),Double.parseDouble(linearray[4]),VehicleType.valueOf(linearray[5].toUpperCase()));
				vehicleList.add(vec);	
				line=read.readLine();
			}
			read.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}
}
