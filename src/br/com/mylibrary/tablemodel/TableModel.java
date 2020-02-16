/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mylibrary.tablemodel;

import br.com.mylibrary.model.Book;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anderson
 */
public class TableModel extends AbstractTableModel{
    
    private final String[]colunas={"Book Name", "Book Owrne", "Status"};
    
    private List<Book>book;
    
    public TableModel(List<Book>book){
        this.book = book;
    }
    
    @Override
    public int getRowCount() {
        return book.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
               return book.get(rowIndex).getBook_name();
           case 1:
               return book.get(rowIndex).getBook_owner();
           case 2:
               return book.get(rowIndex).getStatus();
           default:
               return null;
       }
    }
    
}
