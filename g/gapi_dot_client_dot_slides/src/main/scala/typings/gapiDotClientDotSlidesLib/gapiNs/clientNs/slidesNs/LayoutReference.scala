package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutReference extends js.Object {
  /** Layout ID: the object ID of one of the layouts in the presentation. */
  var layoutId: js.UndefOr[java.lang.String] = js.undefined
  /** Predefined layout. */
  var predefinedLayout: js.UndefOr[java.lang.String] = js.undefined
}

object LayoutReference {
  @scala.inline
  def apply(layoutId: java.lang.String = null, predefinedLayout: java.lang.String = null): LayoutReference = {
    val __obj = js.Dynamic.literal()
    if (layoutId != null) __obj.updateDynamic("layoutId")(layoutId)
    if (predefinedLayout != null) __obj.updateDynamic("predefinedLayout")(predefinedLayout)
    __obj.asInstanceOf[LayoutReference]
  }
}

