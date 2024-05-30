package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Aluno;

public class AlunoRepository {

	
	public void insert(Aluno aluno) throws Exception {

		Connection connection = getConnection();
		PreparedStatement statement = connection
				.prepareStatement("insert into aluno (id, nome, matricula, cpf) values (?,?,?,?)");

		statement.setObject(1, aluno.getIdAluno());
		statement.setString(2, aluno.getNome());
		statement.setString(3, aluno.getMatricula());
		statement.setString(4, aluno.getCpf());

		statement.execute();

		connection.close();

	}

	public void update(Aluno aluno) throws Exception {

		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement("update aluno set nome=?, matricula=?, cpf=? where id=?");

		statement.setString(1, aluno.getNome());
		statement.setString(2, aluno.getMatricula());
		statement.setString(3, aluno.getCpf());
		statement.setObject(4, aluno.getIdAluno());
		statement.execute();

		connection.close();

	}

	public void delete(Integer id) throws Exception {

		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement("delete from aluno where id=?");

		statement.setObject(1, id);
		statement.execute();
		connection.close();
	}

	public List<Aluno> findAll() throws Exception {

		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from aluno");

		ResultSet resultSet = statement.executeQuery();

		List<Aluno> lista = new ArrayList<Aluno>();

		while (resultSet.next()) {
			Aluno aluno = new Aluno();
			aluno.setIdAluno(resultSet.getInt("id"));
			aluno.setNome(resultSet.getString("nome"));
			aluno.setMatricula(resultSet.getString("matricula"));
			aluno.setCpf(resultSet.getString("cpf"));

			lista.add(aluno);

		}

		return lista;
	}
	
	private Connection getConnection() throws Exception {

		// parâmetros para conexão com o banco de dados
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/bd_aula03_tarefa";
		String user = "postgres";
		String pass = "coti";

		// abrir conexão com o banco de dados
		Class.forName(driver);
		return DriverManager.getConnection(url, user, pass);
	}
	
	
}
