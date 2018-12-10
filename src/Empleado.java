import java.util.Scanner;
        
public class Empleado {
        String nombre;
        int cedula;
        int edad;
        boolean casado;
        double salario;
        
        public Empleado(){
        
            System.out.println("Hola! Soy un metodo constructor sin parametros");
        }
        
        public Empleado(String nombre, int edad, int cedula, boolean casado, double salario){ //Hola soy el constructor con parametro de entrada
            this.nombre = nombre; //mi atributo nombre
            this.edad= edad; //atributo edad
            this.casado = casado;
            this.salario = salario;
            this.cedula = cedula;
          
    }
          public void  ClasificacionEdad(){ //metodo que clasifica segun la edad 

              if (edad <=21){
                  System.out.println("El empleado es Principiante");}
                  if (edad >=22 && edad <=32){
                      System.out.println("Intermedio");
                  }
                  else{System.out.println("Senior");{
              }
            }
          }
          
          public double AumentoSalario(){
          
              int paumento;
              double salarioAumentado;
              double aumento;
              
              Scanner sc = new Scanner(System.in);
              
              System.out.println("Ingrese porcentaje de aumento");
              paumento = sc.nextInt();
              
              aumento = salario * paumento / 100;
              salarioAumentado = salario + aumento;
                      
              return salarioAumentado;
          }
}
