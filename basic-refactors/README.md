# Rediseño básico

Este módulo te servirá para probar las técnicas básicas de rediseño de código.

Puedes empezar con el test `PersonTest` que se encuentra en `src/test/java`.

Originalmente tiene datos fijos:

```
@Tst
public void testPrintData() {
    System.out.println("first name: " + "John");
    System.out.println("middle name: " + "George");
    System.out.println("last name: " + "Smith");
    System.out.println("age: " + 18);
}
```

Puedes convertir las cadenas fijas en variables posicionando el cursor sobre las cadenas y presionando `cmd+alt+v` desde IDEA.

```
@Test
public void testPrintData() {
    String firstName = "John";
    System.out.println("first name: " + firstName);
    String middleName = "George";
    System.out.println("middle name: " + middleName);
    String lastName = "Smith";
    System.out.println("last name: " + lastName);
    System.out.println("age: " + 18);
}
```

Para reordenar puedes usar `cmd+shift+flecha arriba` o `cmd+shift+flecha abajo`

```
@Test
public void testPrintData() {
    String firstName = "John";
    String middleName = "George";
    String lastName = "Smith";
    
    System.out.println("first name: " + firstName);
    System.out.println("middle name: " + middleName);
    System.out.println("last name: " + lastName);
    System.out.println("age: " + 18);
}
```

La lógica principal se encuentra en las 4 lineas que imprimen a consola, 
```
System.out.println("first name: " + firstName);
System.out.println("middle name: " + middleName);
System.out.println("last name: " + lastName);
System.out.println("age: " + 18);
```
para extraer un método puedes seleccionarlas y presionar `cmd+alt+m`

```
@Test
public void testPrintData() {
    String firstName = "John";
    String middleName = "George";
    String lastName = "Smith";
    printData(firstName, middleName, lastName);
}

private void printData(String firstName, String middleName, String lastName) {
    System.out.println("first name: " + firstName);
    System.out.println("middle name: " + middleName);
    System.out.println("last name: " + lastName);
    System.out.println("age: " + 18);
}
```

Olvidamos extraer la edad, no hay problema, puedes poner el cursor sobre esta y presionar `cmd+alt+p`

```
@Test
public void testPrintData() {
    String firstName = "John";
    String middleName = "George";
    String lastName = "Smith";
    printData(firstName, middleName, lastName, 18);
}

private void printData(String firstName, String middleName, String lastName, int age) {
    System.out.println("first name: " + firstName);
    System.out.println("middle name: " + middleName);
    System.out.println("last name: " + lastName);
    System.out.println("age: " + age);
}
```