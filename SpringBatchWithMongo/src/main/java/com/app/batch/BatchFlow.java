package com.app.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;

import org.springframework.context.annotation.Bean;

import com.app.batch.bean.ApplicationBean;
import com.app.batch.processor.ProcessorForApplication;
import com.app.batch.reader.ReaderForApplication;
import com.app.batch.writer.WriterForApplication;

public class BatchFlow {

	@Bean
	public Job batchJobForApplication(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) {

		return jobBuilderFactory.get("application").incrementer(new RunIdIncrementer())
				.start(applicationStep(stepBuilderFactory)).build();

	}

	@Bean
	public Step applicationStep(StepBuilderFactory stepBuilderFactory) {
		return stepBuilderFactory.get("step").allowStartIfComplete(true).<ApplicationBean, ApplicationBean>chunk(1)
				.reader(reader()).processor(processor()).writer(writer()).build();
	}

	private ItemWriter<ApplicationBean> writer() {
		return new WriterForApplication();
	}

	private ItemProcessor<ApplicationBean, ApplicationBean> processor() {
		return  new ProcessorForApplication();
	}

	private ItemReader<ApplicationBean> reader() {
		return new ReaderForApplication();
	}

}
