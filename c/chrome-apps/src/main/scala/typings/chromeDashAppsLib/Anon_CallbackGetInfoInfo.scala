package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackGetInfoInfo extends js.Object {
  /** Get physical memory information. */
  def getInfo(
    callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit]
  ): scala.Unit
}

object Anon_CallbackGetInfoInfo {
  @scala.inline
  def apply(
    getInfo: js.Function1[
      js.Function1[/* info */ chromeDashAppsLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit], 
      scala.Unit
    ]
  ): Anon_CallbackGetInfoInfo = {
    val __obj = js.Dynamic.literal(getInfo = getInfo)
  
    __obj.asInstanceOf[Anon_CallbackGetInfoInfo]
  }
}

