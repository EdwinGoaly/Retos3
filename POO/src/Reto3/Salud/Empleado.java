package Reto3.Salud;

public class Empleado extends Persona {
    // Atributos con modificador de acceso Private
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;

    // Método contructor vacio
    public Empleado() {

    }
    // Método contructor con parametros con el mismo nombre que los atributos
    public Empleado(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad, Double estatura, Double peso, String cargo, double valorHora, int horasTrabajadas, String departamento){
        super(tipoDoc, nombre, apellido, sexo, documento, edad, estatura, peso);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    // Encapsulamiento
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void mostrarEmpleado(){
        System.out.println("--------------------------------");
        System.out.println("            DATOS:              ");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("Tipo Doc.: "+getTipoDoc());
        System.out.println("Documento: "+getDocumento());
        System.out.println("--------------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Cargo: "+getCargo());
        System.out.println("Valor por hora: "+getValorHora());
        System.out.println("Horas trabajadas: "+getHorasTrabajadas());
        System.out.println("Departamento: "+getDepartamento());
        System.out.println("--------------------------------");
        System.out.println("TOTAL A PAGAR: $"+calcularHonorarios());
        System.out.println("--------------------------------");   
    } 
    public double calcularHonorarios(){
        double valorTrabajo = valorHora * horasTrabajadas;
        double reteica = valorTrabajo * 0.00966;
        double honorarios = valorTrabajo-reteica;
        return honorarios;
    }
}
