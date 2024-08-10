# Desafio de POO e de UML do IPhone

---

## Solução do desafio do diagrama de UML do IPhone da Digital Innovation One - DIO

---

## Descrição

Este repositório contém a solução para o Desafio da Trilha Java Básico da DIO, que envolve a modelagem e diagramação de um componente iPhone. O projeto abrange a implementação das funcionalidades descritas no desafio, como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Objetivo

1. Criar um diagrama UML que represente as funcionalidades do iPhone, incluindo:
   - Reprodutor Musical
   - Aparelho Telefônico
   - Navegador na Internet
2. Implementar as classes e interfaces correspondentes em Java.

## Funcionalidades

1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

