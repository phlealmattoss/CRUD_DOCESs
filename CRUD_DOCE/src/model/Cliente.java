/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Cliente {
    int Id_Cliente;
    String Nome;
    int Idade;
    String Email;
    String Tel;

    public Cliente() {
    }

    public Cliente(int Id_Cliente, String Nome, int Idade, String Email, String Tel) {
        this.Id_Cliente = Id_Cliente;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Email = Email;
        this.Tel = Tel;
    }
     public Cliente( String Nome, int Idade, String Email, String Tel) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Email = Email;
        this.Tel = Tel;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getTel() {
            return Tel;
    }
    
    public void setTel  (String Tel) {
        this.Tel = Tel;
    }
            
}
