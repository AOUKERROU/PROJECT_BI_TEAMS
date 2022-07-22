
package bi_team_projects.main_fournisseur_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.SQLike;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 





@SuppressWarnings("unused")

/**
 * Job: MAIN_FOURNISSEUR Purpose: <br>
 * Description:  <br>
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status 
 */
public class MAIN_FOURNISSEUR implements TalendJob {
	static {System.setProperty("TalendJob.log", "MAIN_FOURNISSEUR.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(MAIN_FOURNISSEUR.class);
	

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "MAIN_FOURNISSEUR";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_Nq93EHHPEeutNJWIfQHYSg", "0.1");
private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				MAIN_FOURNISSEUR.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(MAIN_FOURNISSEUR.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tChronometerStart_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	


public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStart_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStart_1", false);
		start_Hash.put("tChronometerStart_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStart_1";

	
		int tos_count_tChronometerStart_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tChronometerStart_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tChronometerStart_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tChronometerStart_1 = new StringBuilder();
                    log4jParamters_tChronometerStart_1.append("Parameters:");
                if(log.isDebugEnabled())
            log.debug("tChronometerStart_1 - "  + (log4jParamters_tChronometerStart_1) );
                    } 
                } 
            new BytesLimit65535_tChronometerStart_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tChronometerStart_1", "tChronometerStart_1", "tChronometerStart");
				talendJobLogProcess(globalMap);
			}
			

	
	
	Long currentTimetChronometerStart_1 = System.currentTimeMillis();
	
		log.info("tChronometerStart_1 - Start time: "+currentTimetChronometerStart_1+" milliseconds");
	
	globalMap.put("tChronometerStart_1",currentTimetChronometerStart_1);
	globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);
 



/**
 * [tChronometerStart_1 begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 


	tos_count_tChronometerStart_1++;

/**
 * [tChronometerStart_1 main ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStart_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tChronometerStart_1 - "  + ("Done.") );

ok_Hash.put("tChronometerStart_1", true);
end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tChronometerStart_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStart_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBConnection_1 = new StringBuilder();
                    log4jParamters_tDBConnection_1.append("Parameters:");
                            log4jParamters_tDBConnection_1.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("USE_TNS_FILE" + " = " + "false");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("SCHEMA_DB" + " = " + "\"DW\"");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("USER" + " = " + "\"dw\"");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:44KY+timJNl+bw2FW5aGIJ4GQamMJW3nAfAinR8Gixmlh3c=").substring(0, 4) + "...");     
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("AUTO_COMMIT" + " = " + "false");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleConnection");
                        log4jParamters_tDBConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + (log4jParamters_tDBConnection_1) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_1", "Oracle_DW", "tOracleConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
        String url_tDBConnection_1 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
    	globalMap.put("connectionType_" + "tDBConnection_1", "ORACLE_SID");
	String dbUser_tDBConnection_1 = "dw";
	
	
		 
	final String decryptedPassword_tDBConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:06QV6LWZj7YNBV3IL33ORdd58GwNRoC6AEhp8LBitDUg08g=");
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
		
			String driverClass_tDBConnection_1 = "oracle.jdbc.OracleDriver";
			java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
			globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);
		
	    		log.debug("tDBConnection_1 - Driver ClassName: "+driverClass_tDBConnection_1+".");
			
	    		log.debug("tDBConnection_1 - Connection attempt to '" + url_tDBConnection_1 + "' with the username '" + dbUser_tDBConnection_1 + "'.");
			
			conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1,dbUser_tDBConnection_1,dbPwd_tDBConnection_1);
	    		log.debug("tDBConnection_1 - Connection to '" + url_tDBConnection_1 + "' has succeeded.");
			

		globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			log.debug("tDBConnection_1 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_1.setAutoCommit(false);
	}
        globalMap.put("host_" + "tDBConnection_1","192.168.99.92");
        globalMap.put("port_" + "tDBConnection_1","15211");
        globalMap.put("dbname_" + "tDBConnection_1","BI");

	globalMap.put("dbschema_" + "tDBConnection_1", "DW");
	globalMap.put("username_" + "tDBConnection_1","dw");
	globalMap.put("password_" + "tDBConnection_1",dbPwd_tDBConnection_1);

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + ("Done.") );

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tRunJob_5Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_5_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tRunJob_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_5", false);
		start_Hash.put("tRunJob_5", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_5";

	
		int tos_count_tRunJob_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tRunJob_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tRunJob_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tRunJob_5 = new StringBuilder();
                    log4jParamters_tRunJob_5.append("Parameters:");
                            log4jParamters_tRunJob_5.append("USE_DYNAMIC_JOB" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("PROCESS" + " = " + "ODS_FOURNISSEUR");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("USE_INDEPENDENT_PROCESS" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("DIE_ON_CHILD_ERROR" + " = " + "true");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("TRANSMIT_WHOLE_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("CONTEXTPARAMS" + " = " + "[]");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("PROPAGATE_CHILD_RESULT" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("PRINT_PARAMETER" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("USE_DYNAMIC_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tRunJob_5 - "  + (log4jParamters_tRunJob_5) );
                    } 
                } 
            new BytesLimit65535_tRunJob_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tRunJob_5", "FOURNISSEUR_ODS", "tRunJob");
				talendJobLogProcess(globalMap);
			}
			


 



/**
 * [tRunJob_5 begin ] stop
 */
	
