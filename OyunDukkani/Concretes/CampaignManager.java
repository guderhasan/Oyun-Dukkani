
public class CampaignManager implements ICampaignManager{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" eklendi");
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" silindi");

	}

	@Override
	public void upDate(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" güncellendi");

	}


	
}
