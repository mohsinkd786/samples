package com.sample.design.patterns.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void execute(String cmd) throws Exception {
		// some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}
}
