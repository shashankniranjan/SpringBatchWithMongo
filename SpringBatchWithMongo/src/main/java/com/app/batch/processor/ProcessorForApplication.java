package com.app.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.app.batch.bean.PersonBean;

public class ProcessorForApplication implements ItemProcessor<PersonBean, PersonBean> {

	@Override
	public PersonBean process(PersonBean item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
