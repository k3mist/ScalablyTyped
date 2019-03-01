package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticPermissions extends js.Object {
  var CanDeactivate: scala.Boolean
  val IsBasedOnObjectACL: scala.Boolean
  val IsDefault: scala.Boolean
  val NamedACL: INamedACL
  def Clone(): IAutomaticPermissions
  def SetBasedOnObjectACL(): scala.Unit
  def SetNamedACL(NamedACL: INamedACL): scala.Unit
}

object IAutomaticPermissions {
  @scala.inline
  def apply(
    CanDeactivate: scala.Boolean,
    Clone: js.Function0[IAutomaticPermissions],
    IsBasedOnObjectACL: scala.Boolean,
    IsDefault: scala.Boolean,
    NamedACL: INamedACL,
    SetBasedOnObjectACL: js.Function0[scala.Unit],
    SetNamedACL: js.Function1[INamedACL, scala.Unit]
  ): IAutomaticPermissions = {
    val __obj = js.Dynamic.literal(CanDeactivate = CanDeactivate, Clone = Clone, IsBasedOnObjectACL = IsBasedOnObjectACL, IsDefault = IsDefault, NamedACL = NamedACL, SetBasedOnObjectACL = SetBasedOnObjectACL, SetNamedACL = SetNamedACL)
  
    __obj.asInstanceOf[IAutomaticPermissions]
  }
}

