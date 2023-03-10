package com.bedu.java.postwork4.postwork4;

import com.bedu.java.postwork4.postwork4.model.Persona;
import com.bedu.java.postwork4.postwork4.service.FormateadorTelefono;
import com.bedu.java.postwork4.postwork4.service.ValidadorTelefono;
import org.springframework.beans.factory.annotation.Autowired;
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

	private final ValidadorTelefono validadorTelefono;
	private final FormateadorTelefono formateadorTelefono;


	@Autowired
	public Postwork4Application(ValidadorTelefono validadorTelefono, FormateadorTelefono formateadorTelefono) {
		this.validadorTelefono = validadorTelefono;
		this.formateadorTelefono = formateadorTelefono;
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);


		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();


		System.out.println("Introduce el telefono: ");
		String telefono = reader.nextLine();


		if (validadorTelefono.isValido(telefono)) {
			telefono = validadorTelefono.limpiaNumero(telefono);
			telefono = formateadorTelefono.formatea(telefono);


			Persona persona = new Persona(nombre, telefono);


			System.out.println(persona);
		} else {
			System.out.println("Por favor, introduce un numero valido");
		}

	}






}
