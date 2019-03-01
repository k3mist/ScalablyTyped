package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementBuilder[Placement] extends DisplayBuilder[PlacementBuilder[Placement]] {
  def withUrl(url: java.lang.String): PlacementBuilder[Placement]
}

object PlacementBuilder {
  @scala.inline
  def apply[Placement](
    build: js.Function0[AdWordsOperation[PlacementBuilder[Placement]]],
    exclude: js.Function0[AdWordsOperation[PlacementBuilder[Placement]]],
    withCpc: js.Function1[scala.Double, PlacementBuilder[Placement]],
    withCpm: js.Function1[scala.Double, PlacementBuilder[Placement]],
    withUrl: js.Function1[java.lang.String, PlacementBuilder[Placement]]
  ): PlacementBuilder[Placement] = {
    val __obj = js.Dynamic.literal(build = build, exclude = exclude, withCpc = withCpc, withCpm = withCpm, withUrl = withUrl)
  
    __obj.asInstanceOf[PlacementBuilder[Placement]]
  }
}

