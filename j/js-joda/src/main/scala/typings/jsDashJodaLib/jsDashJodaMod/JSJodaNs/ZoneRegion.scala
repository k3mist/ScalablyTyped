package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneRegion extends ZoneId

object ZoneRegion {
  @scala.inline
  def apply(
    equals: js.Any => scala.Boolean,
    hashCode: () => scala.Double,
    id: () => java.lang.String,
    normalized: () => ZoneId,
    rules: () => ZoneRules,
    toString: () => java.lang.String
  ): ZoneRegion = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), hashCode = js.Any.fromFunction0(hashCode), id = js.Any.fromFunction0(id), normalized = js.Any.fromFunction0(normalized), rules = js.Any.fromFunction0(rules), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ZoneRegion]
  }
}

