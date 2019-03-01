package typings
package jqueryDotMenuaimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /** Dropdown menus that can differentiate between a user trying hover over a dropdown item vs trying to navigate into a submenu's contents.
    * @author Ben Kamens
    * https://github.com/kamens/jQuery-menu-aim
    */
  def menuAim(options: JQueryMenuAimOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(menuAim: js.Function1[JQueryMenuAimOptions, JQuery]): JQuery = {
    val __obj = js.Dynamic.literal(menuAim = menuAim)
  
    __obj.asInstanceOf[JQuery]
  }
}

