package fr.uvsq.pglp5_1;

import java.util.ArrayList;
import java.util.Map;

public interface DAOapp<D> {
	
	D get(int id);
	void add(D object);
	void update(D object, Map<String, Object> params);
	void remove(D object);
}
