package com.app.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.app.batch.bean.PersonBean;

public class WriterForApplication implements ItemWriter<PersonBean> {

	@Override
	public void write(List<? extends PersonBean> items) throws Exception {
		// TODO Auto-generated method stub

	}

}
