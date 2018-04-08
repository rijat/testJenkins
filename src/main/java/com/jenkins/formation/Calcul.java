package com.jenkins.formation;

import org.apache.log4j.Logger;

public class Calcul {
	private static final Logger logger = Logger.getLogger(Calcul.class);
	
	public static int calculerSom(int a, int b){
		int res = 0;
		try{
			logger.info("In calculerSom("+a+", "+b+")");
			res = a+b;
			logger.info("Out  calculerSom() :" +res);
			
		}catch(Exception e){
			logger.error("Erreur :"+e);
		}
		return res;
	}
	
	public static int calculerDiff(int a, int b){
		int res = 0;
		try{
			logger.info("In calculerDiff("+a+", "+b+")");
			res = a-b;
			logger.info("Out  calculerDiff() :" +res);
			
		}catch(Exception e){
			logger.error("Erreur :"+e);
		}
		return res;
	}
	public static int calculerDiv(int a, int b){
		int res = 23;
		try{
			logger.info("In calculerDiv("+a+", "+b+")");
			res = a/b;
			logger.info("Out  calculerDiv() :" +res);
			
		}catch(Exception e){
			logger.error("Erreur :"+e);
		}
		return res;
	}

}
