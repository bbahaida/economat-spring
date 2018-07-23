package com.bahaida.economasnim;

import com.bahaida.economasnim.persistence.domain.*;
import com.bahaida.economasnim.persistence.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EconomaSnimApplication {

	private static Logger logger = LoggerFactory.getLogger(EconomaSnimApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EconomaSnimApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner(
			CategorieRepository categorieRepository, ArticleRipository articleRipository,
			AgentRepository agentRepository, CommandRepository commandRepository, ArticleCommandRepository articleCommandRepository){
		return args -> {

			// Add some categories
			Categorie ouvrier = new Categorie("Ouvrier",28000);
			Categorie cadre = new Categorie("Cadre",46000);

			ouvrier = categorieRepository.save(ouvrier);
			cadre = categorieRepository.save(cadre);

			// Add some articles
			Article riz = new Article("riz",200);
			Article huile = new Article("huile",500);

			riz = articleRipository.save(riz);
			huile = articleRipository.save(huile);

			// Add some agents

			Agent agent1 = new Agent("Brahim",700);
			agent1.setCategorie(cadre);
			Agent agent2 = new Agent("Ahmed",275);
			agent2.setCategorie(ouvrier);

			agent1 = agentRepository.save(agent1);
			agent2 = agentRepository.save(agent2);


			Commande commande = new Commande();


			commande.setPrixTotal(45* riz.getPrixUnitaire());
			commande.setAgent(agent1);


			commande = commandRepository.save(commande);

			ArticleCommand articleCommand = new ArticleCommand(commande, riz);
			articleCommand.setQuantite(45);
			//logger.info(articleCommand.toString());
			articleCommand = articleCommandRepository.save(articleCommand);
			logger.info(articleCommand.toString());


		};
	}*/
}
