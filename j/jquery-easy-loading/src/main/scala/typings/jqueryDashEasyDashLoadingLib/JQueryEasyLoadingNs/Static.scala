package typings
package jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  /**
    * Extend the Loading plugin default settings with the user options
    * Use it as `$.Loading.setDefaults({ ... })`
    *
    * @param {Object} options Custom options to override the plugin defaults
    */
  def setDefaults(options: Options): scala.Unit
}

object Static {
  @scala.inline
  def apply(setDefaults: js.Function1[Options, scala.Unit]): Static = {
    val __obj = js.Dynamic.literal(setDefaults = setDefaults)
  
    __obj.asInstanceOf[Static]
  }
}

