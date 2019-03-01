package typings
package signalsDotJsLib.libOrgOsflashSignalsEventsIBubbleEventHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBubbleEventHandler extends js.Object {
  /**
    * Handler for event bubbling.
    * It's left to the IBubbleEventHandler to decide what to do with the event.
    * @param    event The event that bubbled up.
    * @return whether to continue bubbling this event
    */
  def onEventBubbled(event: signalsDotJsLib.libOrgOsflashSignalsEventsIEventMod.IEvent): scala.Boolean
}

object IBubbleEventHandler {
  @scala.inline
  def apply(
    onEventBubbled: js.Function1[signalsDotJsLib.libOrgOsflashSignalsEventsIEventMod.IEvent, scala.Boolean]
  ): IBubbleEventHandler = {
    val __obj = js.Dynamic.literal(onEventBubbled = onEventBubbled)
  
    __obj.asInstanceOf[IBubbleEventHandler]
  }
}

