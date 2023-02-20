package com.dp.learnspringframework.game;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: "+ game.getClass().getSimpleName());
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
