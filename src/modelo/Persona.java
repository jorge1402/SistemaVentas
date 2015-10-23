package modelo;
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String img;
    
    public  Persona(String nom,String ap,String dni,String em,String img){
        this.nombre=nom;
        this.apellido=ap;
        this.dni=dni;
        this.email=em;
        this.img=img;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getImg(){
        return img;
    }
    public void setImg(String img){
        this.img=img;
    }  
}
