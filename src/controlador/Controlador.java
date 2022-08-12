
package controlador;

import Modelo.Sa.primerInformeSa;
import Modelo.Sa.segundoInformeSa;
import Modelo.Sa.tercerInformeSa;
import Modelo_vi.primerInformevi;
import Modelo_vi.segundoInformevi;
import Modelo_vi.tercerInformevi;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class Controlador {
       
    private primerInformeSa modeloControladorlider;
    private segundoInformeSa modeloControladorproyecto;
    private tercerInformeSa modeloControladorcompra;
    
    public Controlador(){
        modeloControladorlider = new primerInformeSa();
        modeloControladorproyecto = new segundoInformeSa();
        modeloControladorcompra = new tercerInformeSa();
    }
    public List<primerInformevi> listarlider() throws SQLException {
        return modeloControladorlider.listar(); 
    }
    public List<segundoInformevi> listarproyecto() throws SQLException {
        return modeloControladorproyecto.listar(); 
    }
    public List<tercerInformevi> listarcompra() throws SQLException {
        return modeloControladorcompra.listar(); 
    }
    
    

   
    
      
    
}
