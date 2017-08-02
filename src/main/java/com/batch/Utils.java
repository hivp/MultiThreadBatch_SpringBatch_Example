package com.batch;

import java.util.ArrayList;
import java.util.List;

public class Utils {

	private static List<String> allFiles;
	private static Integer counter = 0;
	
	
	public static synchronized List<String> getFiles(){
		if(allFiles==null){
			allFiles = new ArrayList<String>();
			
			
			for(int i=0; i<=1000; i++){
				allFiles.add(i+".pdf");
			}
		}	
		
		return allFiles;
	}
	
	public static synchronized Integer getActualCounter(){
		
		Integer value = counter;
		counter = counter+1;
		return value;
		
	}
}
