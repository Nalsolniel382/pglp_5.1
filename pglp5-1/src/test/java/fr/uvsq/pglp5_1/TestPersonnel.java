package fr.uvsq.pglp5_1;

//import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import fr.uvsq.pglp5_1.Personnel.builder;



public class TestPersonnel {

	@Test
	public void test() {
		//fail("Not yet implemented");
		 ArrayList<String> num = new ArrayList<String>();
	        num.add("0651272833"); 
		builder b=new builder("bricolo","jojo",LocalDate.of(1, 1, 1),num,1);
		Personnel p=b.build();
		
		assertEquals(p.getid(),1);
		
	}

    
 //   @Test
 /*   public void test2() {
        ArrayList<String> numTel = new ArrayList<String>();
        numTel.add("06");

        builder b = new builder("coo","kie",LocalDate.of(1998, 1, 1),numTel,15);

        Personnel pe = b.build();

        PersonnelComposite pc = new PersonnelComposite();

        pc.add(pe);
        pc.remove(pe);
        assertEquals(pc.p.size(), 0);
    }*/
	
}
