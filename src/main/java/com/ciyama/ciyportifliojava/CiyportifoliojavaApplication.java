package com.ciyama.ciyportifliojava;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ciyama.ciyportifliojava.domain.Categoria;
import com.ciyama.ciyportifliojava.repositories.CategoriaRepository;

@SpringBootApplication
public class CiyportifoliojavaApplication implements CommandLineRunner {
	
	@Autowired
	public CategoriaRepository CategoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CiyportifoliojavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		CategoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
