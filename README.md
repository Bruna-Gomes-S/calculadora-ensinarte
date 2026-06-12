#Calculadora 

Este repositório contém o código-fonte, a suíte de testes unitários automatizados e toda a gerência de configuração da **`calculadora-ensinarte`**. O sistema foi desenvolvido em **Java** utilizando o ecossistema **Apache Maven** e o framework **JUnit 5**, tendo como foco a resolução de um problema real de gestão escolar detectado na comunidade por meio da extensão tecnológica universitária.

---

## 🏫 O Contexto e o Problema Real 

A **ENSINARTE – Centro Especializado em Aprendizagem** é uma instituição parceira local voltada para a educação especializada e inclusiva, onde cerca de **95% dos alunos matriculados são crianças atípicas**. Devido à natureza do atendimento, a rotina pedagógica dos professores e coordenadores exige um nível extremo de dedicação, acompanhamento comportamental e atenção individualizada.

### 🔴 O Gargalo Administrativo
Durante as visitas técnicas, identificou-se que todo o fechamento de médias aritméticas bimestrais e a definição do status acadêmico final dos alunos (Aprovado, Recuperação ou Reprovado) eram realizados de forma **100% manual**. Esse processo burocrático gerava:
* Desgaste operacional desnecessário da equipe docente.
* Perda de tempo precioso que deveria estar focado no planejamento de atividades lúdicas e adaptadas.
* Risco iminente de erros humanos de cálculo e arredondamento nos históricos das crianças.

### 🟢 A Solução Tecnológica
O sistema `calculadora-ensinarte` foi concebido para automatizar integralmente esse processo. O software recebe as notas, realiza o cálculo da média aritmética instantaneamente e valida o status acadêmico definitivo de forma padronizada e segura, reduzindo a zero a carga de trabalho manual dos educadores.

---

## 🛠️ Arquitetura do Software e Estrutura de Arquivos

Para garantir os princípios de coesão, acoplamento fraco e separação de responsabilidades (Clean Code), o projeto foi estruturado dentro das diretrizes do Apache Maven no ambiente Eclipse IDE, sendo composto por **quatro componentes fundamentais**:

1. **`pom.xml` (Project Object Model):** Arquivo central de configuração do Maven. Gerencia de forma automatizada o ciclo de vida do projeto e baixa as dependências necessárias para a execução dos testes de software.
2. **`Calculadora.java`:** O núcleo de regras de negócio. Isola a lógica matemática do sistema. Recebe os parâmetros de entrada (notas), calcula a média e aplica de maneira fixa e transparente os critérios de corte institucionais:
   * **Aprovado:** Média igual ou superior à nota de corte superior.
   * **Recuperação:** Média intermediária (na risca da média de corte).
   * **Reprovado:** Média abaixo da nota mínima estabelecida.
3. **`Principal.java`:** Ponto de entrada executável do sistema (`public static void main`). Atua como a interface via linha de comando (console/terminal). Captura as entradas do teclado digitadas pelos professores, invoca os métodos da classe `Calculadora` e plota o resultado formatado imediatamente na tela.
4. **`CalculadoraTest.java`:** Classe dedicada exclusivamente à Garantia de Qualidade de Software (SQA). Contém uma suíte robusta de testes de unidade automatizados que realizam a auditoria interna contínua do algoritmo.

---

## 🧪 Garantia de Qualidade de Software (SQA) com JUnit 5

Seguindo os padrões rígidos estabelecidos na Engenharia de Software (Pressman, 2016), implementamos **Testes Unitários Automatizados** com o framework **JUnit 5**. 

Os testes simulam e validam exaustivamente todos os cenários possíveis da realidade da escola:
* **Cenário de Excelência:** Validação de notas altas que devem resultar no status estrito de `Aprovado`.
* **Cenário Limite:** Validação de notas limítrofes (na risca da nota de corte) para garantir o comportamento matemático exato do sistema ao enviar o aluno para a `Recuperação`, sem falhas de arredondamento.
* **Cenário de Risco:** Validação de notas insuficientes que disparam o status de `Reprovado`.

> 🟩 **Selo de Estabilidade:** A execução local e remota da suíte de testes retorna **100% Green Bar (Barra Verde)** no Eclipse, comprovando que o software é matematicamente blindado contra regressões e bugs de lógica.

---

## ⛓️ Gerência de Configuração e Boas Práticas de Git / GitHub

O histórico e a evolução deste repositório foram gerenciados de forma estrita utilizando o Git Bash, aplicando conceitos avançados requisitados no mercado de trabalho:

### 🌿 Isolamento por Branches
O desenvolvimento não foi efetuado diretamente na linha principal. Criou-se a ramificação isolada `feat/calculadora-notas`, permitindo a escrita de código e execução de testes em um ambiente controlado, mantendo a estabilidade da branch `main`.

### ⚛️ Commits Atômicos e Organizados
Para manter um histórico limpo e auditável, o código foi commitado em frações lógicas pequenas e independentes (commits atômicos), evitando pacotes massivos de alterações. A linha do tempo reflete o progresso natural das entregas:
* Configuração estrutural do Maven (`pom.xml`).
* Implementação do core business (`Calculadora.java`).
* Interface de console (`Principal.java`).
* Cobertura de testes unitários (`CalculadoraTest.java`).

### 🔀 Integração via Pull Request e Merge
Ao término, a branch `feat/calculadora-notas` foi enviada ao GitHub remoto. Foi aberto um **Pull Request (PR)** formal contendo toda a documentação técnica das modificações. Após a validação das diretrizes e o sucesso dos testes, realizou-se o processo de **Merge** definitivo, unificando os históricos na branch `main` (com o status oficial do GitHub alterado para `Merged`).

---

## 🚀 Como Executar o Projeto Localmente

### Pré-requisitos
* **Java Development Kit (JDK 21 ou superior)** instalado e configurado nas variáveis de ambiente.
* **Apache Maven** configurado.
* Uma IDE
