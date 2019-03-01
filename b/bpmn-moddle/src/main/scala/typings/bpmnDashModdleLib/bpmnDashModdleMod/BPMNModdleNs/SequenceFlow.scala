package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceFlow extends FlowElement {
  var conditionExpression: Expression
  var isImmediate: scala.Boolean
  var sourceRef: FlowNode
  var targetRef: FlowNode
}

object SequenceFlow {
  @scala.inline
  def apply(
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    conditionExpression: Expression,
    id: java.lang.String,
    isImmediate: scala.Boolean,
    monitoring: Monitoring,
    sourceRef: FlowNode,
    targetRef: FlowNode,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): SequenceFlow = {
    val __obj = js.Dynamic.literal($type = $type, auditing = auditing, categoryValueRef = categoryValueRef, conditionExpression = conditionExpression, id = id, isImmediate = isImmediate, monitoring = monitoring, sourceRef = sourceRef, targetRef = targetRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SequenceFlow]
  }
}

