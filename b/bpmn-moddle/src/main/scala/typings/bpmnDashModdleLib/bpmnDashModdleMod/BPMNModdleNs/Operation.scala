package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends BaseElement {
  var errorRef: ErrorElement
  var implementationRef: java.lang.String
  var inMessageRef: Message
  var name: java.lang.String
  var outMessageRef: Message
}

object Operation {
  @scala.inline
  def apply(
    $type: ElementType,
    errorRef: ErrorElement,
    id: java.lang.String,
    implementationRef: java.lang.String,
    inMessageRef: Message,
    name: java.lang.String,
    outMessageRef: Message,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Operation = {
    val __obj = js.Dynamic.literal($type = $type, errorRef = errorRef, id = id, implementationRef = implementationRef, inMessageRef = inMessageRef, name = name, outMessageRef = outMessageRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Operation]
  }
}

