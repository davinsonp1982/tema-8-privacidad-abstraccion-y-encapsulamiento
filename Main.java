/*class Main {
  public static void main(String[] args) {
  Vehiculo coche = new Vehiculo();
  coche.setTipo("Coupe");
  coche.setVelocidadMaxima(120);

  Vehiculo moto = new Vehiculo(); 
  moto.setTipo("Scotter"); 
  moto.setVelocidadMaxima(50);
  System.out.println(coche.getTipo());
  System.out.println(coche.getVelocidadMaxima());
  System.out.print(moto.getTipo()+" "+moto.getVelocidadMaxima());
  }
}

class Vehiculo{
 private String tipo;
 private int velocidadMaxima;

 public void setVelocidadMaxima (int velocidadMaxima){
   this.velocidadMaxima = velocidadMaxima; 
 }
  public int getVelocidadMaxima(){
    return this.velocidadMaxima;
  }

 public void setTipo(String tipo){
   this.tipo = tipo;
 }

public String getTipo() {
	return this.tipo;
}
}


// las propiedades de la clase pueden ser públicas o privadas.

/*Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola*/
class Main {
  public static void main(String[] args) {

  Persona estudiante = new Persona(); 
  estudiante.setEdad(35); 
  estudiante.setNombre("Luis eduardo");
  estudiante.setTelefono("3108846641");
  System.out.println(estudiante.getEdad());
  System.out.println(estudiante.getNombre());
  System.out.println(estudiante.getTelefono());
  }
}

class Persona{
 private int edad;
 private String telefono;
 private String nombre;
 

 public void setEdad (int edad){
   this.edad = edad; 
 }
  public int getEdad(){
    return this.edad;
  }

 public void setNombre(String nombre){
   this.nombre = nombre;
 }

public String getNombre() {
	return this.nombre;
}
public void setTelefono (String telefono){
   this.telefono = telefono; 
 }
  public String getTelefono(){
    return this.telefono;
  }
}