	/**
	 * [tRunJob_5 main ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	
	java.util.List<String> paraList_tRunJob_5 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_5.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_5.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_5.add("--father_node=tRunJob_5");
	      			
	        				paraList_tRunJob_5.add("--context=Default");
	      			
			if(!"".equals(log4jLevel)){
				paraList_tRunJob_5.add("--log4jLevel="+log4jLevel);
			}
		
		if(enableLogStash){
			paraList_tRunJob_5.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_5.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_5.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_5 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_5 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_5".equals(tRunJobName_tRunJob_5) && childResumePath_tRunJob_5 != null){
		paraList_tRunJob_5.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_5.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_5");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_5 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_5 = null;

	
	
		bi_team_projects.ods_fournisseur_0_1.ODS_FOURNISSEUR childJob_tRunJob_5 = new bi_team_projects.ods_fournisseur_0_1.ODS_FOURNISSEUR();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_5 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_5) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_5 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_5 : talendDataSources_tRunJob_5
			        .entrySet()) {
	            dataSources_tRunJob_5.put(talendDataSourceEntry_tRunJob_5.getKey(),
	                    talendDataSourceEntry_tRunJob_5.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_5.setDataSources(dataSources_tRunJob_5);
	    }
		  
			childJob_tRunJob_5.parentContextMap = parentContextMap_tRunJob_5;
		  
		
			log.info("tRunJob_5 - The child job 'bi_team_projects.ods_fournisseur_0_1.ODS_FOURNISSEUR' starts on the version '0.1' with the context 'Default'.");
		
		String[][] childReturn_tRunJob_5 = childJob_tRunJob_5.runJob((String[]) paraList_tRunJob_5.toArray(new String[paraList_tRunJob_5.size()]));
		
			log.info("tRunJob_5 - The child job 'bi_team_projects.ods_fournisseur_0_1.ODS_FOURNISSEUR' is done.");
		
            if(childJob_tRunJob_5.getErrorCode() == null){
                globalMap.put("tRunJob_5_CHILD_RETURN_CODE", childJob_tRunJob_5.getStatus() != null && ("failure").equals(childJob_tRunJob_5.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_5_CHILD_RETURN_CODE", childJob_tRunJob_5.getErrorCode());
            }
            if (childJob_tRunJob_5.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_5_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_5.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_5.getErrorCode();
                if (childJob_tRunJob_5.getErrorCode() != null || ("failure").equals(childJob_tRunJob_5.getStatus())) {
                    java.lang.Exception ce_tRunJob_5 = childJob_tRunJob_5.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_5!=null) ? (ce_tRunJob_5.getClass().getName() + ": " + ce_tRunJob_5.getMessage()) : ""));
                }

 


	tos_count_tRunJob_5++;

/**
 * [tRunJob_5 main ] stop
 */
	
