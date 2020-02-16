/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mylibrary.model;

/**
 *
 * @author Anderson
 */
public class Book {

    private Integer id;
    private String book_name;
    private String book_owner;
    private String status;
    
    public Book() {
    }
    
    public Book(Integer id, String book_name, String book_owner, String status) {
        this.id = id;
        this.book_name = book_name;
        this.book_owner = book_owner;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_owner() {
        return book_owner;
    }

    public void setBook_owner(String book_owner) {
        this.book_owner = book_owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    
    
}
