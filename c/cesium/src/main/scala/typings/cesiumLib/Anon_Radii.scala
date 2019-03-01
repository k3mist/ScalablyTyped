package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Radii extends js.Object {
  var radii: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.undefined
  var slicePartitions: js.UndefOr[scala.Double] = js.undefined
  var stackPartitions: js.UndefOr[scala.Double] = js.undefined
  var vertexFormat: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.VertexFormat] = js.undefined
}

object Anon_Radii {
  @scala.inline
  def apply(
    radii: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = null,
    slicePartitions: scala.Int | scala.Double = null,
    stackPartitions: scala.Int | scala.Double = null,
    vertexFormat: cesiumLib.cesiumMod.CesiumNs.VertexFormat = null
  ): Anon_Radii = {
    val __obj = js.Dynamic.literal()
    if (radii != null) __obj.updateDynamic("radii")(radii)
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions.asInstanceOf[js.Any])
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_Radii]
  }
}

