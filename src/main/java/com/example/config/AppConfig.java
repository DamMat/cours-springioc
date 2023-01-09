package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.exo.Instrument;
import com.example.exo.Pianiste;
import com.example.exo.Guitariste;
import com.example.exo.IMusicien;
import com.example.models.User;
import com.example.services.French;
import com.example.services.Language;

//permet de déclarer un composant configurant le contexte de l application
@Configuration
@ComponentScan({"com.example.*"})
public class AppConfig {

	// Un Bean est un objet qui est instancie, assemble 
	// et gere par la factory de Spring Core
	@Bean(name = "user1")
	public User user1() {
		return new User(2, "Doe", "John", 2000);
	}
	
	@Bean(name = "language")
	public Language getLanguage() {
		return new French();
	}
	
	@Bean(name = "musicien")
	public IMusicien getMusicien() {
		return new Pianiste();
	}
	
	@Bean(name = "guitare")
    public Instrument guitare(){
        return new Instrument("Guitare");
    }
	
	@Bean(name = "ukulele")
    public Instrument ukulele(){
        return new Instrument("ukulele");
    }
	
	@Bean(name = "synthe")
    public Instrument synthe(){
        return new Instrument("synthé");
    }
	
	@Bean(name = "piano")
    public Instrument piano(){
        return new Instrument("piano");
    }

}