	/**
	 * [tRunJob_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_5 end ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 
                if(log.isDebugEnabled())
            log.debug("tRunJob_5 - "  + ("Done.") );

ok_Hash.put("tRunJob_5", true);
end_Hash.put("tRunJob_5", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tRunJob_6Process(globalMap);



/**
 * [tRunJob_5 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_5 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_5_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_6_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tRunJob_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_6", false);
		start_Hash.put("tRunJob_6", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_6";

	
		int tos_count_tRunJob_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tRunJob_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tRunJob_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tRunJob_6 = new StringBuilder();
                    log4jParamters_tRunJob_6.append("Parameters:");
                            log4jParamters_tRunJob_6.append("USE_DYNAMIC_JOB" + " = " + "false");
                        log4jParamters_tRunJob_6.append(" | ");
                            log4jParamters_tRunJob_6.append("PROCESS" + " = " + "DWH___FOURNISSEUR");
                        log4jParamters_tRunJob_6.append(" | ");
                            log4jParamters_tRunJob_6.append("USE_INDEPENDENT_PROCESS" + " = " + "false");
                        log4jParamters_tRunJob_6.append(" | ");
                            log4jParamters_tRunJob_6.append("DIE_ON_CHILD_ERROR" + " = " + "true");
                        log4jParamters_tRunJob_6.append(" | ");
                            log4jParamters_tRunJob_6.append("TRANSMIT_WHOLE_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_6.append(" | ");
                            log4jParamters_tRunJob_6.append("CONTEXTPARAMS" + " = " + "[]");
                        log4jParamters_tRunJob_6.append(" | ");
                            log4jParamters_tRunJob_6.append("PROPAGATE_CHILD_RESULT" + " = " + "false");
                        log4jParamters_tRunJob_6.append(" | ");
                            log4jParamters_tRunJob_6.append("PRINT_PARAMETER" + " = " + "false");
                        log4jParamters_tRunJob_6.append(" | ");
                            log4jParamters_tRunJob_6.append("USE_DYNAMIC_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tRunJob_6 - "  + (log4jParamters_tRunJob_6) );
                    } 
                } 
            new BytesLimit65535_tRunJob_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tRunJob_6", "FOURNISSEUR_DWH", "tRunJob");
				talendJobLogProcess(globalMap);
			}
			


 



/**
 * [tRunJob_6 begin ] stop
 */
	
	/**
	 * [tRunJob_6 main ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	
	java.util.List<String> paraList_tRunJob_6 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_6.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_6.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_6.add("--father_node=tRunJob_6");
	      			
	        				paraList_tRunJob_6.add("--context=Default");
	      			
			if(!"".equals(log4jLevel)){
				paraList_tRunJob_6.add("--log4jLevel="+log4jLevel);
			}
		
		if(enableLogStash){
			paraList_tRunJob_6.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_6.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_6.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_6 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_6 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_6".equals(tRunJobName_tRunJob_6) && childResumePath_tRunJob_6 != null){
		paraList_tRunJob_6.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_6.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_6");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_6 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_6 = null;

	
	
		bi_team_projects.dwh___fournisseur_0_1.DWH___FOURNISSEUR childJob_tRunJob_6 = new bi_team_projects.dwh___fournisseur_0_1.DWH___FOURNISSEUR();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_6 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_6) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_6 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_6 : talendDataSources_tRunJob_6
			        .entrySet()) {
	            dataSources_tRunJob_6.put(talendDataSourceEntry_tRunJob_6.getKey(),
	                    talendDataSourceEntry_tRunJob_6.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_6.setDataSources(dataSources_tRunJob_6);
	    }
		  
			childJob_tRunJob_6.parentContextMap = parentContextMap_tRunJob_6;
		  
		
			log.info("tRunJob_6 - The child job 'bi_team_projects.dwh___fournisseur_0_1.DWH___FOURNISSEUR' starts on the version '0.1' with the context 'Default'.");
		
		String[][] childReturn_tRunJob_6 = childJob_tRunJob_6.runJob((String[]) paraList_tRunJob_6.toArray(new String[paraList_tRunJob_6.size()]));
		
			log.info("tRunJob_6 - The child job 'bi_team_projects.dwh___fournisseur_0_1.DWH___FOURNISSEUR' is done.");
		
            if(childJob_tRunJob_6.getErrorCode() == null){
                globalMap.put("tRunJob_6_CHILD_RETURN_CODE", childJob_tRunJob_6.getStatus() != null && ("failure").equals(childJob_tRunJob_6.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_6_CHILD_RETURN_CODE", childJob_tRunJob_6.getErrorCode());
            }
            if (childJob_tRunJob_6.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_6_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_6.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_6.getErrorCode();
                if (childJob_tRunJob_6.getErrorCode() != null || ("failure").equals(childJob_tRunJob_6.getStatus())) {
                    java.lang.Exception ce_tRunJob_6 = childJob_tRunJob_6.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_6!=null) ? (ce_tRunJob_6.getClass().getName() + ": " + ce_tRunJob_6.getMessage()) : ""));
                }

 


	tos_count_tRunJob_6++;

/**
 * [tRunJob_6 main ] stop
 */
	
