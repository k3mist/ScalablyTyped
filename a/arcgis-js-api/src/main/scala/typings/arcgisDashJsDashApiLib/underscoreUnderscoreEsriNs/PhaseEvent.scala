package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhaseEvent
  extends stdLib.Object {
  /**
    * The elapsed time since the last animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var deltaTime: scala.Double
  /**
    * The amount of time spent within the current animation frame. This can be used for budgeting (e.g. some tasks may already have run).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var elapsedFrameTime: scala.Double
  /**
    * The absolute time at the start of the current animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var time: scala.Double
}

