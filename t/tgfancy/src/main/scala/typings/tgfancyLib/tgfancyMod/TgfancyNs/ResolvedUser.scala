package typings
package tgfancyLib.tgfancyMod.TgfancyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedUser extends ResolvedChat {
  var first_name: java.lang.String
  var last_name: js.UndefOr[java.lang.String] = js.undefined
}

object ResolvedUser {
  @scala.inline
  def apply(
    first_name: java.lang.String,
    id: scala.Double | java.lang.String,
    `type`: java.lang.String,
    username: java.lang.String,
    when: java.lang.String,
    last_name: java.lang.String = null
  ): ResolvedUser = {
    val __obj = js.Dynamic.literal(first_name = first_name, id = id.asInstanceOf[js.Any], `type` = `type`, username = username, when = when)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    __obj.asInstanceOf[ResolvedUser]
  }
}

