package ConexionSQLDB;

    import Clases.principales.Medicamentos;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
import java.util.ArrayList;

public class MedicamentosDB {
    
    public ArrayList<Medicamentos> ListMedicamentos(){
    ArrayList<Medicamentos> medicamento=new ArrayList();
    
    try{
        Connection cnx = DataBaseConnection.getConnection();
        Statement st = cnx.createStatement();
        ResultSet rs = st.executeQuery("SELECT ID_MEDICAMENTO, PRECIO, ID_TIPO_MEDICAMENTO, CONTENIDO, NOMBRE, ID_PRESENTACION, ID_UBICACION, EXISTENCIAS, CADUCIDAD    " + "  FROM MEDICAMENTOS ORDER BY 4");
        
        while (rs.next()){
            Medicamentos md=new Medicamentos();
            md.setId_medicamento(rs.getInt("ID_MEDICAMENTO"));
            md.setPrecio(rs.getInt("PRECIO"));
            md.setId_tipo_medicamento(rs.getInt("ID_TIPO_MEDICAMENTO"));            
            md.setContenido(rs.getInt("CONTENIDO"));
            md.setNombre(rs.getString("NOMBRE"));
            md.setId_presentacion(rs.getInt("ID_PRESENTACION")); 
            md.setId_ubicacion(rs.getInt("ID_UBICACION"));             
            md.setExistencias(rs.getInt("EXISTENCIAS"));
            md.setCaducidad(rs.getInt("CADUCIDAD"));
            medicamento.add(md);
        }
    }catch (SQLException ex){
        System.out.println(ex.getMessage());
        System.out.println("Error en Listado");
    }        
    
    return medicamento;
    }

    public void buscarMedicamentos(Medicamentos medicamento){
        try{
            Connection cnx = DataBaseConnection.getConnection();
            PreparedStatement pst = cnx.prepareStatement("SELECT*FROM FROM MEDICAMENTOS WHERE ID_MEDICAMENTO=?");
            pst.setInt(1, medicamento.getId_medicamento());
            pst.execute();
                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en eliminar");
        }
    }
    //insertar
    public void insertarMedicamentos(Medicamentos medicamento){
        
        try{
            Connection cnx = DataBaseConnection.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO MEDICAMENTOS VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, medicamento.getId_medicamento());
            pst.setString(2, medicamento.getNombre());
            pst.setInt(3, medicamento.getId_tipo_medicamento());
            pst.setInt(4, medicamento.getPrecio());           
            pst.setInt(5, medicamento.getContenido());            
            pst.setInt(6, medicamento.getId_presentacion());                        
            pst.setInt(7, medicamento.getExistencias());
            pst.setInt(8, medicamento.getCaducidad());
            pst.setInt(9, medicamento.getId_ubicacion());
            pst.executeUpdate();
                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Insert");
        }
    }
    
    public void updateMedicamentos(Medicamentos medicamento){
        
        try{
            Connection cnx = DataBaseConnection.getConnection();
            PreparedStatement pst = cnx.prepareStatement("UPDATE MEDICAMENTOS SET EXISTENCIAS = ? WHERE ID_MEDICAMENTO=?");            
            pst.setInt(1, medicamento.getExistencias());
            pst.setInt(2, medicamento.getId_medicamento());
            pst.executeUpdate();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Actualizar");
        }
    }
    
    public void eliminarMedicamentos(Medicamentos medicamento){
        try{
            Connection cnx = DataBaseConnection.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM MEDICAMENTOS WHERE ID_MEDICAMENTO=?");
            pst.setInt(1, medicamento.getId_medicamento());
            pst.executeUpdate();
                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en eliminar");
        }
    }
        
}
