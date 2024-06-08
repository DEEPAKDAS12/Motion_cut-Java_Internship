import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((char)('A' + i) + ". " + options[i]);
            }
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toUpperCase();

            while (!isValidAnswer(userAnswer, options.length)) {
                System.out.print("Invalid input. Please enter a valid option (A, B, C, or D): ");
                userAnswer = scanner.nextLine().trim().toUpperCase();
            }

            if (question.isCorrectAnswer(userAnswer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer was: " + question.getCorrectAnswer());
            }
            System.out.println();
        }
        displayScore();
    }

    private boolean isValidAnswer(String userAnswer, int numberOfOptions) {
        if (userAnswer.length() != 1) return false;
        char answerChar = userAnswer.charAt(0);
        return answerChar >= 'A' && answerChar < 'A' + numberOfOptions;
    }

    private void displayScore() {
        System.out.println("Your final score is: " + score + "/" + questions.size());
    }
}
