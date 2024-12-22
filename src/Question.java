public class Question {
    private String description;
    private boolean answer;

    Question(String description, boolean answer) {
        this.description = description;
        this.answer = answer;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getAnswer() {
        return this.answer;
    }
}
