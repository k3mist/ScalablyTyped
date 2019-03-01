package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the visibility state of a property.
  * @since OOo 2.0
  */
trait Visibility extends js.Object {
  /** `TRUE` if the property is visible otherwise `FALSE` . */
  var bVisible: scala.Boolean
}

object Visibility {
  @scala.inline
  def apply(bVisible: scala.Boolean): Visibility = {
    val __obj = js.Dynamic.literal(bVisible = bVisible)
  
    __obj.asInstanceOf[Visibility]
  }
}

