/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Doces {
    int Id_Doce;
    String Nome;
    String Descricao;
    int Preco_Uni;
    int Quant;

    public Doces() {
    }

    public Doces(int Id_Doce, String Nome, String Descricao, int Preco_Uni, int Quant) {
        this.Id_Doce = Id_Doce;
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.Preco_Uni = Preco_Uni;
        this.Quant = Quant;
    }
    
    public Doces(String Nome, String Descricao, int Preco_Uni, int Quant) {
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.Preco_Uni = Preco_Uni;
        this.Quant = Quant;
    }
    
      public Doces(int Preco_Uni, String Descricao) {
          this.Preco_Uni = Preco_Uni;
        this.Descricao = Descricao;
    }

    public int getId_Doce() {
        return Id_Doce;
    }

    public void setId_Doce(int Id_Doce) {
        this.Id_Doce = Id_Doce;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getPreco_Uni() {
        return Preco_Uni;
    }

    public void setPreco_Uni(int Preco_Uni) {
        this.Preco_Uni = Preco_Uni;
    }

    public int getQuant() {
        return Quant;
    }

    public void setQuant(int Quant) {
        this.Quant = Quant;
    }

}