	/**
	 * [tRunJob_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	

 



/**
 * [tRunJob_6 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	

 



/**
 * [tRunJob_6 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_6 end ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	

 
                if(log.isDebugEnabled())
            log.debug("tRunJob_6 - "  + ("Done.") );

ok_Hash.put("tRunJob_6", true);
end_Hash.put("tRunJob_6", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);



/**
 * [tRunJob_6 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_6 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	

 



/**
 * [tRunJob_6 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_6_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tChronometerStop_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_1", false);
		start_Hash.put("tChronometerStop_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_1";

	
		int tos_count_tChronometerStop_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tChronometerStop_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tChronometerStop_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tChronometerStop_1 = new StringBuilder();
                    log4jParamters_tChronometerStop_1.append("Parameters:");
                            log4jParamters_tChronometerStop_1.append("SINCE_BEGINNING" + " = " + "true");
                        log4jParamters_tChronometerStop_1.append(" | ");
                            log4jParamters_tChronometerStop_1.append("SINCE_STARTER" + " = " + "false");
                        log4jParamters_tChronometerStop_1.append(" | ");
                            log4jParamters_tChronometerStop_1.append("DISPLAY" + " = " + "true");
                        log4jParamters_tChronometerStop_1.append(" | ");
                            log4jParamters_tChronometerStop_1.append("DISPLAY_COMPONENT_NAME" + " = " + "true");
                        log4jParamters_tChronometerStop_1.append(" | ");
                            log4jParamters_tChronometerStop_1.append("CAPTION" + " = " + "\"\"");
                        log4jParamters_tChronometerStop_1.append(" | ");
                            log4jParamters_tChronometerStop_1.append("DISPLAY_READABLE_DURATION" + " = " + "false");
                        log4jParamters_tChronometerStop_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tChronometerStop_1 - "  + (log4jParamters_tChronometerStop_1) );
                    } 
                } 
            new BytesLimit65535_tChronometerStop_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tChronometerStop_1", "tChronometerStop_1", "tChronometerStop");
				talendJobLogProcess(globalMap);
			}
			
	
	long timetChronometerStop_1;
	
		log.info("tChronometerStop_1 - Stop time: "+System.currentTimeMillis()+" milliseconds");
	
		timetChronometerStop_1 = System.currentTimeMillis() - startTime;
		
			log.info("tChronometerStop_1 - Duration since job start: "+timetChronometerStop_1+" milliseconds");
		
	   		System.out.print("[ tChronometerStop_1 ]  ");
		
	  	System.out.println("" + "  " + timetChronometerStop_1 + " milliseconds");
	  	
			log.info("tChronometerStop_1 - "+ "" + "  " + timetChronometerStop_1 + " milliseconds");
		 
	
	Long currentTimetChronometerStop_1 = System.currentTimeMillis();
	globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);
	
		log.info("tChronometerStop_1 - Current time " + currentTimetChronometerStop_1 + " milliseconds");
	
	globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
	globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);
 



/**
 * [tChronometerStop_1 begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 


	tos_count_tChronometerStop_1++;

/**
 * [tChronometerStop_1 main ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tChronometerStop_1 - "  + ("Done.") );

ok_Hash.put("tChronometerStop_1", true);
end_Hash.put("tChronometerStop_1", System.currentTimeMillis());




/**
 * [tChronometerStop_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStop_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";

	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
			.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid).custom("father_pid", fatherPid).custom("root_pid", rootPid);
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		
		
		if(jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE){
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.sourceId(jcm.sourceId).sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
				.targetId(jcm.targetId).targetLabel(jcm.targetLabel).targetConnectorType(jcm.targetComponentName)
				.connectionName(jcm.current_connector).rows(jcm.row_count).duration(duration).build();
			auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
			auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
		
			log_context_talendJobLog = builder_talendJobLog
				.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
			auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {//log current component input line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {//log current component output/reject line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
		}
		
		
		
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final MAIN_FOURNISSEUR MAIN_FOURNISSEURClass = new MAIN_FOURNISSEUR();

        int exitCode = MAIN_FOURNISSEURClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'MAIN_FOURNISSEUR' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

	        if(!"".equals(log4jLevel)){
	        	
				
				
				if("trace".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.OFF);
				}
				org.apache.logging.log4j.core.config.Configurator.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());
				
    	    }
        	log.info("TalendJob: 'MAIN_FOURNISSEUR' - Start.");
    	
    	
    	
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()), System.getProperty(key)));

				
				
				
				org.apache.logging.log4j.core.config.Configurator.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        if (inOSGi) {
            java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

            if (jobProperties != null && jobProperties.get("context") != null) {
                contextStr = (String)jobProperties.get("context");
            }
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = MAIN_FOURNISSEUR.class.getClassLoader().getResourceAsStream("bi_team_projects/main_fournisseur_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = MAIN_FOURNISSEUR.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();


this.globalResumeTicket = true;//to run tPreJob




		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tChronometerStart_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tChronometerStart_1) {
globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", -1);

e_tChronometerStart_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : MAIN_FOURNISSEUR");
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     73787 characters generated by Talend Cloud Data Management Platform 
 *     on the 22 juillet 2022 à 15:53:18 WEST
 ************************************************************************************************/