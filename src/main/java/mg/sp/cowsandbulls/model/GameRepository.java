package mg.sp.cowsandbulls.model;

public interface GameRepository {
	
	public void addGame(GameInfo gameInfo);
	public GameInfo getGameInfo(String gameId);
}
