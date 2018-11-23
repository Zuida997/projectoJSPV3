/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author maxim
 */
public class Mod_Usuarios {
    private int idUser;
    private String alias;
    private String clave;
    private String rutPers;
    private int tipo;
    private int estado;

    public Mod_Usuarios(int idUser, String alias, String clave, String rutPers, int tipo, int estado) {
        this.idUser = idUser;
        this.alias = alias;
        this.clave = clave;
        this.rutPers = rutPers;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Mod_Usuarios(String alias, String clave, String rutPers, int tipo, int estado) {
        this.alias = alias;
        this.clave = clave;
        this.rutPers = rutPers;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getAlias() {
        return alias;
    }

    public String getClave() {
        return clave;
    }

    public String getRutPers() {
        return rutPers;
    }

    public int getTipo() {
        return tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRutPers(String rutPers) {
        this.rutPers = rutPers;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
