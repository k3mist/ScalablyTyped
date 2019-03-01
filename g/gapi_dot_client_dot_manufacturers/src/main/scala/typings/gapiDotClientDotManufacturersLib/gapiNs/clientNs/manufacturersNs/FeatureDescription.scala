package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureDescription extends js.Object {
  /** A short description of the feature. */
  var headline: js.UndefOr[java.lang.String] = js.undefined
  /** An optional image describing the feature. */
  var image: js.UndefOr[Image] = js.undefined
  /** A detailed description of the feature. */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object FeatureDescription {
  @scala.inline
  def apply(headline: java.lang.String = null, image: Image = null, text: java.lang.String = null): FeatureDescription = {
    val __obj = js.Dynamic.literal()
    if (headline != null) __obj.updateDynamic("headline")(headline)
    if (image != null) __obj.updateDynamic("image")(image)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[FeatureDescription]
  }
}

