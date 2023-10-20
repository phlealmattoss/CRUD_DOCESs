package controller;

import conexao.Conexao;
import model.Cliente;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class ClienteController {
    public void CadastrarCliente(Cliente cliente){
        String sql = "insert into CLIENTE(Nome, Idade, Email, Tel values(?,?,?,?)";
        Connection con = null;
        PreparedStatement pstm = null;

        try{
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1,cliente.getNome());
            pstm.setInt(2,cliente.getIdade());
            pstm.setString(3,cliente.getEmail());
            pstm.setString(4,cliente.getTel());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Cliente cadastrado.");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public List<Cliente> Mostrar(){
        String sql = "select * from CLIENTE";

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        List<Cliente> clientes = new ArrayList<>();
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            rset = pstm.executeQuery();
            while (rset.next()){
                Cliente cl = new Cliente();
                cl.setId_Cliente(rset.getInt("Id_Cliente"));
                cl.setNome(rset.getString("Nome"));
                cl.setIdade(rset.getInt("Idade"));
                cl.setEmail(rset.getString("Email"));
                cl.setTel(rset.getString("Tel"));
                clientes.add(cl);
                
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return clientes;
    }

    public void Deletar(int Id_Cliente){
        String sql = "delete from CLIENTE where Id_Cliente=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setInt(1,Id_Cliente);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Cliente deletado");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void Atualizar(Cliente cliente){
        String sql = "update CLIENTE set Nome=?,Idade=?,Email=?,Tel=? where Id_Cliente=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1,cliente.getNome());
             pstm.setInt(2,cliente.getIdade());
            pstm.setString(3,cliente.getEmail());
            pstm.setString(4,cliente.getTel());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Cliente Atualizado");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
