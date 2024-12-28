# Trabalho Programação II

O trabalho prático desenvolvido para a disciplina de Programação II tem como objetivo simular o controle de operações de um aeroporto, incluindo o gerenciamento de aeronaves, passageiros e pilotos. O sistema foi projetado para atender a todos os critérios de avaliação estabelecidos pelo professor, utilizando técnicas de programação orientada a objetos, interface gráfica intuitiva, persistência em banco de dados e tratamento de exceções.

## Descrição do Cenário

O sistema de gerenciamento de aeroporto centraliza a administração geral de aeronaves, além de coordenar informações de passageiros e pilotos. As principais entidades são:

• Aeroporto: Trata-se do núcleo do sistema, gerencia operações e informações.
Atributos: nome, cidade, estado, pais e id.

• Aeronave: Veículos aéreos para transporte de passageiros e carga. Atributos:
companhia, capacidade, modelo, código, id.

• Pessoa: Classe base para Passageiro e Piloto, contendo atributos comuns como nome,
idade, cpf, voo, destino e id.

• Passageiro: Clientes que utilizam os serviços do aeroporto, com informações
específicas como classe, poltrona e id.

• Piloto: Profissionais responsáveis pela operação das aeronaves, com dados como
número da licença e id.
