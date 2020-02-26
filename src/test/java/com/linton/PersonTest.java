package com.linton;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest

    {
        private Person linton = new Person("linton");

        @Test //Testing Object equality
        public void getName() throws Exception
            {
            //if name is equal to linton
            assertEquals("linton", linton.getName());
            }

        @Test  //Testing Object Identity
        public void intTest() throws Exception
           {
            int eyes = 2;
            int ears = 2;
            // if integer eyes is equal ears
            assertSame(eyes, ears);
            }

        @Test (timeout = 1000)//Testing Object Identity and added timeout
        public void intTest2() throws Exception
            {
            int nose = 1;
            int lips = 2;
            // if 1 nose is not equal to 2 lips
            assertNotSame(nose, lips);
            }

        @Test (expected = IllegalStateException.class) //Testing Fail Test
        public void nameFail() throws Exception
            {
            linton.printGenderMessage();
            }

        @Ignore ("This single test method will be ignored! - annotation Ignore and Test") //Added the Disable Test
        @Test
        public void genderDisable() throws Exception
            {
            linton.gender();
            String msg = linton.getGenderMessage();
            assertEquals("I am male named linton", msg);
            }
    }
