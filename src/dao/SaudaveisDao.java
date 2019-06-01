package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Saudaveis;

public class SaudaveisDao {
	public static List<Saudaveis> obterLista(){
		
		List<Saudaveis> lista = new ArrayList<Saudaveis>();
		
		String sql = "SELECT * FROM tsaudaveis ORDER BY nomeReceita";
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				Saudaveis s = new Saudaveis(
						rs.getInt("id"),
						rs.getString("nomeReceita"), 
						rs.getInt("tempoMinutos"), 
						rs.getBoolean("vegetariana"), 
						rs.getBoolean("vegana"),
						rs.getString("tipo"),
						rs.getInt("serve")
					);
				
				lista.add(s);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public static boolean incluir(Saudaveis saudaveis){
		try {
			PreparedStatement ps = 
					Conexao.obterConexao().prepareStatement(
							"INSERT INTO tsaudaveis"
							+ "(id, nomeReceita, tempoMinutos, vegetariana, vegana, tipo, serve)"
							+ "VALUES "
							+ "(?,?,?,?,?,?,?)"
						);
	
			ps.setInt(1, saudaveis.getId());
			ps.setString(2, saudaveis.getNomeReceita());
			ps.setInt(3, saudaveis.getTempoMinutos());
			ps.setBoolean(4, saudaveis.isVegetariana());
			ps.setBoolean(5, saudaveis.isVegana());
			ps.setString(6, saudaveis.getTipo());
			ps.setInt(7, saudaveis.getServe());
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	
		}


	public static boolean excluir(int id){
		try {
		PreparedStatement ps = 
		Conexao.obterConexao().prepareStatement(
				"DELETE FROM TGame WHERE id = ?");
			ps.setInt(1, id);
			ps.execute();			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return false;
	}

}
