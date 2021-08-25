package hcltraining;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class log4j {
	
		static final Logger logger1=Logger.getLogger(log4j.class);

		public static void main(String[] args) {
			DOMConfigurator.configure("E:\\selenium\\esclipes\\eclipse\\Hclproject\\hcltraining\\log4j.properties");
		
		logger1.debug("Example for debug msg");
		logger1.info("Example for info msg");
		logger1.warn("Example for warn msg");
		logger1.error("Example for error msg");
		logger1.fatal("Example for fatal msg");
		}

		


}
