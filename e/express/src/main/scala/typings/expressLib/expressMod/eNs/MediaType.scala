package typings
package expressLib.expressMod.eNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.MediaType

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

