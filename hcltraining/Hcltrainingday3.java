package hcltraining;

import org.junit.Before;
import org.junit.Ignore;		
import org.junit.Test;		

public class Hcltrainingday3 extends ignoreclass {				

    
    @Ignore("Not ready please ignore")		
    @Before	
    public void ignoremethod() {					

        System.out.println("Please login ");					
        			

    }		

    @Test	
    public void printafterignoremethod() {					
        						
        System.out.println("without login you cannot access ");					
        					

    }		
    	
}