package fr.uvsq.pglp5_1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import fr.uvsq.pglp5_1.Personnel.builder;

public class TEstCompoperso {

	 @Test
	   public void test2() {
		 ArrayList<String> num = new ArrayList<String>();
	        num.add("0651272833");
	        builder b = new builder("bricolo","jojo",LocalDate.of(1, 1, 1),num,1);

	        Personnel pe = b.build();

	        CompositePerso pc = new CompositePerso();
	        int id=pe.getid();
	        pc.add(pe);
	        pc.remove(pe);
	        assertEquals(pc.p.size(), 0);
	    }

}
