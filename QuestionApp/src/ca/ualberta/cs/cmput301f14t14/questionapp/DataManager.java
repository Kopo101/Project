package ca.ualberta.cs.cmput301f14t14.questionapp;

import java.util.List;

import ca.ualberta.cs.cmput301f14t14.questionapp.model.Answer;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Comment;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Model;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Question;

public class DataManager {
	private static LocalDataStore localDataStore;
	
	public void addQuestion(Question validQ) {
		// TODO Auto-generated method stub
		
	}

	public Question getQuestion(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Answer getAnswer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putQuestion(Question validQ) {
		// TODO Auto-generated method stub
		
	}

	public Comment getComment(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void favoriteQuestion(Question validQ) {
		// TODO Auto-generated method stub
		
	}

	public void favoriteAnswer(Answer validA) {
		// TODO Auto-generated method stub
		
	}

	public void disableNetworkAccess() {
		// TODO Auto-generated method stub
		
	}

	public void enableNetworkAccess() {
		// TODO Auto-generated method stub
		
	}
	
	public int getItemCount() {
		return 0;}
	
	public List<Model> getItems() { return null;}



	public void readLater(Question q) {
		// TODO Auto-generated method stub
		
	}

	public void readLater(Answer mAnswer) {
		// TODO Auto-generated method stub
	}

	public String getAuthor() {
		// TODO Auto-generated method stub
		return this.localDataStore.getUsername();
	}
	
	public static LocalDataStore getLocalDataStore(){
		return localDataStore;
	}

}
