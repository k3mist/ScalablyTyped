package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groupname extends js.Object {
  var group_name: java.lang.String
  var image: Anon_HeightIsStored
  var location: Anon_Altitude
  var timestamp: scala.Double
  var `type`: java.lang.String
}

object Anon_Groupname {
  @scala.inline
  def apply(
    group_name: java.lang.String,
    image: Anon_HeightIsStored,
    location: Anon_Altitude,
    timestamp: scala.Double,
    `type`: java.lang.String
  ): Anon_Groupname = {
    val __obj = js.Dynamic.literal(group_name = group_name, image = image, location = location, timestamp = timestamp, `type` = `type`)
  
    __obj.asInstanceOf[Anon_Groupname]
  }
}

