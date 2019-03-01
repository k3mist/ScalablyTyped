package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.InteractionNode because var conflicts: $type. Inlined incomingConversationLinks, outgoingConversationLinks */ trait Event extends FlowNode {
  var incomingConversationLinks: js.Array[ConversationLink]
  var outgoingConversationLinks: js.Array[ConversationLink]
  var properties: js.Array[Property]
}

object Event {
  @scala.inline
  def apply(
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): Event = {
    val __obj = js.Dynamic.literal($type = $type, auditing = auditing, categoryValueRef = categoryValueRef, id = id, incoming = incoming, incomingConversationLinks = incomingConversationLinks, lanes = lanes, monitoring = monitoring, outgoing = outgoing, outgoingConversationLinks = outgoingConversationLinks, properties = properties)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Event]
  }
}

