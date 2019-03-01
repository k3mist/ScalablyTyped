package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var annotations: stdLib.Partial[Annotations] | js.Array[stdLib.Partial[Annotations]]
  var aspectmode: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.cube | plotlyDotJsLib.plotlyDotJsLibStrings.data | plotlyDotJsLib.plotlyDotJsLibStrings.manual
  var aspectratio: stdLib.Partial[Point]
  var bgcolor: java.lang.String
  var camera: stdLib.Partial[Camera]
  var captureevents: scala.Boolean
  var domain: stdLib.Partial[Domain]
  var dragmode: plotlyDotJsLib.plotlyDotJsLibStrings.orbit | plotlyDotJsLib.plotlyDotJsLibStrings.turntable | plotlyDotJsLib.plotlyDotJsLibStrings.zoom | plotlyDotJsLib.plotlyDotJsLibStrings.pan | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
  var hovermode: plotlyDotJsLib.plotlyDotJsLibStrings.closest | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
  var xaxis: stdLib.Partial[SceneAxis]
  var yaxis: stdLib.Partial[SceneAxis]
  var zaxis: stdLib.Partial[SceneAxis]
}

object Scene {
  @scala.inline
  def apply(
    annotations: stdLib.Partial[Annotations] | js.Array[stdLib.Partial[Annotations]],
    aspectmode: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.cube | plotlyDotJsLib.plotlyDotJsLibStrings.data | plotlyDotJsLib.plotlyDotJsLibStrings.manual,
    aspectratio: stdLib.Partial[Point],
    bgcolor: java.lang.String,
    camera: stdLib.Partial[Camera],
    captureevents: scala.Boolean,
    domain: stdLib.Partial[Domain],
    dragmode: plotlyDotJsLib.plotlyDotJsLibStrings.orbit | plotlyDotJsLib.plotlyDotJsLibStrings.turntable | plotlyDotJsLib.plotlyDotJsLibStrings.zoom | plotlyDotJsLib.plotlyDotJsLibStrings.pan | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`,
    hovermode: plotlyDotJsLib.plotlyDotJsLibStrings.closest | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`,
    xaxis: stdLib.Partial[SceneAxis],
    yaxis: stdLib.Partial[SceneAxis],
    zaxis: stdLib.Partial[SceneAxis]
  ): Scene = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio, bgcolor = bgcolor, camera = camera, captureevents = captureevents, domain = domain, dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis, yaxis = yaxis, zaxis = zaxis)
  
    __obj.asInstanceOf[Scene]
  }
}

