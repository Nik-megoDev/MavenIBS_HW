package ru.ibs.gnm.hello_world;

public class MainClass {
    public static void main(String[] args) {
        Hello_World hi = new Hello_World();
        hi.seyHi(hi.hello);  //Вывод "Hello World"
        hi.seyHi(hi.hello.toUpperCase());//Вывод "Hello World" большими буквами
        }

    }

