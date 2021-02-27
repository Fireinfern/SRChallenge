// Using name salector
website.sendText("your-name", "name", "user-submitted-name", "Sebastian Silva");
website.sendText("email-adress", "name", "user-submitted-email", "sebastiansilvabenites@gmail.com");
website.sendText("product-title", "name", "user-submitted-title", "Magnifical Product");
website.sendText("product-url", "name", "user-submitted-url[]", "magnificentproduct.com");
website.sendText("product-description", "name", "user-submitted-content", "Incididunt irure nulla enim excepteur tempor id in do veniam. Sunt dolore in sit magna. Sunt sunt elit amet in consectetur occaecat exercitation reprehenderit cillum cupidatat ad laboris. Labore nostrud Lorem laborum minim minim tempor velit sit. Voluptate esse magna elit adipisicing sunt dolor magna. Amet pariatur cupidatat enim ex sit dolor. Minim elit ad Lorem reprehenderit.");

// Using css selector
website.sendText("your-name", "css", "input[name='user-submitted-name']", "Sebastian Silva");
website.sendText("email-adress", "css", "input[name='user-submitted-email']", "sebastiansilvabenites@gmail.com");
website.sendText("product-title", "css", "input[name='user-submitted-title']", "Magnifical Product");
website.sendText("product-url", "css", "input[name='user-submitted-url[]']", "magnificentproduct.com");
website.sendText("product-description", "css", "textarea[name='user-submitted-content']", "Incididunt irure nulla enim excepteur tempor id in do veniam. Sunt dolore in sit magna. Sunt sunt elit amet in consectetur occaecat exercitation reprehenderit cillum cupidatat ad laboris. Labore nostrud Lorem laborum minim minim tempor velit sit. Voluptate esse magna elit adipisicing sunt dolor magna. Amet pariatur cupidatat enim ex sit dolor. Minim elit ad Lorem reprehenderit.");


// Using xpath selector
website.sendText("your-name", "xpath", "//input[name='user-submitted-name']", "Sebastian Silva");
website.sendText("email-adress", "xpath", "//input[name='user-submitted-email']", "sebastiansilvabenites@gmail.com");
website.sendText("product-title", "xpath", "//input[name='user-submitted-title']", "Magnifical Product");
website.sendText("product-url", "xpath", "//input[name='user-submitted-url[]']", "magnificentproduct.com");
website.sendText("product-description", "xpath", "//textarea[name='user-submitted-content']", "Incididunt irure nulla enim excepteur tempor id in do veniam. Sunt dolore in sit magna. Sunt sunt elit amet in consectetur occaecat exercitation reprehenderit cillum cupidatat ad laboris. Labore nostrud Lorem laborum minim minim tempor velit sit. Voluptate esse magna elit adipisicing sunt dolor magna. Amet pariatur cupidatat enim ex sit dolor. Minim elit ad Lorem reprehenderit.");