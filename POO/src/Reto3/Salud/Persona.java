package Reto3.Salud;
public class Persona {
    private String tipoDoc;
    private String nombre;
    private String apellido;
    private String sexo;
    private int documento;
    private int edad;
    private Double estatura;
    private Double peso;

    //Metodo constructor vacio
    public Persona() {

    }

    //Metodo constructor con parametros con el mismo nombre que los atributos
    public Persona(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad, Double estatura, Double peso) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.documento = documento;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
    // Metodos accesores
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Double getEstatura() {
        return estatura;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double calcularImc(){
        Double pesoActual = peso/(estatura*estatura);
        double pesoRedondeado = Math.round(pesoActual * 10.0)/10.0;
        if (pesoRedondeado<20){
            System.out.println("PESOBAJO");
        } else if(pesoRedondeado>=20 && pesoRedondeado<=25){
            System.out.println("PESOIDEAL");
        } else if(pesoRedondeado>25){
            System.out.println("SOBREPESO");
        }
        return pesoRedondeado;
    }
    public int mayorEdad(){
        if (edad>18) {
            System.out.println("ES MAYOR DE EDAD");
        }else{
            System.out.println("ES MENOR DE EDAD");
        }
        return edad;
    }
    
}




