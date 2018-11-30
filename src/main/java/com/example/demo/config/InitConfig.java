package com.example.demo.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * <dl>
 * <dt>InitConfig</dt>
 * <dd>Description:</dd>
 * </dl>
 *
 * @author nanrt
 */
@Component
public class InitConfig implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		/**
		 * 这里可以添加一些其他逻辑，这里只是做一个演示，具体是实现了ApplicationRunner
		 */

		System.out.println("我启动了");

	}
}
