package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionNode extends TypeDerived {
  var incomingConversationLinks: js.Array[ConversationLink]
  var outgoingConversationLinks: js.Array[ConversationLink]
}

object InteractionNode {
  @scala.inline
  def apply(
    $type: ElementType,
    incomingConversationLinks: js.Array[ConversationLink],
    outgoingConversationLinks: js.Array[ConversationLink]
  ): InteractionNode = {
    val __obj = js.Dynamic.literal($type = $type, incomingConversationLinks = incomingConversationLinks, outgoingConversationLinks = outgoingConversationLinks)
  
    __obj.asInstanceOf[InteractionNode]
  }
}

