# SR Challenge

Teniendo como base la existencia de la funcion sendText de la clase website, la cual es capaz de mandar texto a un fotrmulario en la pagina llenando los sigueintes parametros.

```java
sendText(String label, String selectorType, String selector, String value)
```

Donde:
* lable: identifica el nombre del campo
* selectorType: indica el tipo de selector(css, name, id, xpath)
* selector: el selector que debe estar en congruencia con el tipo de selector a usar
* value: el texto enviado

Se requiere completar los datos de los campos Nombre, email, titulo del producto, url del producto y elevator pitch.

Para ello es nesesario conocer los selectores de css, name y xpath de cada campo del formulario.

|Input|name|css|xpath|
|---|---|---|---|
|Nombre|user-submitted-name|input[name='user-submitted-name']|//input[name='user-submitted-name']|
|email|user-submitted-email|input[name='user-submitted-email']|//input[name='user-submitted-email']|
|Titulo|user-submitted-title|input[name='user-submitted-title']|//input[name='user-submitted-title']|
|URL|user-submitted-url[]|input[name='user-submitted-url[]']|//input[name='user-submitted-url[]']|
|Descripcion|user-submitted-content|textarea[name='user-submitted-content']|//textarea[name='user-submitted-content']|

Conociendo estos selectores solo falta utilizar la funcion ``sendText`` para mandar los valores deseados a la pagina de la siguiente manera:


## Using name selector
```java
website.sendText("your-name", "name", "user-submitted-name", "Sebastian Silva");
website.sendText("email-adress", "name", "user-submitted-email", "sebastiansilvabenites@gmail.com");
website.sendText("product-title", "name", "user-submitted-title", "Magnifical Product");
website.sendText("product-url", "name", "user-submitted-url[]", "magnificentproduct.com");
website.sendText("product-description", "name", "user-submitted-content", "Incididunt irure nulla enim excepteur tempor id in do veniam. Sunt dolore in sit magna. Sunt sunt elit amet in consectetur occaecat exercitation reprehenderit cillum cupidatat ad laboris. Labore nostrud Lorem laborum minim minim tempor velit sit. Voluptate esse magna elit adipisicing sunt dolor magna. Amet pariatur cupidatat enim ex sit dolor. Minim elit ad Lorem reprehenderit.");
```

## Using css selector
```java
website.sendText("your-name", "css", "input[name='user-submitted-name']", "Sebastian Silva");
website.sendText("email-adress", "css", "input[name='user-submitted-email']", "sebastiansilvabenites@gmail.com");
website.sendText("product-title", "css", "input[name='user-submitted-title']", "Magnifical Product");
website.sendText("product-url", "css", "input[name='user-submitted-url[]']", "magnificentproduct.com");
website.sendText("product-description", "css", "textarea[name='user-submitted-content']", "Incididunt irure nulla enim excepteur tempor id in do veniam. Sunt dolore in sit magna. Sunt sunt elit amet in consectetur occaecat exercitation reprehenderit cillum cupidatat ad laboris. Labore nostrud Lorem laborum minim minim tempor velit sit. Voluptate esse magna elit adipisicing sunt dolor magna. Amet pariatur cupidatat enim ex sit dolor. Minim elit ad Lorem reprehenderit.");
```

## Using xpath selector
```java
website.sendText("your-name", "xpath", "//input[name='user-submitted-name']", "Sebastian Silva");
website.sendText("email-adress", "xpath", "//input[name='user-submitted-email']", "sebastiansilvabenites@gmail.com");
website.sendText("product-title", "xpath", "//input[name='user-submitted-title']", "Magnifical Product");
website.sendText("product-url", "xpath", "//input[name='user-submitted-url[]']", "magnificentproduct.com");
website.sendText("product-description", "xpath", "//textarea[name='user-submitted-content']", "Incididunt irure nulla enim excepteur tempor id in do veniam. Sunt dolore in sit magna. Sunt sunt elit amet in consectetur occaecat exercitation reprehenderit cillum cupidatat ad laboris. Labore nostrud Lorem laborum minim minim tempor velit sit. Voluptate esse magna elit adipisicing sunt dolor magna. Amet pariatur cupidatat enim ex sit dolor. Minim elit ad Lorem reprehenderit.");
```