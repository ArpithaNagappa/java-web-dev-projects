package org.example;

public class QuizRunner {
    public static final Quiz quiz = new Quiz();

    public static void main(String[] args) {
        String q1 = "What is Java?";
        Choice[] q1Choices = new Choice[]{
                new Choice(" A programming language"),
                new Choice(" A compiler"),
                new Choice(" An operating system"),
                new Choice(" A database"),
        };
        CheckBox question1 = new CheckBox(q1, q1Choices);

        String q2 = "Java has a default constructor?";
        Choice[] q2Choices = new Choice[]{
                new Choice(" True"),
                new Choice(" False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "What is the difference between a class and an object?";
        Choice[] q3Choices = new Choice[]{
                new Choice("A class is a blueprint, while an object is an instance of a class"),
                new Choice("A class is a collection of objects, while an object is a member of a class"),
                new Choice("A class is a static entity, while an object is a dynamic entity"),
                new Choice("All of the above"),
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);
        quiz.addQuestions(new Questions[]{question1, question2, question3});

        quiz.run();

    }
}