package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowJoin extends js.Object {
  var data: plugapiLib.plugapiMod.PlugAPINs.FollowJoinData
  var `type`: java.lang.String
}

object FollowJoin {
  @scala.inline
  def apply(data: plugapiLib.plugapiMod.PlugAPINs.FollowJoinData, `type`: java.lang.String): FollowJoin = {
    val __obj = js.Dynamic.literal(data = data, `type` = `type`)
  
    __obj.asInstanceOf[FollowJoin]
  }
}

