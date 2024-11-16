/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenThiTiengAnh;

/**
 *
 * @author ADMIN
 */
public class Question {
    private String content;
    private String[] options = new String[Config.OPTIONE_SIZE];
    private String correctAnswer;

    public Question(String content, String[] options, String correctAnswer) {
        this.content = content;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    
    public void questionQuiz() {
        System.out.println(content);
    }
    
    public int getCorrectOrder(String answer) {
        switch (answer) {
            case "A" -> {
                return 0;
            }
            case "B" -> {
                return 1;
            }
            case "C" -> {
                return 2;
            }
            case "D" -> {
                return 3;
            }
        }
        return -1;
    }
    
    public boolean checkAnswer(String answer) {
        int correctAnswerOrder = getCorrectOrder(this.correctAnswer);
        return options[correctAnswerOrder].equals(answer);
    }
    
    @Override
    public String toString() {
        String res = content + "\n";
        for (var op : options) {
            res += op  + "\n";
        }
        res += correctAnswer + "\n";
        return res;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
    
}
