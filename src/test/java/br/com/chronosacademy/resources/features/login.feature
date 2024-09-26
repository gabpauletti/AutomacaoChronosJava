 #language:pt

 Funcionalidade: : Login

   Contexto:
     Dado que a janela esteja sendo exibida

   @fecharjanela
   Cenario: Clique fora da janela

     Quando Realizado um clique fora
     Entao A janela se fecha

   @fecharjanelaicone
   Cenario: Clique no botão de fechar

     Quando Realizado um clique no icone de fechar
     Entao A janela se fecha

   @createacc
   Cenario: Create New Account

     Quando for realizado um clique no link Create New Account
     Entao a pagina Create Account deve ser exibida

   Esquema do Cenario: Realizar login com <identificacao>
     Quando os campos de login sejam preenchidos da seguinte forma
       | login    | <login>    |
       | password | <password> |
       | remember | <remember> |
     Quando for realizado o clique no botao sign in

     Entao o sistema devera exibir uma mensagem de erro
     Exemplos:
       | identificacao    | login      | password | remember |
       | usuário inválido | invalido   | Gabgab12 | false    |
       | senha inválida   | chronosgab | invalida | false    |

   @espacosbranco

   Esquema do Cenario: Realizar login com <identificacao>
     Quando os campos de login sejam preenchidos da seguinte forma
       | login    |       |
       | password | senha |
       | remember | false |

     Entao o botao sign in deve permanecer desabilitado
     Exemplos:
       | identificacao     | login   | password | remember |
       | usuário em branco |         | senha    | false    |
       | senha em branco   | chronos |          | false    |

   Cenario: Realizar login com campos obrigatórios
     Quando os campos de login sejam preenchidos da seguinte forma
       | login    | chronosgab |
       | password | Gabgab12   |
       | remember | false      |
     Quando for realizado o clique no botao sign in
     Entao deve ser possivel logar no sistema

     @logintrue
   Cenario: Realizar login com todos os campos
     Quando os campos de login sejam preenchidos da seguinte forma
       | login    | chronosgab |
       | password | Gabgab12   |
       | remember | true       |
     Quando for realizado o clique no botao sign in
     Entao deve ser possivel logar no sistema