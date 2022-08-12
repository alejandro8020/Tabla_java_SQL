
package Modelo.Sa;

import Modelo_vi.segundoInformevi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class segundoInformeSa extends JDBCUtilities{
    public List<segundoInformevi> listar() throws SQLException {
        ArrayList<segundoInformevi> respuesta = new ArrayList<segundoInformevi>();
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rset = null;
        String consulta =   "SELECT ID_Proyecto as ID, Constructora, Numero_Habitaciones, Ciudad from Proyecto" 
                            +" where Clasificacion ='Casa Campestre' AND Ciudad IN ('Santa Marta','Cartagena','Barranquilla')"; 
        try {
            stmt = conn.prepareStatement(consulta);
            rset = stmt.executeQuery();
            
            while (rset.next()) {
                segundoInformevi vi = new segundoInformevi();
                vi.setId(rset.getInt("ID"));
                vi.setConstructora(rset.getString("Constructora"));
                vi.setNumeroHabitaciones(rset.getInt("Numero_Habitaciones"));
                vi.setCiudad(rset.getString("Ciudad"));           
                                
                respuesta.add(vi);
            }
        } finally {
            if (rset != null) {
                rset.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return respuesta;
    }
            
            
}
