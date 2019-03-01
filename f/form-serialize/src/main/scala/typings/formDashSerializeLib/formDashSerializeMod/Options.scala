package typings
package formDashSerializeLib.formDashSerializeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[Result] extends js.Object {
  /** If true serialize disabled fields. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** If true serialize empty fields */
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  /** Configure the output type. If true, the output will be a js object. */
  var hash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional serializer function to override the default one. The function takes 3 arguments (result, key,
    * value) and should return new result hash and url encoded str serializers are provided with this module
    */
  var serializer: js.UndefOr[
    js.Function3[/* result */ Result, /* key */ java.lang.String, /* value */ java.lang.String, Result]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply[Result](
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    hash: js.UndefOr[scala.Boolean] = js.undefined,
    serializer: js.Function3[/* result */ Result, /* key */ java.lang.String, /* value */ java.lang.String, Result] = null
  ): Options[Result] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash)
    if (serializer != null) __obj.updateDynamic("serializer")(serializer)
    __obj.asInstanceOf[Options[Result]]
  }
}

