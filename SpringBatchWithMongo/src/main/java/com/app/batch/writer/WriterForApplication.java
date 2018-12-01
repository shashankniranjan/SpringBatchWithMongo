package com.app.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.app.batch.bean.ApplicationBean;

public class WriterForApplication implements ItemWriter<ApplicationBean> {

	@Override
	public void write(List<? extends ApplicationBean> items) throws Exception {
		// TODO Auto-generated method stub

	}

}
