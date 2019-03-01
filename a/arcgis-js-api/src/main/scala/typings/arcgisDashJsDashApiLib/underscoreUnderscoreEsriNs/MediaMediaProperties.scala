package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaMediaProperties extends js.Object {
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Media.html#caption)
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Media.html#title)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MediaMediaProperties {
  @scala.inline
  def apply(caption: java.lang.String = null, title: java.lang.String = null): MediaMediaProperties = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MediaMediaProperties]
  }
}

