package com.jenkins.formation;

import org.apache.log4j.Logger;

public class AffichageLog {

	private static final Logger logger = Logger.getLogger(AffichageLog.class);

	public static void main(String[] args) {
		AffichageLog al = new AffichageLog();
		al.getAllProducts();
//		if (logger.isTraceEnabled())
//			logger.trace("Test log TRACE");
//		if (logger.isDebugEnabled())
//			logger.debug("Test log DEBUG");
//		if (logger.isInfoEnabled())
//			logger.info("Test log INFO");
//		logger.warn("Test log WARN");
//		logger.error("Test log ERROR");
//		logger.fatal("Test log FATAL");
//		try {
//			if (logger.isInfoEnabled())
//				logger.info("Entrée dans Methode MAIN : ");
//			if (logger.isDebugEnabled())
//				logger.debug("Test log DEBUG");
//			if (logger.isInfoEnabled())
//				logger.info("Sortie de Methode MAIN : ");
//		} catch (Exception e) {
//			logger.error("Erreur dans la Methode : " + e);
//		}

	}
	
	public void getAllProducts(){
		int i = 0;
		try {
			
			logger.info("In getAllProducts() :");
			
			logger.debug("Je vais lancer la division.");			
			
			i = 1/1;
			logger.debug("Je viens de lancer la division :");
			
			logger.debug("Je viens de finir l'operation");			
			
			logger.info("Out getAllProducts() whithout errors :");
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}

}
