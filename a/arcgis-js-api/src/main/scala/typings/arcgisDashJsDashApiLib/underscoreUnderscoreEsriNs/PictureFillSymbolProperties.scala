package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureFillSymbolProperties extends FillSymbolProperties {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#height)
    *
    * @default 12
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#width)
    *
    * @default 12
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The scale factor on the x axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xscale)
    *
    * @default 1
    */
  var xscale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The offset on the y-axis in pixels or points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The scale factor on the y axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yscale)
    *
    * @default 1
    */
  var yscale: js.UndefOr[scala.Double] = js.undefined
}

object PictureFillSymbolProperties {
  @scala.inline
  def apply(
    color: Color | js.Array[scala.Double] | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    outline: SimpleLineSymbolProperties = null,
    url: java.lang.String = null,
    width: scala.Double | java.lang.String = null,
    xoffset: scala.Double | java.lang.String = null,
    xscale: scala.Int | scala.Double = null,
    yoffset: scala.Double | java.lang.String = null,
    yscale: scala.Int | scala.Double = null
  ): PictureFillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (xscale != null) __obj.updateDynamic("xscale")(xscale.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    if (yscale != null) __obj.updateDynamic("yscale")(yscale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFillSymbolProperties]
  }
}

