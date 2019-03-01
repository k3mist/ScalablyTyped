package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compact extends js.Object {
  /**
    * When the AppBar is closed, its height is reduced such that button commands are still visible, but their labels are hidden.
    **/
  var compact: java.lang.String
  /**
    * When the AppBar is closed, its height is always sized to content.
    **/
  var full: java.lang.String
  /**
    * When the AppBar is closed, its height is reduced to the minimal height required to display only its overflowbutton. All other content in the AppBar is not displayed.
    **/
  var minimal: java.lang.String
  /**
    * When the AppBar is closed, it is not visible and doesn't take up any space.
    **/
  var none: java.lang.String
}

object Anon_Compact {
  @scala.inline
  def apply(
    compact: java.lang.String,
    full: java.lang.String,
    minimal: java.lang.String,
    none: java.lang.String
  ): Anon_Compact = {
    val __obj = js.Dynamic.literal(compact = compact, full = full, minimal = minimal, none = none)
  
    __obj.asInstanceOf[Anon_Compact]
  }
}

