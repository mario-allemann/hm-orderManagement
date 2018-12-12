package fhnw.hackermans.shopstantlySPRING;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TestTable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String testAtt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTestAtt() {
		return testAtt;
	}
	public void setTestAtt(String testAtt) {
		this.testAtt = testAtt;
	}

}