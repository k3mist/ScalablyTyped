package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorCurvyness extends js.Object {
  var color: java.lang.String
  var curvyness: scala.Double
  var id: java.lang.String
  var labels: js.Array[Anon_IdOffsetX]
  var points: js.Array[Anon_IdSelected]
  var selected: scala.Boolean
  var source: java.lang.String
  var sourcePort: java.lang.String
  var target: java.lang.String
  var targetPort: java.lang.String
  var `type`: java.lang.String
  var width: scala.Double
}

object Anon_ColorCurvyness {
  @scala.inline
  def apply(
    color: java.lang.String,
    curvyness: scala.Double,
    id: java.lang.String,
    labels: js.Array[Anon_IdOffsetX],
    points: js.Array[Anon_IdSelected],
    selected: scala.Boolean,
    source: java.lang.String,
    sourcePort: java.lang.String,
    target: java.lang.String,
    targetPort: java.lang.String,
    `type`: java.lang.String,
    width: scala.Double
  ): Anon_ColorCurvyness = {
    val __obj = js.Dynamic.literal(color = color, curvyness = curvyness, id = id, labels = labels, points = points, selected = selected, source = source, sourcePort = sourcePort, target = target, targetPort = targetPort, `type` = `type`, width = width)
  
    __obj.asInstanceOf[Anon_ColorCurvyness]
  }
}

