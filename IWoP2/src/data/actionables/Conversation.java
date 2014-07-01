/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.actionables;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stefan
 */
public class Conversation {

    private final String question, answer;
    private List<Conversation> options;

    public Conversation(String question, String answer, List<Conversation> options) {
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
    
    public List<String> getQuestions(){
        List<String> quest = new ArrayList<>();
        for (Conversation con : options) {
            quest.add(con.getQuestion());
        }
        return quest;
    }
    
    public Conversation askQuestion(String question){
        for (Conversation con : options) {
            if(con.getQuestion().equals(question)){
                return con;
            }
        }
        return this;
    }
}
