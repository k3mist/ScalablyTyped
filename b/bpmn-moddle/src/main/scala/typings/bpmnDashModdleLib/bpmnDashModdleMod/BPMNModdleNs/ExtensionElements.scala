package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionElements
  extends TypeDerived
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var extensionAttributeDefinition: ExtensionAttributeDefinition
  var valueRef: BaseElement
  var values: js.Array[BaseElement]
}

object ExtensionElements {
  @scala.inline
  def apply(
    $type: ElementType,
    extensionAttributeDefinition: ExtensionAttributeDefinition,
    valueRef: BaseElement,
    values: js.Array[BaseElement],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ExtensionElements = {
    val __obj = js.Dynamic.literal($type = $type, extensionAttributeDefinition = extensionAttributeDefinition, valueRef = valueRef, values = values)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ExtensionElements]
  }
}

