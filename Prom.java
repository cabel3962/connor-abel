package lowercaseletters;

public class Prom {
	private String firstName, lastName;
	private String yearLevel;
	private String ticketType;

	public Prom (String s1, String s2, String s3, String s4) {
		firstName = s1;
		lastName = s2;
		yearLevel = s3;
		ticketType = s4;
	
	}
				
	public double cost(String level, String guests) {
		double cost = 0;
		if (level == "senior") {
			cost = 40;
		}
		else if (guests == "couple") {
			cost = 60;
		}
		else if (guests == "group") {
			cost = 100;
		}
	if (level =="junior") {
		if (guests == "solo") {
			cost = 45;
		}
		else if (guests == "couple") {
			cost = 60;
		}
		else if (guests == "group") {
			cost = 113;
		}
		if (level =="sophmore") {
		if (guests == "solo") {
			cost = 55;
		}
		else if (guests == "couple") {
			cost = 83;
			}
		else if (guests == "group") {
			cost = 138;
	}
		if (level =="freshmen") {
			if (guests == "solo") {
			cost = 65;
				}
			else if (guests == "couple") {
			cost = 98;
				}
			else if (guests == "group") {
			cost = 163;
			}
		}
		}
	}
		return cost;
	}
		
		public static String generate() {
			int count = 0;
			int rand = 0;
			String password = "";
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			while(count < 8) {
				rand = (int) (Math.random() * characters.length());
				password += characters.substring(rand, rand + 1);
				
				count ++;
				
			}
			return password;
		}
		public void update() {
			System.out.println(firstName + " " + lastName + "Bought one " + yearLevel + " " + ticketType + " " + "ticket for " + cost(yearLevel, ticketType) + ". " + "The password for this ticket is " + generate());
		}
	}
		
