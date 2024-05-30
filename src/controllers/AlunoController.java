package controllers;

import java.util.List;

import javax.swing.JOptionPane;

import entities.Aluno;
import repositories.AlunoRepository;

public class AlunoController {

	public void cadastrarAluno() {

		try {

			System.out.println("\nCADASTRO DE ALUNO");

			Aluno aluno = new Aluno();

			aluno.setIdAluno(Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID DO ALUNO : ")));
			aluno.setNome(JOptionPane.showInputDialog("DIGITE O NOME DO ALUNO : "));
			aluno.setMatricula(JOptionPane.showInputDialog("DIGITE A MATRICULA DO ALUNO : "));
			aluno.setCpf(JOptionPane.showInputDialog("DIGITE O CPF DO ALUNO : "));

			AlunoRepository alunoRepository = new AlunoRepository();
			alunoRepository.insert(aluno);

			System.out.println("\nALUNO ATUALIZADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nERRO: " + e.getMessage());
		}

	}

	public void alterarAluno() {

		try {
			System.out.println("\nATUALIZAR DE ALUNO");

			Aluno aluno = new Aluno();

			aluno.setIdAluno(Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID DO ALUNO ....... : ")));
			aluno.setNome(JOptionPane.showInputDialog("DIGITE O NOME DO ALUNO ...............................: "));
			aluno.setMatricula(JOptionPane.showInputDialog("DIGITE A MATRICULA DO ALUNO ..................: "));
			aluno.setCpf(JOptionPane.showInputDialog("DIGITE O CPF DO ALUNO .....................................: "));

			AlunoRepository alunoRepository = new AlunoRepository();
			alunoRepository.update(aluno);

			System.out.println("\nALUNO ATUALIZADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nERRO: " + e.getMessage());
		}

	}

	public void excluirAluno() {

		try {

			System.out.println("\nEXCLUSÃO DE ALUNO");

			Integer id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID DO ALUNO ....... : "));
			AlunoRepository alunoRepository = new AlunoRepository();
			alunoRepository.delete(id);
			System.out.println("\nALUNO EXCLUÍDO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nERRO: " + e.getMessage());
		}

	}

	public void consultarAluno() {

		try {

			System.out.println("\nCONSULTA DE ALUNOS:");

			AlunoRepository alunoRepository = new AlunoRepository();
			List<Aluno> lista = alunoRepository.findAll();

			
			for (Aluno aluno : lista) {
				System.out.println("ID..................: " + aluno.getIdAluno());
				System.out.println("NOME.............: " + aluno.getNome());
				System.out.println("MATRICULA.....: " + aluno.getMatricula());
				System.out.println("CPF.................: " + aluno.getCpf());
				System.out.println("..");
			}
		} catch (Exception e) {
			System.out.println("\nERRO: " + e.getMessage());

	}
}}
