package com.<-structure->.beans;

//imports

/**
 * Documentation
 * 
 */
public class NameDataBean implements SmartDataBean { //extends SmartDataBeanImpl to avoid implementing overridden methods

	private CommandContext iCommandContext;
	private TypedProperty iRequestProperties;

	//class members
	//<type> <variableName>
	//<type> <variableName>
	private ServerJDBCHelperAccessBean jdbcHelper;

	// This method is called when the bean class is initialized
	// Logic to load data into class members goes here
	@Override
	public void populate() throws Exception { //Exception should be ECSystemException

		//using jdbc helper example
		jdbcHelper = new ServerJDBCHelperAccessBean();
		variableName = beanHelperMethod();
	}


	public Vector beanHelperMethod() throws RemoteException, NamingException,
	CreateException, SQLException {

		//And example from CSR to use JDBC helper
		Vector resultSet = null;
		ArrayList params = new ArrayList();
		StringBuffer sqlSB = new StringBuffer(CSRConstants.FIND_GUEST_USER);

		/*		
		constant value is,
		public static final String FIND_GUEST_USER = "SELECT A.MEMBER_ID, A.FIRSTNAME, A.LASTNAME, A.ADDRESS1, A.CITY, A.STATE, A.ZIPCODE, A.PHONE1 FROM USERS U "
			+ "JOIN ADDRESS A ON U.USERS_ID = A.MEMBER_ID WHERE U.REGISTERTYPE = 'G' AND A.STATUS = 'P' AND (A.ADDRESSTYPE = 'SB' OR A.ADDRESSTYPE = 'B') ";
		 */

		if (StringUtils.isNotEmpty(firstname)) {
			/*
			constant value is,
			public static final String WHERE_FIRSTNAME = "AND UPPER(A.FIRSTNAME) LIKE ? ";
			 */
			sqlSB.append(CSRConstants.WHERE_FIRSTNAME);
			params.add(firstname.toUpperCase());
		}
		if (StringUtils.isNotEmpty(lastname)) {
			sqlSB.append(CSRConstants.WHERE_LASTNAME);
			params.add(lastname.toUpperCase());
		}
		if (StringUtils.isNotEmpty(email1)) {
			sqlSB.append(CSRConstants.WHERE_EMAIL);
			params.add(email1.toUpperCase());
		}
		if (StringUtils.isNotEmpty(zipcode)) {
			sqlSB.append(CSRConstants.WHERE_ZIPCODE);
			params.add(zipcode);
		}
		if (StringUtils.isNotEmpty(phone1)) {
			sqlSB.append(CSRConstants.WHERE_PHONE);
			params.add(phone1);
		}
		sqlSB.append(CSRConstants.QUERY_CLOSE);

		if (params.size() > 0) {
			resultSet = jdbcHelper.executeParameterizedQuery(sqlSB.toString(),
					params.toArray());
		}


		return resultSet;
	}


	@Override
	public CommandContext getCommandContext() {
		return iCommandContext;
	}

	@Override
	public void setCommandContext(CommandContext aCommandContext) {
		iCommandContext = aCommandContext;
	}

	@Override
	public TypedProperty getRequestProperties() {
		return iRequestProperties;
	}

	@Override
	public void setRequestProperties(TypedProperty aRequestProperties)
	throws Exception {
		iRequestProperties = aRequestProperties;
	}


	// getters and setters

}
