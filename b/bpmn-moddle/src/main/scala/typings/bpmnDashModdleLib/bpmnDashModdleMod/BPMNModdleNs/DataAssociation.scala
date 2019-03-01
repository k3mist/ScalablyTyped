package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAssociation extends BaseElement {
  var assignment: Assignment
  var sourceRef: ItemAwareElement
  var targetRef: ItemAwareElement
  var transformation: FormalExpression
}

object DataAssociation {
  @scala.inline
  def apply(
    $type: ElementType,
    assignment: Assignment,
    id: java.lang.String,
    sourceRef: ItemAwareElement,
    targetRef: ItemAwareElement,
    transformation: FormalExpression,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): DataAssociation = {
    val __obj = js.Dynamic.literal($type = $type, assignment = assignment, id = id, sourceRef = sourceRef, targetRef = targetRef, transformation = transformation)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[DataAssociation]
  }
}

