package fr.uvsq.pglp5_1;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class DAOCompositePerso implements DAOapp<CompositePerso>, Serializable {
	
	 private static final long serialVersionUID = 123456789L;
	 
	  private ArrayList<CompositePerso> list;
	  
	  //constru
	  public DAOCompositePerso() {
	        list = new ArrayList<CompositePerso>();
	    }
	  
	  public void serialize(final CompositePerso c, final String f) {
	       
	    }
	 
	 
	  //get 
	  
	  public CompositePerso get(final int id) {
	        for (CompositePerso c : list) {
	            if (c.getid() != id);
	            else{ return c;}
	        }
	        return null;
	    }
	  //add 
	  public void add(final CompositePerso New) {
	        list.add(New);
	    }
	  //up 
	  public CompositePerso update(final CompositePerso New) {
		  CompositePerso old = this.get(New.getid() );
	        if (old!= null) {
	            this.remove(old);
	          
	                this.add(New);
	            
	            return New;
	        }
	        System.out.println("le composite personnel n'a pas été trouvé");
	        return null;
	    }
	  //remove
	  public void remove(final CompositePerso obj) {
	        list.remove(obj);
	    }
	 
}
