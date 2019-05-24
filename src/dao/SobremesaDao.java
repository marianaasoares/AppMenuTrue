package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Sobremesa;

public class SobremesaDao {

	public static List<Sobremesa> obterLista(){
		
		List<Sobremesa> lista = new ArrayList<Sobremesa>();
		
		String sql = "SELECT * FROM tsobremesa";
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				Sobremesa s = new Sobremesa(
						rs.getInt("id"),
						rs.getString("nomeReceita"), 
						rs.getInt("tempoMinutos"), 
						rs.getBoolean("temChocolate"), 
						rs.getInt("qtdeServe"),
						rs.getBoolean("gelado")
						
					);
				
				lista.add(s);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public static boolean incluir(Sobremesa sobremesa){
		try {
			PreparedStatement ps = 
					Conexao.obterConexao().prepareStatement(
							"INSERT INTO tsaudaveis "
							+ "(id, nomeReceita, tempoMinutos, temChocolate, serve, gelado)"
							+ "VALUES "
							+ "(?,?,?,?,?,?)"
						);
	
			ps.setInt(1, sobremesa.getId());
			ps.setString(2, sobremesa.getNomeReceita());
			ps.setInt(3, sobremesa.getTempoMinutos());
			ps.setBoolean(4, sobremesa.getTemChocolate());
			ps.setInt(7, sobremesa.getQtdeServe());
			ps.setBoolean(5, sobremesa.getGelado());
			
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	
		}
}
