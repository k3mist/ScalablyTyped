package typings
package tgfancyLib.tgfancyMod.TgfancyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedGroupOrChannel extends ResolvedChat {
  var title: java.lang.String
}

object ResolvedGroupOrChannel {
  @scala.inline
  def apply(
    id: scala.Double | java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    username: java.lang.String,
    when: java.lang.String
  ): ResolvedGroupOrChannel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title, `type` = `type`, username = username, when = when)
  
    __obj.asInstanceOf[ResolvedGroupOrChannel]
  }
}

