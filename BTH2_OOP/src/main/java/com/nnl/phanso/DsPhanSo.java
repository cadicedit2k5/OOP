/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnl.phanso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;


/**
 *
 * @author admin
 */
public class DsPhanSo {

    private List<PhanSo> list;

    public DsPhanSo() {
        list = new ArrayList<>();
    }

    public void add() {
        PhanSo p = new PhanSo();
        p.input();
        this.list.add(p);
    }

    public void add(PhanSo p) {
        this.list.add(p);
    }

    public void add(PhanSo... p) {
        this.list.addAll(Arrays.asList(p));
    }
    
    public boolean remove(PhanSo p) {
        return this.list.removeIf(q -> q.soSanh(p) == 0);
    }
    
    public boolean remove(int tuSo, int mauSo) {
        PhanSo p = new PhanSo(tuSo, mauSo);
        return this.remove(p);
    }
    
    public PhanSo sumAll() {
        return this.list.stream().reduce(new PhanSo(), (p, x) -> p.cong(x)).rutGon();
    }
    
    public PhanSo max() {
        return this.list.stream().max((p1, p2) -> p1.soSanh(p2)).get();
    }
    
    public PhanSo min() {
        return this.list.stream().min((p1, p2) -> p1.soSanh(p2)).get();
    }
    
    public void sort() {
        this.list = this.list.stream().sorted((p1, p2) -> (p1.soSanh(p2))).collect(toList());
    }

    public void display() {
        for (var ps : list) {
//            System.out.print(ps + "\t");
            ps.hienThi();
        }
    }
}
