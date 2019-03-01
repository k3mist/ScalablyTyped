package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BPMNDiagram extends TypeDerived {
  var labelStyle: BPMNLabelStyle
  var plane: BPMNPlane
}

object BPMNDiagram {
  @scala.inline
  def apply($type: ElementType, labelStyle: BPMNLabelStyle, plane: BPMNPlane): BPMNDiagram = {
    val __obj = js.Dynamic.literal($type = $type, labelStyle = labelStyle, plane = plane)
  
    __obj.asInstanceOf[BPMNDiagram]
  }
}

