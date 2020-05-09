package fr.uvsq.pglp5_1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import fr.uvsq.pglp5_1.Personnel.builder;

public class TestDAOapp {

	@Test
	public void test() {
		 {
			 ArrayList<String> num = new ArrayList<String>();
		        num.add("0651272833"); 
		        builder b = new builder("bricolo","jojo",LocalDate.of(1, 1, 1),num,1);
		        Personnel p = b.build();
		        Personnel p2 = null;
		       
		        assertNotEquals(p.toString(),p2.toString());
		      
		    }
	}

}
