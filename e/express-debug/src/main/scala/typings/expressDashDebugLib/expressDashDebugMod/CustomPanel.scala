package typings
package expressDashDebugLib.expressDashDebugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPanel extends js.Object {
  @JSName("finalize")
  var finalize_FCustomPanel: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit]] = js.undefined
  var initialize: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit]] = js.undefined
  var name: java.lang.String
  var options: js.UndefOr[js.Any] = js.undefined
  var post_render: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit]] = js.undefined
  var pre_render: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit]] = js.undefined
  var standalone: js.UndefOr[scala.Boolean] = js.undefined
  var template: java.lang.String
  def process(locals: js.Any): js.Any
}

object CustomPanel {
  @scala.inline
  def apply(
    name: java.lang.String,
    process: js.Function1[js.Any, js.Any],
    template: java.lang.String,
    finalize: js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit] = null,
    initialize: js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit] = null,
    options: js.Any = null,
    post_render: js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit] = null,
    pre_render: js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit] = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined
  ): CustomPanel = {
    val __obj = js.Dynamic.literal(name = name, process = process, template = template)
    if (finalize != null) __obj.updateDynamic("finalize")(finalize)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (options != null) __obj.updateDynamic("options")(options)
    if (post_render != null) __obj.updateDynamic("post_render")(post_render)
    if (pre_render != null) __obj.updateDynamic("pre_render")(pre_render)
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    __obj.asInstanceOf[CustomPanel]
  }
}

