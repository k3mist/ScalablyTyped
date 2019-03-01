package typings
package mriLib.mriMod.mriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Additional aliases for specific flags */
  var alias: js.UndefOr[DictionaryObject[ArrayOrString]] = js.undefined
  /** A flag or array of flags whose values are boolean */
  var boolean: js.UndefOr[ArrayOrString] = js.undefined
  /** Default values for flags */
  var default: js.UndefOr[DictionaryObject[_]] = js.undefined
  var string: js.UndefOr[ArrayOrString] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* flag */ java.lang.String, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: DictionaryObject[ArrayOrString] = null,
    boolean: ArrayOrString = null,
    default: DictionaryObject[_] = null,
    string: ArrayOrString = null,
    unknown: js.Function1[/* flag */ java.lang.String, scala.Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Options]
  }
}

