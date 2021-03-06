package typings
package atOracleOraclejetLib.ojprogresslistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressItem extends js.Object {
  def addEventListener(
    eventType: atOracleOraclejetLib.ojprogresslistMod.ProgressItemNs.EventType,
    listener: stdLib.EventListener
  ): scala.Unit
  def removeEventListener(
    eventType: atOracleOraclejetLib.ojprogresslistMod.ProgressItemNs.EventType,
    listener: stdLib.EventListener
  ): scala.Unit
}

object ProgressItem {
  @scala.inline
  def apply(
    addEventListener: (atOracleOraclejetLib.ojprogresslistMod.ProgressItemNs.EventType, stdLib.EventListener) => scala.Unit,
    removeEventListener: (atOracleOraclejetLib.ojprogresslistMod.ProgressItemNs.EventType, stdLib.EventListener) => scala.Unit
  ): ProgressItem = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[ProgressItem]
  }
}

