package edu.ums.bo.com.edureka.com.edureka;
import java.lang.Integer;


public class Calculator {
    public Integer add (Integer arg1,Integer arg2){
        Integer result = arg1+arg2;
        return result;
    }

    public Integer mul(Integer arg1,Integer arg2){
        Integer result = arg1 * arg2;
        return result;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Integer result = cal.add(10,30);
        System.out.println("The Result of addition is "+result);
        Integer mulresult = cal.mul(10,30);
        System.out.println("The Result of multiplication is "+mulresult);

    }

}
