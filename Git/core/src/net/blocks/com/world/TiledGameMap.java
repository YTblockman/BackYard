package net.blocks.com.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class TiledGameMap extends GameMap {

	TiledMap mp;
	OrthogonalTiledMapRenderer r;
	
	public TiledGameMap() {
		mp = new TmxMapLoader().load("map.tmx");
		r = new OrthogonalTiledMapRenderer(mp);
	}
	
	
	@Override
	public void render(OrthographicCamera c) {
		r.setView(c);
		r.render();
	}

	@Override
	public void update(float d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		mp.dispose();
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLayers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TileType getTileTypeByCoordinate(int layer, int col, int row) {
		// TODO Auto-generated method stub
		return null;
	}

}
