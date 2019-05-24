package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Massa;

public class MassaDao {
public static List<Massa> obterLista(){
		
		List<Massa> lista = new ArrayList<Massa>();
		
		String sql = "SELECT * FROM tmassa";
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				Massa c = new Massa(
						rs.getInt("id"),
						rs.getString("nomeReceita"), 
						rs.getInt("tempoMinutos"), 
						rs.getString("tipo"), 
						rs.getBoolean("massaFresca"),
						rs.getInt("qtdeMassa")
					);
				
				lista.add(c);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public static boolean incluir(Massa massa){
		try {
			PreparedStatement ps = 
					Conexao.obterConexao().prepareStatement(
							"INSERT INTO tmassaf "
							+ "(id, nomeReceita, tempoMinuto, tipo, massaFresca, qtdeMassa)"
							+ "VALUES "
							+ "(?,?,?,?,?,?)"
						);
	
			ps.setInt(1, massa.getId());
			ps.setString(2, massa.getNomeReceita());
			ps.setInt(3, massa.getTempoMinutos());
			ps.setString(4, massa.getTipo());
			ps.setBoolean(5, massa.getMassaFresca());
			ps.setInt(6, massa.getQtdeMassa());
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	
		}
}
