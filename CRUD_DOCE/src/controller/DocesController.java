
package controller;


import conexao.Conexao;
import model.Doces;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DocesController {
    public void RegistrarLivro(Doces Doce){
        String sql = "insert into Doce(Nome, Descricao, Preco_Uni, Quant) values (?,?,?,?)";

        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con= Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1,Doce.getNome());
            pstm.setString(2,Doce.getDescricao());
            pstm.setInt(4,Doce.getPreco_Uni());
            pstm.setInt(5,Doce.getQuant());

            pstm.execute();
            JOptionPane.showMessageDialog(null,"Doce registrado.");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro:"+e);
        }
    }

    public List<Doces> MostrarDoce(){
        String sql = "select * from Doce";
        List<Doces> Doces = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            rset = pstm.executeQuery();
            while(rset.next()){
                Doces Do = new Doces();
                Do.setNome(rset.getString("Nome"));
                Do.setId_Doce(rset.getInt("Id_Doce"));
                Do.setDescricao(rset.getString("Descricao"));
                Do.setPreco_Uni(rset.getInt("Preco_Uni"));
                Do.setQuant(rset.getInt("Quant"));

                Doces.add(Do);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro:"+e);
        }
        return Doces;
    }

    public void AtualizarDoce(Doces Doce){
        String sql = "update Doce set Descricao =?, Preco_Uni =?";
        Connection con = null;
        PreparedStatement pstm = null;

        try{
            con= Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1,Doce.getDescricao());
            pstm.setInt(2,Doce.getPreco_Uni());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Doce atualizado");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void DeletarDoce(int Id_Doce){
        String sql = "delete from Doce where Id_Doce=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = Conexao.createConnection();
            pstm = con.prepareCall(sql);

            pstm.setInt(1, Id_Doce);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Doce deletado.");
        }catch (Exception e){
            System.out.println("Erro:"+e);
        }
    }
}
