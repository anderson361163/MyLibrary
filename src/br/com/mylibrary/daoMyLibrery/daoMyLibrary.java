/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mylibrary.daoMyLibrery;

import br.com.mylibrary.connection.Conexao;
import br.com.mylibrary.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class daoMyLibrary {
    
//     public void create(Book b) {
//        
//        Connection con = Conexao.getConnection();
//        
//        PreparedStatement stmt = null;
//
//        try {
//            stmt = con.prepareStatement("INSERT INTO produto (book_name,book_owner,status)VALUES(?,?,?)");
//            stmt.setString(1, b.getBook_name());
//            stmt.setString(2, b.getBook_owner());
//            stmt.setString(3, b.getStatus());
//
//            stmt.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        } finally {
//            Conexao.closeConnection(con, stmt);
//        }
//
//    }
     
    public void update(Book b) {

       Connection con = Conexao.getConnection();

       PreparedStatement stmt = null;

       try {
           stmt = con.prepareStatement("UPDATE produto SET book_name = ? , book_owner = ?, status = ? WHERE id = ?");
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
           stmt = con.prepareStatement("DELETE FROM library WHERE id = ?");
           stmt.setInt(1, b.getId());

           stmt.executeUpdate();

           JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
       } finally {
           Conexao.closeConnection(con, stmt);
       }

    }
    
    
}
