package design_patterns.com.milko.training.design_patterns.standard.creational.prototype.main;

import java.util.ArrayList;
import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.creational.prototype.cloneable.Statement;
import design_patterns.com.milko.training.design_patterns.standard.creational.prototype.model.Record;

public class PrototypeEverydayDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		String sql = "select * from movies where title = ?";
		
		List<String> parameters = new ArrayList<>();
		parameters.add("Start wars");
		
		Record record = new Record();
		Statement firstStatement = new Statement(sql, parameters, record);
		System.out.println(firstStatement);
		
		System.out.println(firstStatement.getSql());
		
		System.out.println(firstStatement.getParameters());
		
		System.out.println(firstStatement.getRecord());
		
		Statement secondStatement = firstStatement.clone();
		
		System.out.println(secondStatement);
		
		System.out.println(secondStatement.getSql());
		
		System.out.println(secondStatement.getParameters());
		
		System.out.println(secondStatement.getRecord());
	}

}
