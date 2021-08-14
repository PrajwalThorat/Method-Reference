package com.stackroute.methodreference;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/* Write test cases for positive and negative scenarios*/
public class NewCalculatorUtilityTests
    {
        private NewCalculatorUtility newCalculatorUtility;
        @BeforeEach
        public void createObject()
        {
            newCalculatorUtility=new NewCalculatorUtility();
        }

        @Test
        public void testPower()
        {
            double result= newCalculatorUtility.getPowerResult(2,3);
            assertEquals(8,result);
        }

        @Test
        public void testProduct()
        {
            double result= newCalculatorUtility.getProductResult(2,3);
            assertEquals(6,result);
        }

        @Test
        public void checkPowerResultIfNull()
        {
            double result=newCalculatorUtility.getPowerResult(5,3);
            assertNotNull(result);

        }

        @Test
        public void checkProductResultIfNull()
        {
            double result= newCalculatorUtility.getProductResult(2,3);
            assertNotNull(result);
        }


    }
