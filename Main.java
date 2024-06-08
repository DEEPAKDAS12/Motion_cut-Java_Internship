public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Adding questions about computer network topologies
        quiz.addQuestion(new Question(
            "Which topology has a central hub?",
            new String[]{"Ring", "Bus", "Star", "Mesh"},
            "C"
        ));
        quiz.addQuestion(new Question(
            "Which topology involves each node being connected to exactly two other nodes?",
            new String[]{"Bus", "Star", "Ring", "Tree"},
            "C"
        ));
        quiz.addQuestion(new Question(
            "Which topology is known for its redundancy and fault tolerance?",
            new String[]{"Bus", "Ring", "Star", "Mesh"},
            "D"
        ));
        quiz.addQuestion(new Question(
            "In which topology do all devices share a single communication line?",
            new String[]{"Bus", "Star", "Ring", "Mesh"},
            "A"
        ));
        quiz.addQuestion(new Question(
            "Which topology combines characteristics of star and bus topologies?",
            new String[]{"Tree", "Ring", "Mesh", "Hybrid"},
            "A"
        ));

        // Adding questions about operating systems (threads and paging)
        quiz.addQuestion(new Question(
            "Which of the following is a benefit of multithreading?",
            new String[]{"Increased performance", "Simplified code", "Reduced complexity", "Enhanced security"},
            "A"
        ));
        quiz.addQuestion(new Question(
            "Which of the following best describes a thread in an operating system?",
            new String[]{"A single sequential flow of control", "A collection of multiple processes", "An isolated environment", "A virtual machine"},
            "A"
        ));
        quiz.addQuestion(new Question(
            "What is the primary purpose of paging in an operating system?",
            new String[]{"To increase processing speed", "To manage memory", "To enhance security", "To support multitasking"},
            "B"
        ));
        quiz.addQuestion(new Question(
            "Which of the following is a disadvantage of paging?",
            new String[]{"Internal fragmentation", "External fragmentation", "Reduced memory usage", "Simplified memory management"},
            "A"
        ));
        quiz.addQuestion(new Question(
            "In a multithreaded environment, what is the role of the scheduler?",
            new String[]{"To allocate resources to threads", "To manage memory allocation", "To execute threads in a specific order", "To handle hardware interrupts"},
            "C"
        ));

        // Start the quiz
        quiz.startQuiz();
    }
}
