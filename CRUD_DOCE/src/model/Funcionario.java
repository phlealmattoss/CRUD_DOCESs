/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Funcionario {
    int Id_Func;
    String Nome;
    int Idade;
    String Email;
    String Tel;
    String CPF;

    public Funcionario() {
    }

    public Funcionario(int Id_Func, String Nome, int Idade, String Email, String Tel,String CPF) {
        this.Id_Func = Id_Func;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Email = Email;
        this.Tel = Tel;
        this.CPF = CPF;
    }
    
     public Funcionario( String Nome, int Idade, String Email, String Tel,String CPF) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Email = Email;
        this.Tel = Tel;
        this.CPF = CPF;
    }

    public int getId_Func() {
        return Id_Func;
    }

    public void setId_Func(int Id_Func) {
        this.Id_Func = Id_Func;
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
    
    public String getTel () {
            return Tel;
    }
    
    public void setTel  (String Tel) {
        this.Tel = Tel;
    }
    
    public String getCPF () {
            return CPF;
    }
    
    public void setCPF  (String CPF) {
        this.CPF = CPF;
    }
}
