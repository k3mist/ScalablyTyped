package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends MediaMediaProperties {
  /**
    * Refresh interval of the layer in minutes. Non-zero value indicates automatic layer refresh at the specified interval. Value of `0` indicates auto refresh is not enabled. If the property does not exist, it is equivalent to having a value of `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Image.html#refreshInterval)
    */
  var refreshInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the value format of the image media element and how the images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Image.html#value)
    */
  var value: js.UndefOr[ImageValueProperties] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    refreshInterval: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    value: ImageValueProperties = null
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ImageProperties]
  }
}

