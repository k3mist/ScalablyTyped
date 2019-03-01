package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProperties extends js.Object {
  // Minimum height of the row. The row will be rendered in the Slides editor at
  // a height equal to or greater than this value in order to show all the text
  // in the row's cell(s).
  var min_row_height: Dimension
}

object TableRowProperties {
  @scala.inline
  def apply(min_row_height: Dimension): TableRowProperties = {
    val __obj = js.Dynamic.literal(min_row_height = min_row_height)
  
    __obj.asInstanceOf[TableRowProperties]
  }
}

