package com.sample.design.patterns.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;

	private String getUser(String user, String password) {
		return "admin";
	}

	public CommandExecutorProxy(String user, String pwd) {
		if (!getUser(user, pwd).isEmpty()) {
			isAdmin = true;
			String role = getUser(user, pwd);
			if (role.equalsIgnoreCase("ADMIN")) {
				executor = new CommandExecutorImpl();
			} else {
				// executor = new CommandNewExecutorImpl();
			}
		}

	}

	@Override
	public void execute(String cmd) throws Exception {
		if (isAdmin) {
			executor.execute(cmd);
		} else {
			if (cmd.trim().startsWith("clear")) {
				throw new Exception(cmd + " command is not allowed for non-admin users.");
			} else {
				executor.execute(cmd);
			}
		}
	}
}