package week1Lesson2;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.Date;
/**
 * @author haftomtesfay
 *
 */
public class Department {

	private String name;
	private String location;
	private Company company;
	private ArrayList<Position> positionList;
	

	public Department(String name, String location, Company company) {

		this.name = name;
		this.location = location;
		this.company = company;

		positionList = new ArrayList<Position>();
	}

	public void print() {

		System.out.println("Name: " + name + " location: " + location);
		for (Position pos : positionList)
			pos.print();
	}
	
	public void addPosition(Position pos){
		positionList.add(pos);
	}

}