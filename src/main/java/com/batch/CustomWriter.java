package com.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomWriter implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> arg0) throws Exception {

	
		System.out.println("CustomWriter >> " + Thread.currentThread().getId() +" - " + ((List)arg0).size() +" " + arg0);
		
		//************** simulation, 2 seconds per pdf, MUST BE DELETED  *******************
		Thread.sleep(((List)arg0).size()*2000);
		
		
	}

}
