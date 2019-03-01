package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdHocSubProcess extends SubProcess {
  var cancelRemainingInstances: scala.Boolean
  var completionCondition: Expression
  var ordering: AdHocOrdering
}

object AdHocSubProcess {
  @scala.inline
  def apply(
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    cancelRemainingInstances: scala.Boolean,
    categoryValueRef: js.Array[CategoryValue],
    completionCondition: Expression,
    completionQuantity: scala.Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    flowElements: js.Array[FlowElement],
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    ioSpecification: InputOutputSpecification,
    isForCompensation: scala.Boolean,
    laneSets: js.Array[LaneSet],
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    monitoring: Monitoring,
    ordering: AdHocOrdering,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: scala.Double,
    triggeredByEvent: scala.Boolean,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): AdHocSubProcess = {
    val __obj = js.Dynamic.literal($type = $type, artifacts = artifacts, auditing = auditing, boundaryEventRefs = boundaryEventRefs, cancelRemainingInstances = cancelRemainingInstances, categoryValueRef = categoryValueRef, completionCondition = completionCondition, completionQuantity = completionQuantity, dataInputAssociations = dataInputAssociations, dataOutputAssociations = dataOutputAssociations, default = default, flowElements = flowElements, id = id, incoming = incoming, incomingConversationLinks = incomingConversationLinks, ioSpecification = ioSpecification, isForCompensation = isForCompensation, laneSets = laneSets, lanes = lanes, loopCharacteristics = loopCharacteristics, monitoring = monitoring, ordering = ordering, outgoing = outgoing, outgoingConversationLinks = outgoingConversationLinks, properties = properties, resources = resources, startQuantity = startQuantity, triggeredByEvent = triggeredByEvent)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AdHocSubProcess]
  }
}

