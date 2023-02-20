package com.dp.learnspringframework.game;

public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("UP");
    }

    public void down(){
        System.out.println("SIT DOWN");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("RUN");
    }
}
