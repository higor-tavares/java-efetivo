# Static Factory e Builders no lugar de construtores

Prefira o uso de factories e mantenha os construtores privados
isso dá mais legibilidade ao código cliente pois não seria necessário setar manualmente
os atributos no estilo Java Bean e não haveria confusão entre diversos construtores com parametros opcionais
Factories também são uma boa alternativa para implementar um singleton
A classe login service possui um construtor privado sendo possível ter apenas uma instancia estática do LoginService  
  
Quando tivermos muitos atributos opcionais uma alternativa limpa e clara é usar o padrão builder como na classe NutritionalInfo

  
Podemos usar o try with resouces para recursos que implementam auto closable