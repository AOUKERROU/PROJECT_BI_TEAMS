$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Dtalend.component.manager.m2.repository=%cd%/../lib' '-Xms256M' '-Xmx1024M' '-Dfile.encoding=UTF-8' -cp '.;../lib/routines.jar;../lib/log4j-slf4j-impl-2.17.1.jar;../lib/log4j-api-2.17.1.jar;../lib/log4j-core-2.17.1.jar;../lib/accessors-smart-2.4.7.jar;../lib/job-audit-1.4.jar;../lib/ojdbc8-19.3.0.0.jar;../lib/talend-proxy-1.0.2.jar;../lib/asm-9.1.jar;../lib/audit-log4j2-1.16.1.jar;../lib/jboss-marshalling-2.0.12.Final.jar;../lib/talend_file_enhanced-1.1.jar;../lib/logging-event-layout-1.16.1.jar;../lib/json-smart-2.4.7.jar;../lib/commons-lang3-3.10.jar;../lib/dom4j-2.1.3.jar;../lib/jakarta-oro-2.0.8.jar;../lib/talend-oracle-timestamptz.jar;../lib/slf4j-api-1.7.29.jar;../lib/audit-common-1.16.1.jar;../lib/jsch-0.1.55.jar;../lib/talendcsv-1.0.0.jar;../lib/crypto-utils-0.31.12.jar;inventory_sales_samsung_0_1.jar;' bi_team_projects.inventory_sales_samsung_0_1.Inventory_Sales_Samsung $args
