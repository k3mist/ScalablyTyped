package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaData extends js.Object {
  var description: java.lang.String
  var id: java.lang.String
  var links: js.Array[PanoramaLink]
  var position: Point
  var tiles: PanoramaTileData
}

object PanoramaData {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    links: js.Array[PanoramaLink],
    position: Point,
    tiles: PanoramaTileData
  ): PanoramaData = {
    val __obj = js.Dynamic.literal(description = description, id = id, links = links, position = position, tiles = tiles)
  
    __obj.asInstanceOf[PanoramaData]
  }
}

