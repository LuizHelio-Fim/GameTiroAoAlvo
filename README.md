# 🎯 Jogo de Alvos em Java

Este é um jogo de tiro em Java baseado em uma matriz 5x5, onde o jogador tenta destruir alvos pretos e evitar os brancos.

## 🧩 Regras do Jogo

- O jogo gera automaticamente **5 alvos**:
  - **3 Alvos Pretos** (que devem ser destruídos)
  - **2 Alvos Brancos** (que devem ser evitados)

- Os alvos são posicionados aleatoriamente em uma matriz 5x5, **sem repetir posições**.

- O jogador tem **10 tiros** para acertar os alvos.

### 🎯 Alvo Preto
- Se acertado, é removido.
- `quantADestruir` (contador de alvos a destruir) **diminui em 1**.

### ⚪ Alvo Branco
- Se acertado, é **substituído por um Alvo Preto** na mesma posição.
- `quantADestruir` **aumenta em 1** (penalidade por erro).

### ❌ Tiro Errado
- Se o jogador errar um tiro (posição sem alvo), nada acontece.

---

## 🏁 Condições de Fim de Jogo

- **Vitória**: Se `quantADestruir` chegar a **0**
- **Derrota**: Se os **10 tiros** acabarem antes disso

---

## 🛠️ Como Executar

1. Compile todos os arquivos `.java`:
   ```bash
   javac *.java
