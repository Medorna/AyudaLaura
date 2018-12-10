public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 

        Empleado empleado1 = new Empleado("Pepe", 25, 30603010, false, 25000);
        
        System.out.println("Empleado: "+empleado1.nombre +"\n"+"Edad: "+empleado1.edad+"\n"+"Dni: "+empleado1.cedula+"\n"+"Casado: "+empleado1.casado+"\n"+"Salario: "+empleado1.salario);
     
        
        System.out.println("Clasificacion de empleado: ");
        empleado1.ClasificacionEdad();
        
        System.out.println("El salario con aumento es de $: "+empleado1.AumentoSalario());
        
        }
    }