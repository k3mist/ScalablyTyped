package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickAnnotationEvent extends js.Object {
  var annotation: Annotations
  var event: stdLib.MouseEvent
  var fullAnnotation: Annotations
  var index: scala.Double
}

object ClickAnnotationEvent {
  @scala.inline
  def apply(
    annotation: Annotations,
    event: stdLib.MouseEvent,
    fullAnnotation: Annotations,
    index: scala.Double
  ): ClickAnnotationEvent = {
    val __obj = js.Dynamic.literal(annotation = annotation, event = event, fullAnnotation = fullAnnotation, index = index)
  
    __obj.asInstanceOf[ClickAnnotationEvent]
  }
}

