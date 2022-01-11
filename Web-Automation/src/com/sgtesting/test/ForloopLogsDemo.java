package com.sgtesting.test;

import org.apache.log4j.Logger;

public class ForloopLogsDemo {
	public static Logger log=Logger.getLogger("Testing Logs");

	public static void main(String[] args) {
		displaylogs();		

	}

	private static void displaylogs() 
	{
		log.info("For Loop Execution Started Here...");
		log.info("For Loop Execution Started Here...");
		log.info("For Loop Execution Started Here...");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				log.info("Even Number:"+i);
			}
		}
		log.info("For Loop Execution Ended Here...");
	}
}