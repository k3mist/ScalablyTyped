package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.Array[_]
  var autoDectect: scala.Boolean
  var menus: js.Array[_]
  var show: scala.Boolean
  var `type`: java.lang.String
}

object Anon_Actions {
  @scala.inline
  def apply(
    actions: js.Array[_],
    autoDectect: scala.Boolean,
    menus: js.Array[_],
    show: scala.Boolean,
    `type`: java.lang.String
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal(actions = actions, autoDectect = autoDectect, menus = menus, show = show, `type` = `type`)
  
    __obj.asInstanceOf[Anon_Actions]
  }
}

