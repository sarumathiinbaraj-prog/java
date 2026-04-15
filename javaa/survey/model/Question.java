package survey.model;

public class Question {
    private String questionText;
    private String answer;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}