package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveTask extends Task {
  var implementation: java.lang.String
  var instantiate: scala.Boolean
  var messageRef: Message
  var operationRef: Operation
}

object ReceiveTask {
  @scala.inline
  def apply(
    $type: ElementType,
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    categoryValueRef: js.Array[CategoryValue],
    completionQuantity: scala.Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    id: java.lang.String,
    implementation: java.lang.String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    instantiate: scala.Boolean,
    ioSpecification: InputOutputSpecification,
    isForCompensation: scala.Boolean,
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    messageRef: Message,
    monitoring: Monitoring,
    operationRef: Operation,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: scala.Double,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): ReceiveTask = {
    val __obj = js.Dynamic.literal($type = $type, auditing = auditing, boundaryEventRefs = boundaryEventRefs, categoryValueRef = categoryValueRef, completionQuantity = completionQuantity, dataInputAssociations = dataInputAssociations, dataOutputAssociations = dataOutputAssociations, default = default, id = id, implementation = implementation, incoming = incoming, incomingConversationLinks = incomingConversationLinks, instantiate = instantiate, ioSpecification = ioSpecification, isForCompensation = isForCompensation, lanes = lanes, loopCharacteristics = loopCharacteristics, messageRef = messageRef, monitoring = monitoring, operationRef = operationRef, outgoing = outgoing, outgoingConversationLinks = outgoingConversationLinks, properties = properties, resources = resources, startQuantity = startQuantity)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReceiveTask]
  }
}

