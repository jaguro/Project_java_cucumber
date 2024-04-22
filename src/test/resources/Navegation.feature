Feature: La barra de navegacion permite la visualizacion de todos las secciones web
  Puedo hacer click en los links
  No tengo por que estar logueado previamente
  Puedo ver el resto de secciones web

Scenario Outline: Puedo acceder a las subsecciones haciendo click en las opciones del NavBar
  Given Puedo navegar a la siguiente web www.feerangetesters.com
  When Puedo entrar en la <seccion> haciendo click
  Examples:
    | seccion    |
    | Cursos     |
    | Recursos   |
    | Blog       |
    | Mentorías  |
    | Udemy      |





