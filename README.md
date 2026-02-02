# 🏰✨ Walt Disney Resort Manager

> Projeto educacional de gestão de resort desenvolvido em **Java**, focado na aplicação de conceitos de Programação Orientada a Objetos (POO), arquitetura **MVC** e manipulação de ficheiros **CSV**.

---

## 📌 Aviso Legal Importante

Este projeto é **apenas educacional** e **não é afiliado, patrocinado ou aprovado** por **The Walt Disney Company**.

* Os nomes/termos temáticos são utilizados **somente como referência**.
* Não existe qualquer finalidade comercial.

---

## 🧾 Sobre o Projeto

O **Walt Disney Resort Manager** é uma aplicação de terminal que simula a gestão de um resort temático. O sistema diferencia permissões entre utilizadores públicos (**Visitantes**) e equipa interna (**Staff / Cast Members**), garantindo que cada perfil acede apenas às funcionalidades do seu nível de acesso.

### 🏗️ Arquitetura e Boas Práticas

Para garantir organização e escalabilidade, o projeto foi estruturado com:

* **Padrão MVC**: Separação entre `Models` (dados), `Views` (interface) e `Controllers` (lógica).
* **Repositórios (Singleton)**: Centralização do carregamento e acesso a dados provenientes dos CSV.
* **Persistência Local**: Armazenamento via ficheiros `.csv`, sem necessidade de base de dados.

---

## ✅ Funcionalidades Implementadas

### 🎟️ Área Pública (Visitante)
* Consultar catálogo completo de quartos (Número, Tipologia e Preço/Semana).
* Navegação por menus interativos no terminal.

### 🔐 Área Interna (Staff / Cast Members)
Sistema de **Login** com validação de credenciais e distinção de perfis:

| Perfil | Funções Principais |
| :--- | :--- |
| **ADMIN** 👑 | Consultas estatísticas (Experiências mais procuradas por Adultos/Crianças). |
| **GESTÃO** 🧾 | Consulta de disponibilidade de quartos por semana (Receção). |
| **GUIA** 🎭 | Histórico de vendas detalhado, contagem de clientes e lucros acumulados. |

---

## ⟲ Funcionalidades em Desenvolvimento

- [ ] Conclusão de métodos/funcionalidades em falta  
- [ ] Melhorias na experiência do utilizador no terminal (menus/feedback)

---

## 🗂️ Estrutura do Projeto

O código está organizado nos seguintes pacotes:

* `Models`: Entidades base (`Room`, `Tipology`, `Booking`, `Experience`, `Sales`, etc.)
* `Repositories`: Carregamento e gestão de listas de dados (Singleton)
* `Controllers`: Regras de negócio, cálculos e validações
* `Views`: Menus do terminal e interação com o utilizador
* `Tools`: Utilitários para leitura de ficheiros (ex.: `CSVFileReader`)

---

## 📁 Persistência de Dados (CSV)

O sistema utiliza ficheiros CSV para armazenamento local:

* `Files/clientes.csv`
* `Files/experiencias.csv`
* `Files/vendas_experiencias.csv`
* `Files/reservas_quartos.csv`
* `Files/logins.csv`
* `Files/quartos.csv`
* `Files/tipologia.csv`

---

## ▶️ Como Executar

1. Abrir o projeto numa IDE (ex.: IntelliJ)
2. Garantir que está a usar **Java 21**
3. Executar a classe `Main`

---

## ✍️ Autor

Desenvolvido por **Thais Lira**
