package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Window.get().on('navigation') callback policy argument object
  */
trait WinNavigationPolicy extends js.Object {
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): scala.Unit
}

object WinNavigationPolicy {
  @scala.inline
  def apply(ignore: () => scala.Unit): WinNavigationPolicy = {
    val __obj = js.Dynamic.literal(ignore = js.Any.fromFunction0(ignore))
  
    __obj.asInstanceOf[WinNavigationPolicy]
  }
}

