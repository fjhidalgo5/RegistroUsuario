
package modelo;

import java.sql.Connection;


public class Conexion {
    
    private final String base = "usuarios";
    private final String user = "prueba";
    private final String password = "1234";
    private final String url = "jdbc:sqlserver:sqlsrv\\sqlexpress;databaseName=usuarios" + base;
    
    public Connection getConexion()
    {
        
    }
}
