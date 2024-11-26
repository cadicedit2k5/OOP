/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLySanPham {
    private List<SanPham> list = new ArrayList<>();
    
    public void add(SanPham... s) {
        this.getList().addAll(Arrays.asList(s));
    }
    
    public void add(String path) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
        Class c = Class.forName(path);
        
        SanPham s = (SanPham) c.getDeclaredConstructor().newInstance();
        s.nhap();
        this.list.add(s);
    }
    
    public void remove(SanPham s) {
        this.getList().removeIf(p -> p.equals(s));
    }
    
    public List<SanPham> find(String key) throws ClassNotFoundException {
        try {
            Class c = Class.forName(key);
            return this.list.stream().filter(s -> c.isInstance(s)).collect(Collectors.toList());
        }catch (ClassNotFoundException ex){
            return this.list.stream().filter(s -> s.getName().contains(key)).collect(Collectors.toList());
        }
    }
    
    public SanPham find(int id) {
        return this.list.stream().filter(s -> s.getId() == id).findFirst().get();
    }
    
    public SanPham find(int minCost, int maxCost) {
        return this.list.stream().filter(s -> s.getPrice() <= maxCost && s.getPrice() >= minCost).findFirst().get();
    }
    
    public void sort() {
        this.list = this.list.stream().sorted((v1, v2) -> -v1.soSanh(v2)).collect(Collectors.toList());
    }
    
    public void display() {
        this.list.forEach((var s) -> {
            System.out.println(s + "\n");
        });
    }

    /**
     * @return the list
     */
    public List<SanPham> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<SanPham> list) {
        this.list = list;
    }
    
    
}
