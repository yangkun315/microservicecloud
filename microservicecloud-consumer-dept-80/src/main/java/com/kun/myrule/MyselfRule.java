package com.kun.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MyselfRule {
	
	@Bean
	public IRule myRule() {
		//return new RandomRule();//ribbon默认轮询,我自定义为随机
		return new RandomRule_BK();//自定义的算法
	}
}
