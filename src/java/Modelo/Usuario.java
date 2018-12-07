/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author xzur
 */
public class Usuario {
    private String rutUsuario;
    private String nomUsuario;
    private String apeUsuario;
    private String claveUsuario;
    private String domicilioUsuario;
    private int rentaUsuario;
    private String nacUsuario;
    private int familaiUsuario;    
    private int privUsuario;
    private String correoUsuario;

    public Usuario(String rutUsuario, String nomUsuario, String apeUsuario,int privUsuario) {
        this.rutUsuario = rutUsuario;
        this.nomUsuario = nomUsuario;
        this.apeUsuario = apeUsuario;
        this.privUsuario=privUsuario;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getApeUsuario() {
        return apeUsuario;
    }

    public void setApeUsuario(String apeUsuario) {
        this.apeUsuario = apeUsuario;
    }
    
    public int getPrivUsuario() {
        return privUsuario;
    }

    public void setPrivUsuario(int privUsuario) {
        this.privUsuario = privUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getDomicilioUsuario() {
        return domicilioUsuario;
    }

    public void setDomicilioUsuario(String domicilioUsuario) {
        this.domicilioUsuario = domicilioUsuario;
    }

    public int getRentaUsuario() {
        return rentaUsuario;
    }

    public void setRentaUsuario(int rentaUsuario) {
        this.rentaUsuario = rentaUsuario;
    }

    public String getNacUsuario() {
        return nacUsuario;
    }

    public void setNacUsuario(String nacUsuario) {
        this.nacUsuario = nacUsuario;
    }

    public int getFamilaiUsuario() {
        return familaiUsuario;
    }

    public void setFamilaiUsuario(int familaiUsuario) {
        this.familaiUsuario = familaiUsuario;
    }
    public String getCorreoUsuario() {
         return correoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    
}
