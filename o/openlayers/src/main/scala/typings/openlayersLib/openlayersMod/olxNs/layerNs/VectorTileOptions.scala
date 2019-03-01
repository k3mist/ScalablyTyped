package typings
package openlayersLib.openlayersMod.olxNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileOptions extends js.Object {
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var map: js.UndefOr[openlayersLib.openlayersMod.Map] = js.undefined
  var maxResolution: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var renderBuffer: js.UndefOr[scala.Double] = js.undefined
  var renderMode: js.UndefOr[openlayersLib.openlayersMod.layerNs.VectorTileRenderType | java.lang.String] = js.undefined
  var renderOrder: js.UndefOr[
    js.Function2[
      /* feature1 */ openlayersLib.openlayersMod.Feature, 
      /* feature2 */ openlayersLib.openlayersMod.Feature, 
      scala.Double
    ]
  ] = js.undefined
  var source: js.UndefOr[openlayersLib.openlayersMod.sourceNs.VectorTile] = js.undefined
  var style: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var updateWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined
  var updateWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object VectorTileOptions {
  @scala.inline
  def apply(
    extent: openlayersLib.openlayersMod.Extent = null,
    map: openlayersLib.openlayersMod.Map = null,
    maxResolution: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    renderBuffer: scala.Int | scala.Double = null,
    renderMode: openlayersLib.openlayersMod.layerNs.VectorTileRenderType | java.lang.String = null,
    renderOrder: js.Function2[
      /* feature1 */ openlayersLib.openlayersMod.Feature, 
      /* feature2 */ openlayersLib.openlayersMod.Feature, 
      scala.Double
    ] = null,
    source: openlayersLib.openlayersMod.sourceNs.VectorTile = null,
    style: openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction = null,
    updateWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined,
    updateWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): VectorTileOptions = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (renderBuffer != null) __obj.updateDynamic("renderBuffer")(renderBuffer.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (renderOrder != null) __obj.updateDynamic("renderOrder")(renderOrder)
    if (source != null) __obj.updateDynamic("source")(source)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhileAnimating)) __obj.updateDynamic("updateWhileAnimating")(updateWhileAnimating)
    if (!js.isUndefined(updateWhileInteracting)) __obj.updateDynamic("updateWhileInteracting")(updateWhileInteracting)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileOptions]
  }
}

