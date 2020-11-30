package otpa;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import otpa.screens.*;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Otpa extends Game {
	
	public SpriteBatch batch;
	public BitmapFont font;
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		//Use LibGDX's default Arial font.
		font = new BitmapFont();
		this.setScreen(new TitleScreen(this));
	}

	public void render() {
		super.render();
	}

	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}