package otpa.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

import otpa.Otpa;

public class TitleScreen implements Screen {

	final Otpa game;
	OrthographicCamera camera;
	
	public TitleScreen(final Otpa game) {
		this.game = game;

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
		game.font.draw(game.batch, "Title Screen ", 100, 150);
		game.font.draw(game.batch, "Click or press a key to begin", 100, 100);
		game.batch.end();

		if (Gdx.input.isTouched() || Gdx.input.isKeyPressed(Keys.ANY_KEY)) {
			game.setScreen(new TravelScreen(game));
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
