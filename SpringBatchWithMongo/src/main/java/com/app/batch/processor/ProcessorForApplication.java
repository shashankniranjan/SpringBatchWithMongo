package com.app.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.app.batch.bean.ApplicationBean;

public class ProcessorForApplication implements ItemProcessor<ApplicationBean, ApplicationBean> {

	@Override
	public ApplicationBean process(ApplicationBean item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
