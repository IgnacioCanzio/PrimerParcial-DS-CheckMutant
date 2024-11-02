Instrucciónes para ejecutar el código:

Esta api está hosteada en Render, de modo que no es necesario ejecutarla localmente para hacer peticiones a la misma.

URL Render: https://checkmutant.onrender.com

Es posible hacer dos tipos de peticiones, la primera es un POST que recibe en formato JSON un Array de Strings y devuelve un código HTTP 200OK si
las cadenas corresponde a una secuencia de ADN Mutante. Si corresponde a un ADN Humano devolverá un HTTP 403 Forbidden. En caso de que el Array de String sea
no represente una secuencia ADN por tener Strings de tamaños distintos o con caracteres inválidos, devolverá también un HTTP 403 Forbidden

URL Post ADN: https://checkmutant.onrender.com/api/adn/mutant
Ejemplo Body (raw)= {
  "dna": ["ATGCCA", "CATTTC", "ATTTTG", "AGACGA", "ACGTTA", "ACACTG"]
}
Se recomienda usar Postman u otro programa que permita colocar un body a la petición ya que desde el navegador no será posible.

La segunda petición que recibe esta api es una del tipo GET, devuelve un arreglo de datos con las estadísticas de los ADN almacenados en la base de datos
del sistema.

Esta estadística nos indica la cantidad de ADN Mutantes, ADN Humanos y una proporción entre estos dos.

URL GET: https://checkmutant.onrender.com/api/adn/stats
Esta petición al ser un GET y no requerir de un body es posible hacerla a través de cualquier navegador. También es posible hacerla mediante postman u otro programa similar.
