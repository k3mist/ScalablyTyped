package typings
package plottableLib.buildSrcCoreRenderPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderPolicy extends js.Object {
  def render(): js.Any
}

object IRenderPolicy {
  @scala.inline
  def apply(render: js.Function0[js.Any]): IRenderPolicy = {
    val __obj = js.Dynamic.literal(render = render)
  
    __obj.asInstanceOf[IRenderPolicy]
  }
}

