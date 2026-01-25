# 🏨 CESAE Hotel Resort

> Projeto educacional de gestão de hotel/resort desenvolvido em **Java**, focado na aplicação de conceitos de Programação Orientada a Objetos e manipulação de ficheiros CSV.

---

## 🧾 Sobre o Projeto

O **CESAE Hotel Resort** é uma aplicação de terminal que simula o ecossistema de gestão de um resort. O sistema diferencia permissões entre utilizadores públicos (Clientes) e equipa interna (Staff), garantindo que cada perfil aceda apenas às funcionalidades pertinentes.

### 🏗️ Arquitetura e Boas Práticas
Para garantir a organização e escalabilidade, o projeto foi estruturado utilizando:
* **Padrão MVC**: Separação clara entre Models (Dados), Views (Interface) e Controllers (Lógica).
* **Repositórios (Singleton)**: Centralização do carregamento e acesso aos dados dos ficheiros CSV.
* **Persistência Local**: Gestão de dados via ficheiros `.csv` sem necessidade de base de dados externa.

---

## ✅ Funcionalidades Implementadas

### 👤 Área Pública (Cliente)
* Consultar catálogo completo de quartos (Número, Tipologia e Preço/Semana).
* Navegação intuitiva por menus.

### 🔐 Área Interna (Staff)
Sistema de **Login** com validação de credenciais e distinção de perfis:

| Perfil | Funcionalidades Principais |
| :--- | :--- |
| **ADMIN** | Consultas estatísticas (Experiências mais procuradas por Adultos/Crianças). |
| **GESTAO** | Consulta de disponibilidade de quartos por semana (Receção). |
| **GUIA** | Histórico de vendas detalhado, contagem de clientes e lucros acumulados. |

---

## ⟲ Funcionalidades em Desenvolvimento 

- [ ] **Conclusão de métodos em falta**
      
---

## 🗂️ Estrutura do Projeto

O código está organizado nos seguintes pacotes:
* `Models`: Entidades base (`Room`, `Tipology`, `Booking`, `Experience`, `Sales`, etc.).
* `Repositories`: Carregamento e gestão de listas de dados (Singleton).
* `Controllers`: Regras de negócio, cálculos de lucro e validações.
* `Views`: Menus de terminal e interação com o utilizador.
* `Tools`: Utilitários para leitura de ficheiros (ex: `CSVFileReader`).

---

## 📁 Persistência de Dados (CSV)

O sistema utiliza os seguintes ficheiros para armazenamento:
* `Files/clientes.csv`
* `Files/experiencias.csv`
* `Files/vendas_experiencias.csv`
* `Files/reservas_quartos.csv`
* `Files/logins.csv`
* `Files/quartos.csv`
* `Files/tipologia.csv`
  
---

## ✍️ Autor

Desenvolvido por **Thais Lira**
