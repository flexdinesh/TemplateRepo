package com.<org-name>.commerce.<app-name-optional>.<functional-area>.commands;

import com.ibm.commerce.command.ControllerCommand;

public interface CommandNameCmd extends ControllerCommand {

	public static final String CLASS_NAME = CommandNameCmd.class.getName();
	public static final String defaultCommandClassName = CommandNameCmdImpl.class.getName();

}
