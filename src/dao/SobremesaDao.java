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
		
		String sql = "SELECT * FROM tsobremesa ORDER BY nomeReceita";
		
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
							"INSERT INTO tsobremesa"
							+ "(nomeReceita, tempoMinutos, temChocolate, serve, gelado)"
							+ "VALUES "
							+ "(?,?,?,?,?)"
						);
	
			ps.setString(1, sobremesa.getNomeReceita());
			ps.setInt(2, sobremesa.getTempoMinutos());
			ps.setBoolean(3, sobremesa.getTemChocolate());
			ps.setInt(4, sobremesa.getQtdeServe());
			ps.setBoolean(5, sobremesa.getGelado());
			
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	
		}
}
