%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms1024M -Xmx4096M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/log4j-slf4j-impl-2.17.1.jar;../lib/log4j-api-2.17.1.jar;../lib/log4j-core-2.17.1.jar;../lib/log4j-1.2-api-2.17.1.jar;../lib/accessors-smart-2.4.7.jar;../lib/activation.jar;../lib/commons-collections-3.2.2.jar;../lib/javax.mail-1.6.2.jar;../lib/job-audit-1.4.jar;../lib/advancedPersistentLookupLib-1.4.jar;../lib/asm-9.1.jar;../lib/jboss-marshalling-2.0.12.Final.jar;../lib/talend_file_enhanced-1.1.jar;../lib/json-smart-2.4.7.jar;../lib/dom4j-2.1.3.jar;../lib/slf4j-api-1.7.29.jar;../lib/talendcsv-1.0.0.jar;../lib/crypto-utils-0.31.12.jar;../lib/jtds-1.3.1-patch-20190523.jar;../lib/ojdbc8-19.3.0.0.jar;../lib/audit-log4j2-1.16.1.jar;../lib/thashfile-3.1-20190910.jar;../lib/logging-event-layout-1.16.1.jar;../lib/commons-lang3-3.10.jar;../lib/talend_DB_mssqlUtil-1.4.jar;../lib/talend-oracle-timestamptz.jar;../lib/trove.jar;../lib/audit-common-1.16.1.jar;../lib/jboss-marshalling-river-2.0.12.Final.jar;job_stock_hebdo_0_1.jar; bi_team_projects.job_stock_hebdo_0_1.JOB_STOCK_HEBDO %*
