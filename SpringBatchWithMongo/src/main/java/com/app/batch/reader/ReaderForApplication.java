package com.app.batch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.batch.bean.PersonBean;
import com.mongodb.MongoClient;

public class ReaderForApplication implements ItemReader<PersonBean> {
	
	
	@Autowired
	private MongoClient mongoOperations;
	

	@Override
	public PersonBean read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		
		
		
		
		return null;
	}

}
