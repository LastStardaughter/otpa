package otpa.screens;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import otpa.Otpa;

public class TravelScreen implements Screen {

	final Otpa game;
	OrthographicCamera camera;
	float partialDay=0;
	int day=1, dist=0;
	Random rand=new Random();
	String eventString="Day 1";
	
	public TravelScreen(final Otpa game) {
		this.game = game;

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1280, 720);
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	    camera.update();
		game.batch.setProjectionMatrix(camera.combined);
		
		partialDay+=(delta/0.4f);
		if(partialDay>=1.0f) {
			day++;
			partialDay-=1.0f;
			dist+=18;
			if(rand.nextInt(13)>8) {
				eventString="Random event at " + rand.nextInt(24) + ":00";
			} else { eventString="Nothing happens";}
		}
		
		StringBuilder text=new StringBuilder(100);
		text.append("Day ");
		text.append(day);
		text.append("\n");
		text.append((int) Math.floor(partialDay*24.0));
		text.append(":00\nDistance: ");
		text.append(dist);
		text.append(" mi");
		String str=text.toString();		

		game.batch.begin();
		game.font.draw(game.batch, str, 100, 150);
		game.font.draw(game.batch, eventString, 640, 360);
		game.batch.end();

		if (Gdx.input.isKeyJustPressed(Keys.ESCAPE)) {
			game.setScreen(new PauseScreen(game, this));
			dispose();
		}

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

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
