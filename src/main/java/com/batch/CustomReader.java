package com.batch;



import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;


public class CustomReader implements ItemReader<String> {
	
	private int counter;
	
	@Override
	public synchronized String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		
		counter = Utils.getActualCounter();
		
		// The step ends when the reader returns null.
		if(counter>15){
			return null;
		}
		
		final String val = Utils.getFiles().get(counter);
		
		return val;
	}

}
