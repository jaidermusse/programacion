
package herencia;
import javax.swing.JOptionPane;

public class Herencia {

    public static void main(String[] args) {
      boolean a=true;
      while (a){
          
          String menu = "OPCIONES \n"+
                  "1.Empleado \n"+
                  "2. Cliente\n"+
                  "3. salir programa";
          
          String opMenu=JOptionPane.showInputDialog (menu);
          int opcion = Integer.parseInt(opMenu);
          
          switch (opcion) {
          
            case 1:
                    
              String nombreEmpleado = JOptionPane.showInputDialog ("ingrese el nombre del empleado");
              int edadEmpleado = Integer.parseInt (JOptionPane.showInputDialog ("ingrese la edad del empleado"));
              double salarioEmpleado = Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario del empleado"));
              
              
                JOptionPane.showMessageDialog(null,"el nombre del empleado es:"+nombreEmpleado+
                       "\n La edad del empleado es:"+edadEmpleado+
                       "\n El salario del empleado es:"+salarioEmpleado);
                
                break;
            case 2:
                String nombreCliente = JOptionPane.showInputDialog("ingrese el nombre del cliente");
                int edadCliente = Integer.parseInt(JOptionPane.showInputDialog ("ingrese la edad del cliente"));
                String direccionCliente=JOptionPane.showInputDialog ("ingrese direccion del cliente");
                
                JOptionPane.showMessageDialog(null,"el nombre del cliente es:"+nombreCliente+
                        "\n la edad del cliente es:"+edadCliente+
                        "\n la direccion del cliente es:"+direccionCliente );
                
                break;
                
            case 3:
                a=false;
                break;
                        
            
          
      }
      }
    }
    
}
