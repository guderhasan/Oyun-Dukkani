
public class GameManager implements IGameManager{
//Sale Manager yerine böyle bir isimlendirme yaptým,Çünkü oyunlarýn veritabanýna kaydý istenmemiþ.
	@Override
	public void Sale(Game game, Customer customer) {
		System.out.println(
				game.getPrice()+" Tl fiyatlý "+
				game.getGameName()+" isimli oyun  "
				+(customer.getFirstName()+"  "+customer.getLastName()+" isimli müþteriye satýldý ")
				
	
				);
		
	}


}
