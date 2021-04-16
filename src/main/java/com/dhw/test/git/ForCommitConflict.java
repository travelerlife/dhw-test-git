package com.dhw.test.git;

/**
 * 用于解决冲突的演示。
 * @author haiwei.deng
 * @time 2021年4月17日 上午1:13:43
 */
public class ForCommitConflict {
	
	public void methodA() {
		System.out.println("local machine again");
		System.out.println("local machine");
		System.out.println("web commit");
		System.out.println("web commit again");
		System.out.println("local machine");
		System.out.println("local machine");
	}
	
	public void methodB() {
		System.out.println("local machine another method");
		System.out.println("web add...");
	}
	
	public void methodC() {
		System.out.println("machine no conflict old commit，machine update later");
	}
	
}
