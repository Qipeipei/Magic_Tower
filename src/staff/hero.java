package staff;

public class hero implements staff{
	private int life;
	private int attack;
	private int defence;
	
	private int yellow_key = 1;
	private int blue_key = 1;
	private int red_key = 1;
	
	private int money = 0;
	private int experience = 0;
	
	private int layer;
	private int level;
	
	@Override
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	@Override
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	@Override
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	@Override
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getYellow_key() {
		return yellow_key;
	}
	public void setYellow_key(int yellow_key) {
		this.yellow_key = yellow_key;
	}
	public int getBlue_key() {
		return blue_key;
	}
	public void setBlue_key(int blue_key) {
		this.blue_key = blue_key;
	}
	public int getRed_key() {
		return red_key;
	}
	public void setRed_key(int red_key) {
		this.red_key = red_key;
	}
	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		this.layer = layer;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public hero(int life,int attack,int defence,int yellow_key,int blue_key,int red_key,int money,int experience,int layer,int level){
		this.life = life;
		this.attack = attack;
		this.defence = defence;
		this.yellow_key = yellow_key;
		this.blue_key = blue_key;
		this.red_key = red_key;
		this.money = money;
		this.experience = experience;
		this.layer = layer;
		this.level = level;
	}
	public void attack() {
		
	}
}
