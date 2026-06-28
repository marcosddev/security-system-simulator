# Automated Security Logic

Este projeto consiste em um sistema de processamento lógico desenvolvido em Java, simulando o motor de tomada de decisão de uma central de alarme residencial com base nos estados de múltiplos sensores.

## Objetivo do Projeto
O propósito deste desenvolvimento foi aplicar conceitos avançados de álgebra booleana e precedência de operadores. O foco foi estruturar expressões capazes de cruzar dados de sensores físicos (movimento, portas e janelas) com o estado de ativação do sistema para disparar alertas específicos.

## Lógica de Disparo Aplicada
O sistema gerencia as variáveis de entrada dos sensores:
* `motionDetected` (Sensor de movimento de presença)
* `doorOpen` (Sensor magnético de porta)
* `windowOpen` (Sensor magnético de janela)
* `systemArmed` (Estado global de ativação do alarme)

A partir desses dados, são processadas três regras de negócio distintas para o acionamento de alarmes:

1. **Alarm Trigger 1 (Invasão de Perímetro ou Presença):** O alarme dispara se o sistema estiver armado e houver detecção de movimento ou se alguma porta for aberta.
2. **Alarm Trigger 2 (Invasão por Janela):** O alarme é acionado se o sistema estiver armado, uma janela for aberta e a porta principal permanecer fechada.
3. **Alarm Trigger 3 (Ambiente Seguro ou Desarmado):** Avalia se o sistema está operando em modo seguro ou desativado, verificando se o alarme está desligado ou se nenhuma atividade de movimento e abertura de janelas foi registrada.

## Tecnologias Utilizadas
* Java 8+

---
*Projeto desenvolvido para fins de estudo, prática de mapeamento de regras de negócio e validação de expressões booleanas em Java.*
