package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[k6Lib.httpMod.RequestParams] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply(params: k6Lib.httpMod.RequestParams = null, selector: java.lang.String = null): Anon_Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_Params]
  }
}

