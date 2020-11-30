package otpa.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

import otpa.Otpa;

public class PauseScreen implements Screen {

	final Otpa game;
	OrthographicCamera camera;
	Screen previous;
	
	public PauseScreen(final Otpa game, Screen previous) {
		this.game = game;
		this.previous=previous;

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1280, 720);
		
	}
	
	
	@Override
	public void render(float delta) {
	    Gdx.gl.glClearColor(0, 0, 0, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.update();
		game.batch.setProjectionMatrix(camera.combined);

		game.batch.begin();
		game.font.draw(game.batch, "Pause Screen ", 100, 150);
		game.font.draw(game.batch, "Press ESC to return", 100, 100);
		game.batch.end();

		if (Gdx.input.isKeyJustPressed(Keys.ESCAPE)) {
			game.setScreen(previous);
			dispose();
		}

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

}
