package typings
package osmtogeojsonLib.osmtogeojsonMod.OsmJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var ref: scala.Double
  var role: java.lang.String
  var `type`: java.lang.String
}

object Member {
  @scala.inline
  def apply(ref: scala.Double, role: java.lang.String, `type`: java.lang.String): Member = {
    val __obj = js.Dynamic.literal(ref = ref, role = role, `type` = `type`)
  
    __obj.asInstanceOf[Member]
  }
}

