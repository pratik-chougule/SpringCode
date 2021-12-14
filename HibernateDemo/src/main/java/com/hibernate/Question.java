package com.hibernate;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Question {

	  @Id
	 private int questionId;
	 private String question;
	 
	 @OneToMany(mappedBy ="question",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	 private List<Answer> answers;
	

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	
	
	
	
	 
	 
	 
}
