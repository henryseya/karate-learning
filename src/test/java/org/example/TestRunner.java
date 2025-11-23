package org.example;  // Indica el paquete donde está esta clase

import com.intuit.karate.junit5.Karate;  // Importa la librería Karate para JUnit5

public class TestRunner {  // Clase que ejecutará las pruebas Karate
    @Karate.Test  // Anotación que indica que este método es una prueba Karate
    Karate testAll() {
        // Ejecuta todos los archivos .feature dentro de la carpeta "features"
        return Karate.run("classpath:features");
    }
}
/*package org.example;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
    Karate testAll() {
        // Ejecuta todos los .feature en la carpeta "features"
        return Karate.run("classpath:features");
    }
}*/
/*package org.example;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:features");
    }
}*/
/*package org.example;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
    Karate testSpecific() {
        return Karate.run("01-jsonplaceholder-get").relativeTo(getClass());
    }
}*/
/*package org.example;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
    Karate testSpecific() {
        return Karate.run("classpath:features/01-jsonplaceholder-get.feature");
    }
}*/
/*package org.example;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
    Karate testSpecific() {
        return Karate.run("features/01-jsonplaceholder-get").classpath();
    }
}*/
/*package org.example;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
    Karate testSpecific() {
        return Karate.run("classpath:features/ejemplo");
    }
}*/
