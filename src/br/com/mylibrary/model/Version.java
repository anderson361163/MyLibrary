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
public class Version {

    private String system_version;
    
    public Version() {
    }
    
    public String getSystem_version() {
        return system_version;
    }

    public void setSystem_version(String system_version) {
        this.system_version = system_version;
    }
    
    public Version(String system_version) {
        this.system_version = system_version;
    }
    
}
