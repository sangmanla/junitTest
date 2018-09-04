package junitTest;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class App1 {
    public int logic1(int a, int b){
	return a + b; 
    }
    
    public int logic2(int... nums){
	return Arrays.stream(nums).sum(); 
    }
    
    public int logic3(String a, String b) throws InvalidParameterException{
	int aa = 0, bb = 0;
	try{
	    aa = Integer.parseInt(a);
	    bb = Integer.parseInt(b);
	}catch(Exception e){
	    throw new InvalidParameterException();
	}
	return aa + bb; 
    }
    
    public int logic4(int a, int b){
	return a * b; 
    }
}