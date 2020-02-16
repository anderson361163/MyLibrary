/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mylibrary.controller;

import br.com.mylibrary.daoMyLibrery.daoMyLibrary;
import br.com.mylibrary.model.Book;
import br.com.mylibrary.model.Version;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class controllerLibrary {
    
    public void insert(Book b){
        daoMyLibrary dao = new daoMyLibrary();
        dao.create(b);
    }
    
    public void modernize(Book b){
        daoMyLibrary dao = new daoMyLibrary();
        dao.update(b);
    }
    
    public void delete(Book b){
        daoMyLibrary dao = new daoMyLibrary();
        dao.delete(b);
    }
    
    //
    public List<Book> selection(Book b){
        daoMyLibrary dao = new daoMyLibrary();
        return dao.selection(b);
        
    }
    
    //ELE RETORNA A VERSÃO DO SISTEMA
    public Version selectionVersion(){
        daoMyLibrary dao = new daoMyLibrary();
        return dao.version();
    }
    
}
