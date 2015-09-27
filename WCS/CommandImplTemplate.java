package com.<org-name>.commerce.<app-name-optional>.<functional-area>.commands;

//imports

/**
 * Documentation
 * 
 */
public class CommandNameCmdCmdImpl extends ControllerCommandImpl implements CommandNameCmd {

	private static final String CLASS_NAME = "com.<-structure->.CommandNameCmdCmdImpl";
	private static final String CLASS_NAME = CommandNameCmdCmdImpl.class.getName(); // can use either definition
	private Logger LOGGER = LoggingHelper.getLogger(this.getClass());

	//class members
	//private <type> <variableName>;
	//private <type> <variableName>;

	public CommandNameCmdCmdImpl() {

		// variable initialization
		// name = null;
		// name = new Boolean(false);

	}


	/*The logic implementation for this command goes here*/
	public void performExecute() throws ECException {

		String METHODNAME = "performExecute";
		if (LoggingHelper.isEntryExitTraceEnabled(LOGGER)) {
			LOGGER.entering(CLASS_NAME, METHODNAME);
		}

		// logger level usage
		// not used predominantly
		if (LOGGER.isLoggable(Level.FINE)) {
			LOGGER.entering(CLASSNAME, METHODNAME);
		}

		// Command impl logic goes here		

		//one way to log entry/data - goes to console
		LOGGER.info("Text goes here : " + variableName);

		if (LoggingHelper.isEntryExitTraceEnabled(LOGGER)) {
			LOGGER.exiting(CLASS_NAME, METHODNAME);
		}

	}

	/*Any custom method to get the work done*/
	private <returnType> customMethod() throws ECException {

		String METHODNAME = "customMethod";
		if (LoggingHelper.isEntryExitTraceEnabled(LOGGER)) {
			LOGGER.entering(CLASS_NAME, METHODNAME);
		}

		if (condition) {

			try {

				// try block

			}
			catch (Exception e) {
				throw new ECApplicationException(new ECMessage(
						ECMessageSeverity.DEFAULT_MESSAGE_MASK, ECMessageType.USER,
				"_ERR_GENERIC"), CLASSNAME, METHODNAME,
				new String[] { "Description text for Exception/ impl prime logic" });
			}

			try {

				// try block

			} catch (RemoteException e) {
				throw new ECSystemException(ECMessage._ERR_REMOTE_EXCEPTION,
						CLASS_NAME, METHODNAME);
			} catch (NamingException e) {
				throw new ECSystemException(ECMessage._ERR_NAMING_EXCEPTION,
						CLASS_NAME, METHODNAME);
			} catch (FinderException e) {
				throw new ECSystemException(ECMessage._ERR_FINDER_EXCEPTION,
						CLASS_NAME, METHODNAME);
			} catch (CreateException e) {
				throw new ECSystemException(ECMessage._ERR_CREATE_EXCEPTION,
						CLASS_NAME, METHODNAME);
			}

		}
		if (LoggingHelper.isEntryExitTraceEnabled(LOGGER)) {
			LOGGER.exiting(CLASS_NAME, METHODNAME, langId);
		}

		return <returnVariable>;
	}


	/*Gettting the paramaters from the request*/
	public void setRequestProperties(TypedProperty reqProperties)
	throws ECException {

		String METHODNAME = "setRequestProperties";

		if (LoggingHelper.isEntryExitTraceEnabled(LOGGER)) {
			LOGGER.entering(CLASS_NAME, METHODNAME);
		}

		try {

			<type> <variableName> = reqProperties.get("parameter-name");
		}

		catch(NumberFormatException e) {

			/*ECApplication throws the exception
        	It takes the following parameters(predominantly used overloaded method)
        		- ECMessage
        		- ClassName
        		- MethodName
        		- MessageParameter - this can be an object/messageString
			 */

			throw new ECApplicationException(ECMessage._ERR_BAD_MISSING_CMD_PARAMETER, getClass().getName(), "setRequestProperties", new Object[] {
				"pamameterName"
			});
		}
		catch(ParameterNotFoundException e) {
			throw new ECApplicationException(ECMessage._ERR_BAD_MISSING_CMD_PARAMETER, CLASS_NAME, "setRequestProperties", ECMessageHelper.generateMsgParms(e.getParamName()));
		}


		if (LoggingHelper.isEntryExitTraceEnabled(LOGGER)) {
			LOGGER.exiting(CLASS_NAME, METHODNAME);
		}
	}


	/*Validating the obtained request parameters based on business logic*/
	public void validateParameters() throws ECException
	{
		String METHODNAME = "validateParameters";

		if (LoggingHelper.isEntryExitTraceEnabled(LOGGER)) {
			LOGGER.entering(CLASS_NAME, METHODNAME);
		}

		try
		{
			if(condition)

				// Validation logic goes here

				// These catch blocks are another way to handle exceptions
				// Overloaded method
		}
		catch(ObjectNotFoundException ex)
		{
			iabOrder = null; //null an object/something related
		}
		catch(RemoteException e)
		{
			throw new ECSystemException(ECMessage._ERR_REMOTE_EXCEPTION, getClass().getName(), METHODNAME, ECMessageHelper.generateMsgParms(e.getMessage()), e);
		}
		catch(CreateException e)
		{
			throw new ECSystemException(ECMessage._ERR_CREATE_EXCEPTION, getClass().getName(), METHODNAME, ECMessageHelper.generateMsgParms(e.getMessage()), e);
		}
		catch(NamingException e)
		{
			throw new ECSystemException(ECMessage._ERR_NAMING_EXCEPTION, getClass().getName(), METHODNAME, ECMessageHelper.generateMsgParms(e.getMessage()), e);
		}
		catch(FinderException e)
		{
			throw new ECSystemException(ECMessage._ERR_FINDER_EXCEPTION, getClass().getName(), METHODNAME, ECMessageHelper.generateMsgParms(e.getMessage()), e);
		}

		if (LoggingHelper.isEntryExitTraceEnabled(LOGGER)) {
			LOGGER.exiting(CLASS_NAME, METHODNAME);
		}

	}

}
