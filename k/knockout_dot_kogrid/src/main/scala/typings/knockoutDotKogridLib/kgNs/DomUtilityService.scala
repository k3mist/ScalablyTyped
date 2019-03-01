package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomUtilityService extends js.Object {
  def BuildStyles(grid: Grid[_]): scala.Unit
  def UpdateGridLayout(grid: Grid[_]): scala.Unit
}

object DomUtilityService {
  @scala.inline
  def apply(
    BuildStyles: js.Function1[Grid[_], scala.Unit],
    UpdateGridLayout: js.Function1[Grid[_], scala.Unit]
  ): DomUtilityService = {
    val __obj = js.Dynamic.literal(BuildStyles = BuildStyles, UpdateGridLayout = UpdateGridLayout)
  
    __obj.asInstanceOf[DomUtilityService]
  }
}

