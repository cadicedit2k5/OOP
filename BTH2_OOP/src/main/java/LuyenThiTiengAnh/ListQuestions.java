/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenThiTiengAnh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author ADMIN
 */
public class ListQuestions {

    public static final Scanner SC = new Scanner(System.in);
    private List<Question> list = new ArrayList<>();

    public void readListQuestions(String path) throws FileNotFoundException {
        FilenameFilter filter = (File dir, String name) -> name.endsWith(".txt");
        File folder = new File(path);
        if (folder.exists()) {
            if (!folder.isDirectory()) {
                System.out.println("Path isn't a directory.");
                return;
            }
            File[] files = folder.listFiles(filter);
            for (var file : files) {
                try (Scanner sc = new Scanner(file)) {
                    String content = sc.nextLine();
                    String[] ops = new String[Config.OPTIONE_SIZE];
                    for (int i = 0; i < Config.OPTIONE_SIZE; i++) {
                        ops[i] = sc.nextLine();
                    }
                    String crAsw = sc.nextLine();
                    this.list.add(new Question(content, ops, crAsw));
                }
            }
        }
    }

    public void addQuestion() throws FileNotFoundException {
        String content = SC.nextLine();
        String[] ops = new String[Config.OPTIONE_SIZE];
        for (int i = 0; i < Config.OPTIONE_SIZE; i++) {
            ops[i] = SC.nextLine();
        }
        String crAsw = SC.nextLine();
        list.add(new Question(content, ops, crAsw));
        UUID uuid = UUID.randomUUID();
        try (PrintWriter w = new PrintWriter(new File("src/main/resources/Questions/" + uuid + ".txt"))) {
            w.println(content);
            for (int i = 0; i < Config.OPTIONE_SIZE; i++) {
                w.println(ops[i]);
            }
            w.println(crAsw);
        }
    }

    public void quizProgram() {
        System.out.print("Nhap so cau hoi: ");
        int n = Integer.parseInt(SC.nextLine());
        
        List<Question> randomQuestions = getRamdomQuestion(n);
        int cnt = 0;
        for (int i = 0; i < randomQuestions.size(); i++){
            System.out.printf("Cau hoi thu %d :", i + 1);
            randomQuestions.get(i).questionQuiz();
            String ans = SC.nextLine();
            if (randomQuestions.get(i).checkAnswer(ans)) {
                System.out.println("Ban da tra loi dung!");
                cnt++;
            }else {
                System.out.println("Rat tiec cau tra loi cua ban chua chinh xac.");
            }
        }
        System.out.printf("So cau dung: %d / %d.", cnt, randomQuestions.size());
    }
    
    public List<Question> getRamdomQuestion(int n) {
        List<Question> copiedList = new ArrayList<>(list);
        
        Collections.shuffle(copiedList);
        
        return copiedList.subList(0, Math.min(n, list.size()));
    }
    
    @Override
    public String toString() {
        String res = "";
        for (var q : list) {
            res += q;
        }
        return res;
    }

    public List<Question> getList() {
        return list;
    }

    public void setList(List<Question> list) {
        this.list = list;
    }

}
