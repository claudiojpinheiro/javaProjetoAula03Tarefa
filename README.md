# Sistema de Cadastro de Alunos

Bem-vindo ao sistema de cadastro de alunos! Este projeto foi desenvolvido para gerenciar o cadastro de alunos utilizando um banco de dados PostgreSQL. O sistema permite realizar as operações de CRUD (Criar, Ler, Atualizar e Deletar) completas.

## Funcionalidades

- **Cadastrar Aluno**: Permite a adição de novos alunos ao sistema.
- **Listar Alunos**: Exibe uma lista de todos os alunos cadastrados.
- **Atualizar Aluno**: Permite a atualização das informações de um aluno existente.
- **Deletar Aluno**: Remove um aluno do sistema.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver o sistema.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenar as informações dos alunos.
- **JDBC**: API de Java para conexão com o banco de dados.
- **Eclipse**: IDE utilizada para o desenvolvimento do projeto.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) 11 ou superior
- [PostgreSQL](https://www.postgresql.org/download/) 13 ou superior
- [Eclipse IDE](https://www.eclipse.org/downloads/)

## Configuração do Banco de Dados

1. Instale o PostgreSQL e crie um banco de dados para o sistema.

2. Crie a tabela `alunos` utilizando o seguinte script SQL:

    ```sql
    CREATE TABLE alunos (
        idaluno INTEGER PRIMARY KEY,
        nome VARCHAR(50) NOT NULL,
        matricula VARCHAR(30) NOT NULL,
        cpf VARCHAR(14) NOT NULL
    );
    ```

3. Configure as credenciais do banco de dados no arquivo de configuração da aplicação (por exemplo, `database.properties`):

    ```properties
    db.url=jdbc:postgresql://localhost:5432/seuBancoDeDados
    db.user=seuUsuario
    db.password=suaSenha
    ```

## Executando o Projeto

1. Clone o repositório:

    ```bash
    git clone https://github.com/seuUsuario/sistema-cadastro-alunos.git
    cd sistema-cadastro-alunos
    ```

2. Importe o projeto no Eclipse:

    - Abra o Eclipse IDE.
    - Selecione `File` > `Import`.
    - Escolha `Existing Projects into Workspace` e selecione o diretório do projeto clonado.

3. Adicione o driver JDBC do PostgreSQL ao projeto:

    - Baixe o driver JDBC do [site oficial do PostgreSQL](https://jdbc.postgresql.org/download.html).
    - No Eclipse, clique com o botão direito no projeto > `Build Path` > `Add External Archives...` e selecione o arquivo JAR do driver baixado.

4. Execute a classe principal (`Main.java`):

    - No Eclipse, encontre a classe `Main.java`.
    - Clique com o botão direito na classe e selecione `Run As` > `Java Application`.

## Uso

Após iniciar o aplicativo, você poderá usar a interface do usuário para:

- **Adicionar**: Insira os detalhes do aluno (ID, nome, matrícula, CPF) e clique no botão de cadastro.
- **Listar**: Veja todos os alunos cadastrados.
- **Atualizar**: Selecione um aluno da lista e atualize suas informações.
- **Deletar**: Selecione um aluno da lista e remova-o do sistema.

## Contribuição

Sinta-se à vontade para contribuir com o projeto! Aqui estão algumas maneiras de começar:

- Relatando erros e problemas.
- Enviando solicitações de funcionalidade.
- Criando pull requests com melhorias e correções de bugs.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## Contato

Para mais informações, entre em contato com:

- Nome do Desenvolvedor: Seu Nome
- Email: seu.email@exemplo.com

---

Obrigado por usar o Sistema de Cadastro de Alunos!
