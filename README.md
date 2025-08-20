# 👥 Projeto Aula Java 12 — Sistema de Usuários (MVC)

Este projeto em **Java** foi desenvolvido com base no padrão **MVC (Model-View-Controller)**, simulando um sistema simples de **cadastro e gerenciamento de usuários**.  
Ele demonstra a importância da separação de responsabilidades entre **modelo, visualização e controle**.

---

## 📌 Objetivos do Projeto
- Implementar um **sistema de usuários** aplicando o padrão arquitetural **MVC**.  
- Praticar **Programação Orientada a Objetos (POO)** com Java.  
- Mostrar como separar **camadas de aplicação** para facilitar manutenção e evolução.  

---

## 🛠️ Estrutura do Projeto
- **`model/Usuario.java`** → Classe de modelo que representa um usuário (atributos, getters/setters).  
- **`view/UsuarioView.java`** → Responsável por exibir informações dos usuários.  
- **`controller/UsuarioController.java`** → Faz a ligação entre o modelo (`Usuario`) e a visão (`UsuarioView`).  
- **`Main.java`** → Classe principal que cria e manipula usuários através do controlador.  

---

## ▶️ Como Executar
1. Compile os arquivos do projeto:
   ```bash
   javac src/model/*.java src/view/*.java src/controller/*.java src/Main.java
