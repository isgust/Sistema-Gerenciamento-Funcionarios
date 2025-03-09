# Sistema de Gerenciamento de Funcionários

Este projeto é um sistema simples desenvolvido em Java que utiliza conceitos de Programação Orientada a Objetos (POO), como Herança, Polimorfismo, Abstração e Interfaces, para gerenciar diferentes tipos de funcionários e calcular seus bônus.

## Objetivo

O objetivo do sistema é modelar diferentes tipos de funcionários (como Gerentes e Desenvolvedores) e calcular os bônus de cada um com base em regras específicas. O sistema utiliza os conceitos fundamentais de POO para garantir a modularidade e escalabilidade.

## Requisitos

1. **Classe Abstrata "Funcionario"**:
   - Contém atributos comuns a todos os funcionários, como nome e salário.
   - Possui um método abstrato para calcular o bônus do funcionário.

2. **Interface "Calculavel"**:
   - Define o contrato para o cálculo de bônus.
   - Todas as classes que implementarem essa interface devem obrigatoriamente sobrescrever o método de cálculo de bônus.

3. **Classes Específicas de Funcionários**:
   - **Gerente**: Herda de "Funcionario" e implementa "Calculavel".
   - **Desenvolvedor**: Herda de "Funcionario" e implementa "Calculavel".
   - Cada classe sobrescreve o método de cálculo de bônus com uma regra específica.

4. **Classe Principal "SistemaFuncionario"**:
   - Cria um `ArrayList` para armazenar diferentes tipos de funcionários.
   - Cria instâncias de "Gerente" e "Desenvolvedor" e as adiciona à lista.
   - Exibe a lista de funcionários com seus respectivos nomes e valores de bônus calculados.

5. **Expansão do Projeto (Opcional)**:
   - Criar um menu interativo para cadastrar novos funcionários.
   - Adicionar mais tipos de funcionários, como "Analista".
   - Utilizar entrada de dados para capturar informações do usuário.

## Como Rodar o Projeto

### Requisitos

- JDK 8 ou superior instalado.
- Um IDE de sua preferência (ex.: IntelliJ IDEA, Eclipse, NetBeans) ou utilizar o terminal para compilar e executar os arquivos.

### Passos para Execução

1. **Clonar o repositório**:

```bash
git clone https://github.com/seuusuario/Sistema-Gerenciamento-Funcionarios.git
```

2. **Abrir o projeto na sua IDE preferida** ou no terminal.

3. **Compilar e executar**:

No terminal, navegue até a pasta do projeto e execute o comando:

```bash
javac SistemaFuncionario.java
java SistemaFuncionario
```

Isso deve compilar e rodar o sistema, exibindo a lista de funcionários com seus bônus calculados.

## Estrutura do Código

- **Funcionario.java**: Classe abstrata que define os atributos e o método para calcular o bônus.
- **Calculavel.java**: Interface que define o contrato para o cálculo de bônus.
- **Gerente.java**: Classe que implementa a interface `Calculavel` e herda de `Funcionario`, com lógica para cálculo de bônus de Gerente.
- **Desenvolvedor.java**: Classe que implementa a interface `Calculavel` e herda de `Funcionario`, com lógica para cálculo de bônus de Desenvolvedor.
- **SistemaFuncionario.java**: Classe principal que gerencia a criação de instâncias de funcionários e exibe os resultados.

## Expansões Futuras

- **Adicionar mais tipos de funcionários**, como Analista, Diretor, etc.
- **Implementar persistência de dados**, como salvar os funcionários em um banco de dados.
- **Criar interface gráfica (GUI)** para melhorar a experiência do usuário.

## Contribuição

Se você deseja contribuir para o projeto, sinta-se à vontade para abrir uma **issue** ou enviar um **pull request**.

1. Faça um fork deste repositório.
2. Crie uma branch para sua feature (`git checkout -b minha-feature`).
3. Faça suas alterações.
4. Commit as alterações (`git commit -am 'Adicionando nova feature'`).
5. Envie para o repositório remoto (`git push origin minha-feature`).
6. Abra um pull request.

