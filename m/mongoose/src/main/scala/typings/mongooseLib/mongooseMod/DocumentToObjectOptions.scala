package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentToObjectOptions extends js.Object {
  /** depopulate any populated paths, replacing them with their original refs (defaults to false) */
  var depopulate: js.UndefOr[scala.Boolean] = js.undefined
  /** apply all getters (path and virtual getters) */
  var getters: js.UndefOr[scala.Boolean] = js.undefined
  /** remove empty objects (defaults to true) */
  var minimize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A transform function to apply to the resulting document before returning
    * @param doc The mongoose document which is being converted
    * @param ret The plain object representation which has been converted
    * @param options The options in use (either schema options or the options passed inline)
    */
  var transform: js.UndefOr[js.Function3[/* doc */ js.Any, /* ret */ js.Any, /* options */ js.Any, _]] = js.undefined
  /** whether to include the version key (defaults to true) */
  var versionKey: js.UndefOr[scala.Boolean] = js.undefined
  /** apply virtual getters (can override getters option) */
  var virtuals: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentToObjectOptions {
  @scala.inline
  def apply(
    depopulate: js.UndefOr[scala.Boolean] = js.undefined,
    getters: js.UndefOr[scala.Boolean] = js.undefined,
    minimize: js.UndefOr[scala.Boolean] = js.undefined,
    transform: js.Function3[/* doc */ js.Any, /* ret */ js.Any, /* options */ js.Any, _] = null,
    versionKey: js.UndefOr[scala.Boolean] = js.undefined,
    virtuals: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentToObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(depopulate)) __obj.updateDynamic("depopulate")(depopulate)
    if (!js.isUndefined(getters)) __obj.updateDynamic("getters")(getters)
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(versionKey)) __obj.updateDynamic("versionKey")(versionKey)
    if (!js.isUndefined(virtuals)) __obj.updateDynamic("virtuals")(virtuals)
    __obj.asInstanceOf[DocumentToObjectOptions]
  }
}

