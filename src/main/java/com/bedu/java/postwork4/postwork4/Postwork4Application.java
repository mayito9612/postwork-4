package com.bedu.java.postwork4.postwork4;

import com.bedu.java.postwork4.postwork4.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class Postwork4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Postwork4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce tu nombre: ");
		String nombre = leer.nextLine();

		System.out.println("Introduce el telefono: ");
		String telefono = leer.nextLine();

		Persona persona = new Persona(nombre, telefono);

		System.out.println(persona);
	}

}
