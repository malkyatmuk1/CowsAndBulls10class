package mg.sp.cowsandbulls.logic;

import mg.sp.cowsandbulls.model.GameInfo;

public interface GameService {

	GameInfo startGame();
	GameInfo getGame(String gameId);
	GameInfo makeTry(String gameId, String guess);	
}
