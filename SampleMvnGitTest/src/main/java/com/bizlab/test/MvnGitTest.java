package com.bizlab.test;

import org.apache.log4j.Logger;

import com.bizlab.mvn.App;

/**
 * Hello world!
 *
 */
public class MvnGitTest 
{
	static final Logger logger = Logger.getLogger(MvnGitTest.class);
    public static void main( String[] args )
    {
    	App app = new App();
    	System.out.println( "Hello World!---" +app.getName("RAJU"));
    }
}
