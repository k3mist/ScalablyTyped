package typings
package jqueryDotSimplemodalLib.SimpleModalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sent to callbacks as a parameter. */
trait SimpleModalDialog extends js.Object {
  var container: jqueryDotSimplemodalLib.JQuery
  var data: js.Any
  var iframe: jqueryDotSimplemodalLib.JQuery
  var overlay: jqueryDotSimplemodalLib.JQuery
}

object SimpleModalDialog {
  @scala.inline
  def apply(
    container: jqueryDotSimplemodalLib.JQuery,
    data: js.Any,
    iframe: jqueryDotSimplemodalLib.JQuery,
    overlay: jqueryDotSimplemodalLib.JQuery
  ): SimpleModalDialog = {
    val __obj = js.Dynamic.literal(container = container, data = data, iframe = iframe, overlay = overlay)
  
    __obj.asInstanceOf[SimpleModalDialog]
  }
}

