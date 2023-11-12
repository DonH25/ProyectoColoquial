package co.edu.unbosque.model.persistence;

public interface CRUDOperations {
	
	public void create(String ... attribs);
	public void create(Object obj);
	
	public String readAll();
	
	public boolean updateByIndex(int index, String ... newData);
	
	public boolean delete(int index);
	public boolean delete(Object obj);


}
