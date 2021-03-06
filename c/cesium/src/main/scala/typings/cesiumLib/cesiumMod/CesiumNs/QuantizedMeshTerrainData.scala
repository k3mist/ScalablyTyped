package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantizedMeshTerrainData extends js.Object {
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
  ): js.Promise[QuantizedMeshTerrainData]
  def wasCreatedByUpsampling(): scala.Boolean
}

object QuantizedMeshTerrainData {
  @scala.inline
  def apply(
    createMesh: (TilingScheme, scala.Double, scala.Double, scala.Double) => js.Promise[TerrainMesh],
    interpolateHeight: (Rectangle, scala.Double, scala.Double) => scala.Double,
    isChildAvailable: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Boolean,
    upsample: (TilingScheme, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => js.Promise[QuantizedMeshTerrainData],
    wasCreatedByUpsampling: () => scala.Boolean,
    waterMask: stdLib.Uint8Array | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement
  ): QuantizedMeshTerrainData = {
    val __obj = js.Dynamic.literal(createMesh = js.Any.fromFunction4(createMesh), interpolateHeight = js.Any.fromFunction3(interpolateHeight), isChildAvailable = js.Any.fromFunction4(isChildAvailable), upsample = js.Any.fromFunction7(upsample), wasCreatedByUpsampling = js.Any.fromFunction0(wasCreatedByUpsampling), waterMask = waterMask.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QuantizedMeshTerrainData]
  }
}

