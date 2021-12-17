package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Background bg;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		bg = new Background();
	}

	@Override
	public void render () {
		update();
		ScreenUtils.clear(1, 1, 1, 1.5f);
		batch.begin();
		bg.render(batch);
		batch.end();
	}

	public void update(){
		bg.update();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
