package Connection.MySql.ClienteDao;

import Connection.MySql.ConnectionFactory;
import Connection.drinks.BebidasAlcoolicas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.swing.JOptionPane;

public class ClienteDao {

    public void criarResgistro(BebidasAlcoolicas c) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "insert into BebidasNaoAlcoolicas (nome,tipo,origem,quantidadeEstoque)values (?, ?, ?, ?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTipo());
            stmt.setString(3, c.getOrigem());
            stmt.setInt(4, c.getQuantidadeEstoque());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, c.getNome() + " adicionado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados " + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void salvaResgistro(BebidasAlcoolicas c) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "insert into BebidasAlcoolicas (nome,tipo,origem,quantidadeEstoque)values (?, ?, ?, ?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTipo());
            stmt.setString(3, c.getOrigem());
            stmt.setInt(4, c.getQuantidadeEstoque());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, c.getNome() + " adicionado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados " + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void deletaResgistro(BebidasAlcoolicas c) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "delete from BebidasAlcoolicas where nome = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getNome());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, c.getNome() + " deletado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados " + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void deletaDados(BebidasAlcoolicas c) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "delete from Bebidasnaoalcoolicas where nome = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getNome());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, c.getNome() + " deletado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados " + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
   

}
