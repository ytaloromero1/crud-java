

package tr11;


import java.sql.*;
import javax.swing.JOptionPane;







public class conexion {

    
     //creo una variable de tipo connection llamada conectar
        Connection conectar =null;
    
        
        
        
        //definiendo datos para la conexion
    
////   String drive="com.mysql.jdbc.Driver";
////    String   db   ="pru";
////    String   url   ="jdbc:mysql://localhost:3306/";
////    String user="root";
////    String password="";
////    
   //mi constructor
     public Connection conectar () {
         
         
        try{
            
        //para poder conectar a mysql
        Class.forName("com.mysql.jdbc.Driver" );
        
         //cadena de conexion con variables definidas
         conectar=DriverManager.getConnection( "jdbc:mysql://localhost:3306/pru", "root", "");
        
         
         
//           JOptionPane.showMessageDialog(null, "conexion exitosa","conexi",JOptionPane.INFORMATION_MESSAGE);
         


         //si la conexion es exitosa inprime yesss
 //             System.out.println("yesssssss");
            
            
            
            
        
        }catch(ClassNotFoundException | SQLException  e){
                    
            
            
            JOptionPane.showMessageDialog(null, "FALLOOO"+e,"FALLO",JOptionPane.ERROR_MESSAGE);

//            System.err.println("nooooo  :"+e);
        
        
        } 
    
     
     
     
     
     
          return conectar;

     
     
     
     
     
          
  
                  
                  
               
          
          
          
          
          
          
          
          
          
          
          
          
   
     

    }

 

        // public static void main(String[] args) {
         // Crear objeto de la clase conexion
       // conexion miConexion = new conexion();

        // Llamar al método conectar
       // Connection conexionBD = miConexion.conectar();

               
               
               
               
   // }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
}
