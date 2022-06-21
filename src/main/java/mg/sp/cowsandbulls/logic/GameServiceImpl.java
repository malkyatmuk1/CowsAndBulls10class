package mg.sp.cowsandbulls.logic;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mg.sp.cowsandbulls.model.GameInfo;
import mg.sp.cowsandbulls.model.GameRepository;
import mg.sp.cowsandbulls.model.TryInfo;

@Service("gameService")
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepository gameRepository;
	
	
	@Override
	public GameInfo startGame() {
		var gameInfo = new GameInfo();
		gameInfo.setGameId(UUID.randomUUID().toString());
		
		var number = new int[4];
		var random = new Random();
		
		for (int i = 0; i < number.length; i++) {
			number[i] = random.nextInt(9);
		}
		
		gameInfo.setNumber(number);
		gameRepository.addGame(gameInfo);	
				
		return gameInfo;
	}

	@Override
	public GameInfo getGame(String gameId) {
		
		return gameRepository.getGameInfo(gameId);
	}

	@Override
	public GameInfo makeTry(String gameId, String guess) {
		GameInfo gameInfo = gameRepository.getGameInfo(gameId);
		
		TryInfo tryInfo = new TryInfo();
		tryInfo.setGuessString(guess);
		//TODO calculate cows and bulls
		//tryInfo.setCows and bulls
		gameInfo.getHistory().add(tryInfo);
		return gameInfo;
	}
	
	//private calculate bulls
	//private calculate cows

}
