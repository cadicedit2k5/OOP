/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author admin
 */
public class QuanLyHocVien {

    private List<HocVien> list = new ArrayList<>();

    public void add(HocVien... hv) {
        this.list.addAll(Arrays.asList(hv));
    }

    public void add(String path) throws FileNotFoundException {
        try ( Scanner sc = new Scanner(new File(path))) {
            while (sc.hasNext()) {
                this.list.add(new HocVien(sc.nextLine(), sc.nextLine()));
            }
        }
    }

    public void enterScores() {
        this.list.forEach(h -> h.enterScore());
    }

    public HocVien find(int id) {
        return list.stream().filter(f -> f.getID() == id).findFirst().get();
    }

    public List<HocVien> find(String name) {
        return list.stream().filter(f -> f.getName().contains(name)).collect(toList());
    }
    
    public List<HocVien> find() {
        return list.stream().filter(f -> f.isHocBong()).collect(toList());
    }
    
    public void xuatDsHB(String path) throws FileNotFoundException {
        try(PrintWriter w = new PrintWriter(new File(path))) {
            for (var h : list) {
                if (h.isHocBong()) {
                    w.printf("%d - %s - %s", h.getID(), h.getName(), h.getAverageScore());
                }
            }
        }
    }
    
    public void sort() {
        this.list = this.list.stream().sorted((var h1, var h2) -> Double.compare(h1.getAverageScore(), h2.getAverageScore())).collect(toList());
    }

    public void display() {
        this.list.forEach(f -> System.out.println(f));
    }

    /**
     * @return the list
     */
    public List<HocVien> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<HocVien> list) {
        this.list = list;
    }

}
