package typings
package mermaidLib.mermaidAPIMod.mermaidAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowChartConfig extends js.Object {
  /**
    * default: 'linear'
    */
  var curve: js.UndefOr[java.lang.String] = js.undefined
  /**
    * **htmlLabels** - Flag for setting whether or not a html tag should be used for rendering labels
    * on the edges
    * default: true
    */
  var htmlLabels: js.UndefOr[scala.Boolean] = js.undefined
}

object FlowChartConfig {
  @scala.inline
  def apply(curve: java.lang.String = null, htmlLabels: js.UndefOr[scala.Boolean] = js.undefined): FlowChartConfig = {
    val __obj = js.Dynamic.literal()
    if (curve != null) __obj.updateDynamic("curve")(curve)
    if (!js.isUndefined(htmlLabels)) __obj.updateDynamic("htmlLabels")(htmlLabels)
    __obj.asInstanceOf[FlowChartConfig]
  }
}

