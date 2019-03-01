package typings
package pebblekitjsLib.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The structure of an app glance.
  */
trait AppGlanceSlice extends js.Object {
  var expirationTime: js.UndefOr[java.lang.String] = js.undefined
  var layout: Layout
}

object AppGlanceSlice {
  @scala.inline
  def apply(layout: Layout, expirationTime: java.lang.String = null): AppGlanceSlice = {
    val __obj = js.Dynamic.literal(layout = layout)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    __obj.asInstanceOf[AppGlanceSlice]
  }
}

