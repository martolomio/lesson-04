package org.log4j.task;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLoggeredFile {

    private  static final Logger LOG = Logger.getLogger(CustomLoggeredFile.class);

    public static void main( String[] args ) {

    LogWithDomConfigurator();

    }
    public static void LogWithDomConfigurator(){
        DOMConfigurator.configure("loggerConfig.xml");
        LOG.error("error");
        LOG.debug("debug");
        LOG.info("Info");
        LOG.warn("warn");


    }



}
