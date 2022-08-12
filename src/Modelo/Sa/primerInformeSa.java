/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Sa;

import Modelo_vi.primerInformevi;
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
public class primerInformeSa extends JDBCUtilities{
    public List<primerInformevi> listar() throws SQLException {
        ArrayList<primerInformevi> respuesta = new ArrayList<primerInformevi>();
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rset = null;
        String consulta =   "SELECT ID_Lider as ID, Nombre, Primer_Apellido as Apellido, Ciudad_Residencia as Ciudad From Lider" +
                            " ORDER by Ciudad_Residencia ASC"; 
        try {
            stmt = conn.prepareStatement(consulta);
            rset = stmt.executeQuery();
            
            while (rset.next()) {
                primerInformevi vi = new primerInformevi();
                vi.setId(rset.getInt("ID"));
                vi.setNombre(rset.getString("Nombre"));
                vi.setApellido(rset.getString("Apellido"));
                vi.setCiudadRes(rset.getString("Ciudad"));
                
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
