package szydlo

class Team {
	String name;
	String city;
	
	static hasMany = [players:Player];
    static constraints = {
		name(macLenght:20,blank:false)
		city(macLenght:20,blank:false)
    }
}