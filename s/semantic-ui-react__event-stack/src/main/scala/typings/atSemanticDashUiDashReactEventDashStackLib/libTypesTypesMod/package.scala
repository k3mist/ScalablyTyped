package typings
package atSemanticDashUiDashReactEventDashStackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  type CallableEventListener = stdLib.EventListener with atSemanticDashUiDashReactEventDashStackLib.Anon_Called
  type EventListeners = js.Array[CallableEventListener]
  type GenericMap[T] = stdLib.Map[nodeLib.String, T]
  type InputEventListener = stdLib.EventListener | js.Array[stdLib.EventListener]
  type InputTargetElement = scala.Boolean | java.lang.String | TargetElement
  type TargetElement = reactLib.Document | reactLib.HTMLElement | stdLib.Window
}
