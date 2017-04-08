public class Persona{
	private static int _id;
	private String _nombre;
	private String _apellido;
	private String _email;

	public Persona(int id, String nombre, String apellido, String email){
		_id = id;
		_nombre = nombre;
		_apellido = apellido;
		_email = email;
	}

	public int getId(){return _id;}

	public void setId(int id){_id = id;}

	public String getNombre(){return _nombre;}

	public void setNombre(String nombre){_nombre = nombre;}

	public String getApellido(){return _apellido;}

	public void setApellido(String apellido){_apellido = apellido;}

	public String getEmail(){return _email;}

	public void setEmail(String email){_email = email;}

	public String toString(){
		return _email;
	}
}