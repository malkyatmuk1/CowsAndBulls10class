package mg.sp.cowsandbulls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CowsAndBullsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CowsAndBullsApplication.class, args);
	}

}
//
// Service - бизнес логика - интерфейс
// ServiceImpl - клас : интерфейса
// DAO/ Repository - база
//Controller - ui
// модели - обектите в приложението - GameInfo