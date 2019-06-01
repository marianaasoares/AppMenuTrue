package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Chef;


	public class ChefDao {
		
	public static List<Chef> obterLista(){
		
		List<Chef> lista = new ArrayList<Chef>();
		
		String sql = "SELECT * FROM tchef ORDER BY nome";
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				Chef c = new Chef(
						rs.getInt("id"),
						rs.getString("nome"), 
						rs.getString("email"), 
						rs.getString("usuario"), 
						rs.getBoolean("amador")
					);
				
				lista.add(c);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public static boolean incluir(Chef chef){
		try {
			PreparedStatement ps = 
					Conexao.obterConexao().prepareStatement(
							"INSERT INTO tchef "
							+ "(id, nome, email, usuario, amador)"
							+ "VALUES "
							+ "(?,?,?,?,?)"
						);
	
			ps.setInt(1, chef.getId());
			ps.setString(2, chef.getNome());
			ps.setString(3, chef.getEmail());
			ps.setString(4, chef.getUsuario());
			ps.setBoolean(5, chef.isAmador());
			
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


