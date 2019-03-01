package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutProperties extends js.Object {
  // The human-readable name of the layout.
  var display_name: java.lang.String
  // The object ID of the master that this layout is based on.
  var master_object_id: java.lang.String
  // The name of the layout.
  var name: java.lang.String
}

object LayoutProperties {
  @scala.inline
  def apply(display_name: java.lang.String, master_object_id: java.lang.String, name: java.lang.String): LayoutProperties = {
    val __obj = js.Dynamic.literal(display_name = display_name, master_object_id = master_object_id, name = name)
  
    __obj.asInstanceOf[LayoutProperties]
  }
}

