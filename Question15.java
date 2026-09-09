interface Question {
    void evaluateAnswer(String answer);
}

class MCQ implements Question {
    public void evaluateAnswer(String answer) {
        if (answer.equalsIgnoreCase("A")) {
            System.out.println("MCQ answer is correct.");
        } else {
            System.out.println("MCQ answer is wrong.");
        }
    }
}

class CodingQuestion implements Question {
    public void evaluateAnswer(String answer) {
        if (answer.equalsIgnoreCase("correct")) {
            System.out.println("Coding answer is correct.");
        } else {
            System.out.println("Coding answer is wrong.");
        }
    }
}

class DescriptiveQuestion implements Question {
    public void evaluateAnswer(String answer) {
        if (answer.length() > 10) {
            System.out.println("Descriptive answer is accepted.");
        } else {
            System.out.println("Descriptive answer is too short.");
        }
    }
}

public class Question15 {
    public static void main(String[] args) {
        Question q;

        q = new MCQ();
        q.evaluateAnswer("A");

        q = new CodingQuestion();
        q.evaluateAnswer("correct");

        q = new DescriptiveQuestion();
        q.evaluateAnswer("Java is an object oriented language.");
    }
}