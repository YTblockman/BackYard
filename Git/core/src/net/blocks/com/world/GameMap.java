package net.blocks.com.world;

import com.badlogic.gdx.graphics.OrthographicCamera;

public abstract class GameMap {

	public abstract void render(OrthographicCamera c);
	public abstract void update (float d);
	public abstract void dispose ();
	
	public abstract int getWidth();
	public abstract int getHeight();
	public abstract int getLayers();
	/**
	 * Gets tile by position [pixels] in specified layer
	 * @param layer
	 * @param x
	 * @param y
	 * @return
	 */
	public TileType getTileTypeByLocation(int layer, float x, float y) {
		return this.getTileTypeByCoordinate(layer, (int) (x / TileType.TILE_SIZE), (int) (y / TileType.TILE_SIZE));
	}
	
	/**
	 * Gets tile in specified layer, col, row
	 * @param layer
	 * @param col
	 * @param row
	 * @return
	 */
	public abstract TileType getTileTypeByCoordinate(int layer, int col, int row);


}
