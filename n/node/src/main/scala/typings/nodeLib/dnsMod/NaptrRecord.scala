package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NaptrRecord extends js.Object {
  var flags: java.lang.String
  var order: scala.Double
  var preference: scala.Double
  var regexp: java.lang.String
  var replacement: java.lang.String
  var service: java.lang.String
}

object NaptrRecord {
  @scala.inline
  def apply(
    flags: java.lang.String,
    order: scala.Double,
    preference: scala.Double,
    regexp: java.lang.String,
    replacement: java.lang.String,
    service: java.lang.String
  ): NaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags, order = order, preference = preference, regexp = regexp, replacement = replacement, service = service)
  
    __obj.asInstanceOf[NaptrRecord]
  }
}

