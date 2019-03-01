package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser extends js.Object {
  var browser: Anon_Edge
  var devicePixelRatio: scala.Double
  var hasHW3D: scala.Boolean
  var hasNativeScrolling: scala.Boolean
  var mobileOS: Anon_AppMode
  var placeholder: scala.Boolean
  var pointers: scala.Boolean
  var touch: scala.Boolean
  var zoomLevel: scala.Double
  def scrollbar(): scala.Double
}

object Anon_Browser {
  @scala.inline
  def apply(
    browser: Anon_Edge,
    devicePixelRatio: scala.Double,
    hasHW3D: scala.Boolean,
    hasNativeScrolling: scala.Boolean,
    mobileOS: Anon_AppMode,
    placeholder: scala.Boolean,
    pointers: scala.Boolean,
    scrollbar: js.Function0[scala.Double],
    touch: scala.Boolean,
    zoomLevel: scala.Double
  ): Anon_Browser = {
    val __obj = js.Dynamic.literal(browser = browser, devicePixelRatio = devicePixelRatio, hasHW3D = hasHW3D, hasNativeScrolling = hasNativeScrolling, mobileOS = mobileOS, placeholder = placeholder, pointers = pointers, scrollbar = scrollbar, touch = touch, zoomLevel = zoomLevel)
  
    __obj.asInstanceOf[Anon_Browser]
  }
}

