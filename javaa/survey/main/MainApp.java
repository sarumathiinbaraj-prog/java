package survey.main;

import survey.service.SurveyService;

public class MainApp {
    public static void main(String[] args) {
        SurveyService survey = new SurveyService();

        survey.addQuestion("What is your name?");
        survey.addQuestion("How old are you?");
        survey.addQuestion("Favorite programming language?");

        survey.conductSurvey();
        survey.displayResponses();
    }
}
