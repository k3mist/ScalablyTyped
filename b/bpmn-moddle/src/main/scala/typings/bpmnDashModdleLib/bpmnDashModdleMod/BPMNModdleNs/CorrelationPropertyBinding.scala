package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationPropertyBinding extends BaseElement {
  var correlationPropertyRef: CorrelationProperty
  var dataPath: FormalExpression
}

object CorrelationPropertyBinding {
  @scala.inline
  def apply(
    $type: ElementType,
    correlationPropertyRef: CorrelationProperty,
    dataPath: FormalExpression,
    id: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CorrelationPropertyBinding = {
    val __obj = js.Dynamic.literal($type = $type, correlationPropertyRef = correlationPropertyRef, dataPath = dataPath, id = id)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CorrelationPropertyBinding]
  }
}

