package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticipantMultiplicity extends BaseElement {
  var maximum: scala.Double
  var minimum: scala.Double
}

object ParticipantMultiplicity {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    maximum: scala.Double,
    minimum: scala.Double,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ParticipantMultiplicity = {
    val __obj = js.Dynamic.literal($type = $type, id = id, maximum = maximum, minimum = minimum)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ParticipantMultiplicity]
  }
}

