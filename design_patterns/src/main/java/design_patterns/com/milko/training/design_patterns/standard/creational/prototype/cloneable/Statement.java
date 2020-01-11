package design_patterns.com.milko.training.design_patterns.standard.creational.prototype.cloneable;

import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.creational.prototype.model.Record;

public class Statement implements Cloneable{
	private String sql;
	private List<String> parameters;
	private Record record; 
	
	public Statement(String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}
	
	@Override
	public Statement clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Statement) super.clone();
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
}
