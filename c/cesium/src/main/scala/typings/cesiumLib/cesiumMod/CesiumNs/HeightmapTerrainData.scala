package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightmapTerrainData extends js.Object {
  var waterMask: stdLib.Uint8Array | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement
  def createMesh(tilingScheme: TilingScheme, x: scala.Double, y: scala.Double, level: scala.Double): js.Promise[TerrainMesh]
  def interpolateHeight(rectangle: Rectangle, longitude: scala.Double, latitude: scala.Double): scala.Double
  def isChildAvailable(thisX: scala.Double, thisY: scala.Double, childX: scala.Double, childY: scala.Double): scala.Boolean
  def upsample(
    tilingScheme: TilingScheme,
    thisX: scala.Double,
    thisY: scala.Double,
    thisLevel: scala.Double,
    descendantX: scala.Double,
    descendantY: scala.Double,
    descendantLevel: scala.Double
  ): js.Promise[HeightmapTerrainData]
  def wasCreatedByUpsampling(): scala.Boolean
}

object HeightmapTerrainData {
  @scala.inline
  def apply(
    createMesh: js.Function4[TilingScheme, scala.Double, scala.Double, scala.Double, js.Promise[TerrainMesh]],
    interpolateHeight: js.Function3[Rectangle, scala.Double, scala.Double, scala.Double],
    isChildAvailable: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Boolean],
    upsample: js.Function7[
      TilingScheme, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Promise[HeightmapTerrainData]
    ],
    wasCreatedByUpsampling: js.Function0[scala.Boolean],
    waterMask: stdLib.Uint8Array | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement
  ): HeightmapTerrainData = {
    val __obj = js.Dynamic.literal(createMesh = createMesh, interpolateHeight = interpolateHeight, isChildAvailable = isChildAvailable, upsample = upsample, wasCreatedByUpsampling = wasCreatedByUpsampling, waterMask = waterMask.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeightmapTerrainData]
  }
}

