package simulator.model;

public abstract class NewRoadEvent extends Event {

	protected String id;
	protected String srcJun;
	protected String destJunc;
	protected int lenght;
	protected int co2Limit;
	protected int maxSpeed;
	protected Weather weather;
	
	public NewRoadEvent(int time, String id, String srcJun, String destJunc,
			int lenght, int co2Limit, int maxSpeed, Weather weather) {
		super(time);
		this.id=id;
		this.srcJun=srcJun;
		this.destJunc=destJunc;
		this.lenght=lenght;
		this.co2Limit=co2Limit;
		this.maxSpeed=maxSpeed;
		this.weather=weather;		
	}
}
