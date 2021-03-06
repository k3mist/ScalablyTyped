package typings
package opentracingLib.libReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var _referencedContext: opentracingLib.libSpanUnderscoreContextMod.default
  var _type: java.lang.String
  /**
    * @return {SpanContext} The SpanContext being referred to (e.g., the
    *         parent in a REFERENCE_CHILD_OF Reference).
    */
  def referencedContext(): opentracingLib.libSpanUnderscoreContextMod.default
  /**
    * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
    *         REFERENCE_FOLLOWS_FROM).
    */
  def `type`(): java.lang.String
}

object Reference {
  @scala.inline
  def apply(
    _referencedContext: opentracingLib.libSpanUnderscoreContextMod.default,
    _type: java.lang.String,
    referencedContext: () => opentracingLib.libSpanUnderscoreContextMod.default,
    `type`: () => java.lang.String
  ): Reference = {
    val __obj = js.Dynamic.literal(_referencedContext = _referencedContext, _type = _type, referencedContext = js.Any.fromFunction0(referencedContext))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Reference]
  }
}

