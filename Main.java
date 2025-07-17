package com.atividade.me;
import com.atividade.me.Classes.Util.MenuPrincipal;
import com.badlogic.gdx.Game;
public class Main extends Game {

    @Override
    public void create() {
        setScreen(new MenuPrincipal(this)); 
    }

    @Override
    public void dispose() {
       
        if (getScreen() != null) {
            getScreen().dispose();
        }
    }

  
}

