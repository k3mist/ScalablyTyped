package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameCssModuleFluid extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_ClassNameCssModuleFluid {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_ClassNameCssModuleFluid = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameCssModuleFluid]
  }
}

