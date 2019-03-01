package typings
package dbDashMigrateDashPgLib.dbDashMigrateDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConstraint extends js.Object {
  var constraints: java.lang.String
  def foreignKey(callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction): scala.Unit
}

object ColumnConstraint {
  @scala.inline
  def apply(
    constraints: java.lang.String,
    foreignKey: js.Function1[dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction, scala.Unit]
  ): ColumnConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints, foreignKey = foreignKey)
  
    __obj.asInstanceOf[ColumnConstraint]
  }
}

