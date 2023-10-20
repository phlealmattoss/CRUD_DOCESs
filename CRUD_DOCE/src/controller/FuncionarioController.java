package controller;

import conexao.Conexao;
import model.Funcionario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class FuncionarioController {
    public void CadastrarUsuario(Funcionario Funcionario){
        String sql = "insert into usuario(Nome, Idade, Email, Tel, CPF) values(?,?,?,?,?)";
        Connection con = null;
        PreparedStatement pstm = null;

        try{
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1,Funcionario.getNome());
            pstm.setInt(2,Funcionario.getIdade());
            pstm.setString(3,Funcionario.getEmail());
            pstm.setString(4,Funcionario.getTel());
             pstm.setString(5,Funcionario.getCPF());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Funcionario cadastrado.");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public List<Funcionario> Mostrar(){
        String sql = "select * from Funcionario";

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        List<Funcionario> Funcionarios = new ArrayList<>();
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            rset = pstm.executeQuery();
            while (rset.next()){
                Funcionario fu = new Funcionario();
                fu.setId_Func(rset.getInt("Id_Func"));
                fu.setNome(rset.getString("Nome"));
                fu.setIdade(rset.getInt("Idade"));
                fu.setEmail(rset.getString("Email"));
                fu.setTel(rset.getString("Tel"));
                fu.setCPF(rset.getString("CPF"));
                Funcionarios.add(fu);
                
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return Funcionarios;
    }

    public void Deletar(int Id_Func){
        String sql = "delete from Funcionario where Id_Func=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setInt(1,Id_Func);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Funcionario deletado");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void Atualizar(Funcionario Funcionario){
        String sql = "update Funcionario set Nome=?,Idade=?,Email=?,Tel=?,CPF=? where Id_Func=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1,Funcionario.getNome());
            pstm.setInt(2,Funcionario.getIdade());
            pstm.setString(3,Funcionario.getEmail());
            pstm.setString(4,Funcionario.getTel());
            pstm.setString(5,Funcionario.getCPF());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Funcionario Atualizado");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
