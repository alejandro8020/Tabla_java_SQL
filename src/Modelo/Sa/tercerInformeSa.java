
package Modelo.Sa;


import Modelo_vi.tercerInformevi;

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
public class tercerInformeSa extends JDBCUtilities{
    public List <tercerInformevi> listar() throws SQLException{
        ArrayList<tercerInformevi> respuesta = new ArrayList<tercerInformevi>();
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rset = null;
        String consulta =   "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra" +
                            " JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto" +
                            " WHERE Proveedor = 'Homecenter' AND Ciudad ='Salento'"; 
        try {            
            stmt = conn.prepareStatement(consulta);
            rset = stmt.executeQuery();
            
            while (rset.next()) {
                tercerInformevi vi = new tercerInformevi();
                vi.setId(rset.getInt("ID_Compra"));
                vi.setConstructora(rset.getString("Constructora"));
                vi.setBancoVinculado(rset.getString("Banco_Vinculado"));       
                                
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

