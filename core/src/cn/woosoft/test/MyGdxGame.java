package cn.woosoft.test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	AssetManager am;
	@Override
	public void create () {
		batch = new SpriteBatch();
		am=new AssetManager();
		am.load("badlogic.jpg",Texture.class);


	}

	@Override
	public void render () {
		am.update();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		if(am.getProgress()==1){
			img = new Texture("badlogic.jpg");
			batch.draw(img, 100, 100);
		}else{
			System.out.print("p=>"+am.getProgress());
		}

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
