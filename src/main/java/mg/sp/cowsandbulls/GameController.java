package mg.sp.cowsandbulls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import mg.sp.cowsandbulls.logic.GameService;
import mg.sp.cowsandbulls.model.GameInfo;

@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping("/")
	public String hello() {
		return "Welcome";
	}
	
	@PostMapping("games")
	public String startNewGame(Model model) {
		GameInfo gameInfo = gameService.startGame();
		//TODO redirect
		return "redirect:/games/" + gameInfo.getGameId();
		
	}
	
	// localhost:8080/games/46554872368
	@GetMapping("games/{id}")
	public String showGame(@PathVariable String id, Model model) {
		GameInfo gameInfo = gameService.getGame(id);
		
		model.addAttribute("game",gameInfo);
		
		return "Game";
	}
	
}
