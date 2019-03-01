package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object with the confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
  */
trait ConfirmResult extends js.Object {
  /**
    * true if the confirm button was clicked to close the dialog.
    */
  var confirmed: scala.Boolean
}

object ConfirmResult {
  @scala.inline
  def apply(confirmed: scala.Boolean): ConfirmResult = {
    val __obj = js.Dynamic.literal(confirmed = confirmed)
  
    __obj.asInstanceOf[ConfirmResult]
  }
}

