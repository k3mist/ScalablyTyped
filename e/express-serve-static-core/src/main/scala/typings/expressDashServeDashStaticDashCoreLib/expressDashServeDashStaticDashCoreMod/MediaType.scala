package typings
package expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var quality: scala.Double
  var subtype: java.lang.String
  var `type`: java.lang.String
  var value: java.lang.String
}

object MediaType {
  @scala.inline
  def apply(
    quality: scala.Double,
    subtype: java.lang.String,
    `type`: java.lang.String,
    value: java.lang.String
  ): MediaType = {
    val __obj = js.Dynamic.literal(quality = quality, subtype = subtype, `type` = `type`, value = value)
  
    __obj.asInstanceOf[MediaType]
  }
}

