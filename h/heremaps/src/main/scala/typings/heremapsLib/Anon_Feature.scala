package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Feature extends js.Object {
  var feature: js.Array[_]
  var trafficMode: java.lang.String
  var transportModes: js.Array[java.lang.String]
  var `type`: java.lang.String
}

object Anon_Feature {
  @scala.inline
  def apply(
    feature: js.Array[_],
    trafficMode: java.lang.String,
    transportModes: js.Array[java.lang.String],
    `type`: java.lang.String
  ): Anon_Feature = {
    val __obj = js.Dynamic.literal(feature = feature, trafficMode = trafficMode, transportModes = transportModes, `type` = `type`)
  
    __obj.asInstanceOf[Anon_Feature]
  }
}

