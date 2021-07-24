#language:pt

  Funcionalidade: Busca de carros

    Cenario: Tentar realizar uma busca sem digitar nada no campo de busca
      Dado que o usuário está na home do site de carros
      Quando clicar em Buscar
      Entao deve visualizar os carros para a região em que o cliente se encontra.