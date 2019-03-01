package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMonitoringOptions extends js.Object {
  var categoryFilter: java.lang.String
  var traceOptions: java.lang.String
}

object StartMonitoringOptions {
  @scala.inline
  def apply(categoryFilter: java.lang.String, traceOptions: java.lang.String): StartMonitoringOptions = {
    val __obj = js.Dynamic.literal(categoryFilter = categoryFilter, traceOptions = traceOptions)
  
    __obj.asInstanceOf[StartMonitoringOptions]
  }
}

