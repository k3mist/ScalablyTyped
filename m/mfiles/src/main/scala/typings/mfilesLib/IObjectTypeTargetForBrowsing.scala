package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeTargetForBrowsing extends js.Object {
  var TargetObjectType: scala.Double
  var ViewCollection: scala.Double
  def Clone(): IObjectTypeTargetForBrowsing
}

object IObjectTypeTargetForBrowsing {
  @scala.inline
  def apply(
    Clone: () => IObjectTypeTargetForBrowsing,
    TargetObjectType: scala.Double,
    ViewCollection: scala.Double
  ): IObjectTypeTargetForBrowsing = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), TargetObjectType = TargetObjectType, ViewCollection = ViewCollection)
  
    __obj.asInstanceOf[IObjectTypeTargetForBrowsing]
  }
}

