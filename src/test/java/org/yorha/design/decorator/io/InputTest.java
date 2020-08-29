package org.yorha.design.decorator.io;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.yorha.design.decorator.beverage.StarbuzzCoffee;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
public class InputTest {

	private static final Logger logger = LoggerFactory.getLogger(StarbuzzCoffee.class);

	@Test
	void contextLoads() {
		int c;
		// ClassPathResource类的构造方法接收路径名称，自动去classpath路径下找文件
		ClassPathResource classPathResource = new ClassPathResource("test.txt");
		try (FileInputStream fileInputStream = new FileInputStream(classPathResource.getFile());
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
				InputStream in = new LowerCaseInputStream(bufferedInputStream)) {
			while ((c = in.read()) >= 0) {
				logger.info(String.valueOf((char) c));
			}
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

}
