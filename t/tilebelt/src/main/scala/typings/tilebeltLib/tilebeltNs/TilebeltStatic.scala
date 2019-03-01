package typings
package tilebeltLib.tilebeltNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TilebeltStatic extends js.Object {
  /**
    * Get the smallest tile to cover a bbox
    *
    * @name bboxToTile
    * @param {Array<number>} bbox
    * @returns {Array<number>} tile
    * @example
    * var tile = bboxToTile([ -178, 84, -177, 85 ])
    * //=tile
    */
  def bboxToTile(bbox: js.Array[scala.Double]): js.Array[scala.Double]
  /**
    * Get the 4 tiles one zoom level higher
    *
    * @name getChildren
    * @param {Array<number>} tile
    * @returns {Array<Array<number>>} tiles
    * @example
    * var tiles = getChildren([5, 10, 10])
    * //=tiles
    */
  def getChildren(tile: js.Array[scala.Double]): js.Array[js.Array[scala.Double]]
  /**
    * Get the tile one zoom level lower
    *
    * @name getParent
    * @param {Array<number>} tile
    * @returns {Array<number>} tile
    * @example
    * var tile = getParent([5, 10, 10])
    * //=tile
    */
  def getParent(tile: js.Array[scala.Double]): js.Array[scala.Double]
  /**
    * Get the 3 sibling tiles for a tile
    *
    * @name getSiblings
    * @param {Array<number>} tile
    * @returns {Array<Array<number>>} tiles
    * @example
    * var tiles = getSiblings([5, 10, 10])
    * //=tiles
    */
  def getSiblings(tile: js.Array[scala.Double]): js.Array[js.Array[scala.Double]]
  /**
    * Check to see if an array of tiles contains a tiles siblings
    *
    * @name hasSiblings
    * @param {Array<number>} tile
    * @param {Array<Array<number>>} tiles
    * @returns {boolean}
    * @example
    * var tiles = [
    *     [0, 0, 5],
    *     [0, 1, 5],
    *     [1, 1, 5],
    *     [1, 0, 5]
    * ]
    * hasSiblings([0, 0, 5], tiles)
    * //=boolean
    */
  def hasSiblings(tile: js.Array[scala.Double], tiles: js.Array[js.Array[scala.Double]]): scala.Boolean
  /**
    * Check to see if an array of tiles contains a particular tile
    *
    * @name hasTile
    * @param {Array<Array<number>>} tiles
    * @param {Array<number>} tile
    * @returns {boolean}
    * @example
    * var tiles = [
    *     [0, 0, 5],
    *     [0, 1, 5],
    *     [1, 1, 5],
    *     [1, 0, 5]
    * ]
    * hasTile(tiles, [0, 0, 5])
    * //=boolean
    */
  def hasTile(tiles: js.Array[js.Array[scala.Double]], tile: js.Array[scala.Double]): scala.Boolean
  /**
    * Get the tile for a point at a specified zoom level
    *
    * @name pointToTile
    * @param {number} lon
    * @param {number} lat
    * @param {number} z
    * @returns {Array<number>} tile
    * @example
    * var tile = pointToTile(1, 1, 20)
    * //=tile
    */
  def pointToTile(lon: scala.Double, lat: scala.Double, z: scala.Double): js.Array[scala.Double]
  /**
    * Get the precise fractional tile location for a point at a zoom level
    *
    * @name pointToTileFraction
    * @param {number} lon
    * @param {number} lat
    * @param {number} z
    * @returns {Array<number>} tile fraction
    * var tile = pointToTileFraction(30.5, 50.5, 15)
    * //=tile
    */
  def pointToTileFraction(lon: scala.Double, lat: scala.Double, z: scala.Double): js.Array[scala.Double]
  /**
    * Get the tile for a quadkey
    *
    * @name quadkeyToTile
    * @param {string} quadkey
    * @returns {Array<number>} tile
    * @example
    * var tile = quadkeyToTile('00001033')
    * //=tile
    */
  def quadkeyToTile(quadkey: java.lang.String): js.Array[scala.Double]
  /**
    * Get the bbox of a tile
    *
    * @name tileToBBOX
    * @param {Array<number>} tile
    * @returns {Array<number>} bbox
    * @example
    * var bbox = tileToBBOX([5, 10, 10])
    * //=bbox
    */
  def tileToBBOX(tile: js.Array[scala.Double]): js.Array[scala.Double]
  /**
    * Get a geojson representation of a tile
    *
    * @name tileToGeoJSON
    * @param {Array<number>} tile
    * @returns {Feature<Polygon>}
    * @example
    * var poly = tileToGeoJSON([5, 10, 10])
    * //=poly
    */
  def tileToGeoJSON(tile: js.Array[scala.Double]): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Polygon, geojsonLib.geojsonMod.GeoJsonProperties]
  /**
    * Get the quadkey for a tile
    *
    * @name tileToQuadkey
    * @param {Array<number>} tile
    * @returns {string} quadkey
    * @example
    * var quadkey = tileToQuadkey([0, 1, 5])
    * //=quadkey
    */
  def tileToQuadkey(tile: js.Array[scala.Double]): java.lang.String
  /**
    * Check to see if two tiles are the same
    *
    * @name tilesEqual
    * @param {Array<number>} tile1
    * @param {Array<number>} tile2
    * @returns {boolean}
    * @example
    * tilesEqual([0, 1, 5], [0, 0, 5])
    * //=boolean
    */
  def tilesEqual(tile1: js.Array[scala.Double], tile2: js.Array[scala.Double]): scala.Boolean
}

object TilebeltStatic {
  @scala.inline
  def apply(
    bboxToTile: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    getChildren: js.Function1[js.Array[scala.Double], js.Array[js.Array[scala.Double]]],
    getParent: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    getSiblings: js.Function1[js.Array[scala.Double], js.Array[js.Array[scala.Double]]],
    hasSiblings: js.Function2[js.Array[scala.Double], js.Array[js.Array[scala.Double]], scala.Boolean],
    hasTile: js.Function2[js.Array[js.Array[scala.Double]], js.Array[scala.Double], scala.Boolean],
    pointToTile: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[scala.Double]],
    pointToTileFraction: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[scala.Double]],
    quadkeyToTile: js.Function1[java.lang.String, js.Array[scala.Double]],
    tileToBBOX: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    tileToGeoJSON: js.Function1[
      js.Array[scala.Double], 
      geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Polygon, geojsonLib.geojsonMod.GeoJsonProperties]
    ],
    tileToQuadkey: js.Function1[js.Array[scala.Double], java.lang.String],
    tilesEqual: js.Function2[js.Array[scala.Double], js.Array[scala.Double], scala.Boolean]
  ): TilebeltStatic = {
    val __obj = js.Dynamic.literal(bboxToTile = bboxToTile, getChildren = getChildren, getParent = getParent, getSiblings = getSiblings, hasSiblings = hasSiblings, hasTile = hasTile, pointToTile = pointToTile, pointToTileFraction = pointToTileFraction, quadkeyToTile = quadkeyToTile, tileToBBOX = tileToBBOX, tileToGeoJSON = tileToGeoJSON, tileToQuadkey = tileToQuadkey, tilesEqual = tilesEqual)
  
    __obj.asInstanceOf[TilebeltStatic]
  }
}

