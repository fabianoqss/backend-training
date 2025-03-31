# Projeto Agenda Telefônica

- Projeto simples para trabalhar com a sintaxe do Java e com o conceito de Orientação a Objeto (POO).
- Conceitos Como Herança, Polimorfismo, Encapsulamento, e Collections foram usados durante o desenvolvimento do Mini-Projeto.

## 📌 Funcionalidades

- Adicionar contato: Garante que contatos duplicados não sejam adicionados.
- Remover contato: Remove contatos corretamente, mesmo quando há duplicatas.
- Editar contato: Permite atualização segura dos dados, mantendo a integridade.
- Buscar contato: Realiza buscas eficientes por nome ou telefone.
- Listar contatos: Exibe todos os contatos, com opção de ordenação.
- Persistência de dados: Salva os contatos em um arquivo JSON para recuperação após o fechamento do programa.

## 🛠️ Tecnologias Utilizadas

- Java 21+

## 📂 Arquitetura

└── AgendaTelefonica
├── .gitignore
├── .idea
├── .gitignore
├── misc.xml
├── modules.xml
├── uiDesigner.xml
└── vcs.xml
├── AgendaTelefonica.iml
├── README.md
└── src
├── application
└── Program.java
└── model
├── entities
├── Agenda.java
├── Contato.java
├── ContatoPessoal.java
└── ContatoProfissional.java
├── enums
└── TipoContato.java
├── exceptions
└── PersistenciaException.java
└── persistence
└── PersistenciaJson.java

## 🚀 Como Executar

1. **Clone este repositório**:

   ```bash
   git clone https://github.com/fabianoqss/backend-training.git

   ```

2. **Navegue até o projeto desejado.**

   ```bash
   cd AgendaTelefonica

   ```

3. **Compile o código:**

   ```bash
   javac Main.java

   ```

4. **Execute o programa:**
   ```bash
   java Main
   ```
