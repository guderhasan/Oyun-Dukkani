
public  class Discount implements ICampaignService{

	@Override
	public void addCampaign(Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		game.setPrice(game.getPrice()-(game.getPrice()*campaign.getDiscount()/100));
		System.out.println("Müjde! %"+campaign.getDiscount()+" Ýndirim oranýyla Zalým Cuma Ýndirimleri Geldi "
				
				+game.getGameName()+" oyunu artýk  "
				+game.getPrice()+" Tl"
				
				
				
				
				
				);
		
	}

}
