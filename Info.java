/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure;

/**
 *
 * @author developer
 */
public class Info {
    private String dato;
    private Boolean revisado= false;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Boolean getRevisado() {
        return revisado;
    }

    public void setRevisado(Boolean revisado) {
        this.revisado = revisado;
    }

    @Override
    public String toString() {
        return "Info{" + "dato=" + dato + ", revisado=" + revisado + '}';
    }
    
}
