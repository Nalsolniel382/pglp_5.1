package fr.uvsq.pglp5_1;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class DAOpersonnel implements DAOapp<Personnel>, Serializable {
	
	 private static final long serialVersionUID = 963258741L;
	    
	 private ArrayList<Personnel> list;
	
	
	///constructeur
	 public DAOpersonnel() {
	        list = new ArrayList<Personnel>();
	    }
	 
	 
	  public Personnel get(final int ID)
	  {
	        for (Personnel p : list) 
	        {
	            if (p.getid() != ID);
	            else { return p;}
	           
	        }
	        System.out.println("le personnel n'a pas été trouvé");
	        return null;
	    }
	  
	   public void add(final Personnel object) {
	        list.add(object);
	    }
	   
	   public void update(final Personnel object,final Map<String, Object> params) {
		   
	   }
	   
	   public void remove(final Personnel object) {
	        list.remove(object);
	    }
}
