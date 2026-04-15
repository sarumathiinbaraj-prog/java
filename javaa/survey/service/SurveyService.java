package survey.service;

import survey.model.Question;
import java.util.ArrayList;
import java.util.Scanner;

public class SurveyService {
    private ArrayList<Question> questions = new ArrayList<>();

    public void addQuestion(String text) {
        questions.add(new Question(text));
    }

    public void conductSurvey() {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.getQuestionText());
            String ans = sc.nextLine();
            q.setAnswer(ans);
        }
    }

    public void displayResponses() {
        System.out.println("\nSurvey Results:");
        for (Question q : questions) {
            System.out.println(q.getQuestionText() + " -> " + q.getAnswer());
        }
    }
}