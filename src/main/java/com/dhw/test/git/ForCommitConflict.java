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
		System.out.println("B在A解决冲突并提交后，推上前，抢先提交。");
		System.out.println("B在A解决冲突并提交后，推上前，抢先提交，A恰好没pull而是直接push。");
		System.out.println("测试强推覆盖，B提交");
		System.out.println("测试强推覆盖，A要冲突了");
		
		System.out.println("测试强推覆盖，B提交");
		System.out.println("测试强推覆盖，A要冲突了");
		
		System.out.println("测试强推覆盖，B提交，A修改");
	}
	
	public void methodB() {
		System.out.println("local machine another method");
		System.out.println("web add...");
	}
	
	public void methodC() {
		System.out.println("machine no conflict old commit，machine update later");
		System.out.println("machine no conflict old commit , web update");
		System.out.println("machine resolved");
		System.out.println("web add new");
		System.out.println("machine add");
		System.out.println("machine add 001");
		System.out.println("machine add 002");
		System.out.println("machine add 003");
	}
	
	public void methodD() {
		System.out.println("machine add new");
		System.out.println("web add 2021年4月17日01:56:22");
		System.out.println("web add 2021年4月17日01:57:39");
		System.out.println("web add 001");
		System.out.println("web add 002");
		System.out.println("web add 003");
		System.out.println("machine add 004");
		System.out.println("web add 004 udpate-");
		System.out.println("web add 004 update+，2021年4月17日23:10:45");
		System.out.println("web add 004 update+，2021年4月17日23:10:26");
	}
	
	public static void main(String[] args) {
		// 两种解决冲突的方式和原理。
	}
}
