/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mylibrary.daoMyLibrery;

import br.com.mylibrary.connection.Conexao;
import br.com.mylibrary.model.Book;
import br.com.mylibrary.model.Version;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class daoMyLibrary {
    
     public void create(Book b) {
        
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO book (book_name,book_owner,status)VALUES(?,?,?)");
            stmt.setString(1, b.getBook_name());
            stmt.setString(2, b.getBook_owner());
            stmt.setString(3, b.getStatus());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }
    
    public void update(Book b) {

       Connection con = Conexao.getConnection();

       PreparedStatement stmt = null;

       try {
           stmt = con.prepareStatement("UPDATE book SET book_name = ? , book_owner = ?, status = ? WHERE id = ?");
           stmt.setString(1, b.getBook_name());
           stmt.setString(2, b.getBook_owner());
           stmt.setString(3, b.getStatus());
           stmt.setInt(4, b.getId());

           stmt.executeUpdate();

           JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
       } finally {
           Conexao.closeConnection(con, stmt);
       }

    }
    
    public void delete(Book b) {

       Connection con = Conexao.getConnection();

       PreparedStatement stmt = null;

       try {
           stmt = con.prepareStatement("DELETE FROM book WHERE id = ?");
           stmt.setInt(1, b.getId());

           stmt.executeUpdate();

           JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
       } finally {
           Conexao.closeConnection(con, stmt);
       }

    }
    
    public void selection(Book b) {

       Connection con = Conexao.getConnection();

       PreparedStatement stmt = null;

       try {
           stmt = con.prepareStatement("SELECT * FROM book WHERE id = ?");
           stmt.setInt(1, b.getId());

           stmt.executeQuery();

       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
       } finally {
           Conexao.closeConnection(con, stmt);
       }

    }
    
    public Version version() {

       Connection con = Conexao.getConnection();
       Version vs = new Version();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       try {
           stmt = con.prepareStatement("SELECT * FROM version ORDER BY system_version DESC LIMIT 1");
           rs = stmt.executeQuery();
           
           while (rs.next()) {
                
                vs.setSystem_version(rs.getString("system_version"));
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
       } finally {
           Conexao.closeConnection(con, stmt);
       }
       return vs;
    }
    
    
}
