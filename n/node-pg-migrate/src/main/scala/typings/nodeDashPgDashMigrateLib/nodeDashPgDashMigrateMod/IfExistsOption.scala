package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfExistsOption extends js.Object {
  var ifExists: js.UndefOr[scala.Boolean] = js.undefined
}

object IfExistsOption {
  @scala.inline
  def apply(ifExists: js.UndefOr[scala.Boolean] = js.undefined): IfExistsOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists)
    __obj.asInstanceOf[IfExistsOption]
  }
}

