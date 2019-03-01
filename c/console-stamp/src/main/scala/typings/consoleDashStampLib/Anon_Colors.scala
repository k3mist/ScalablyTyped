package typings
package consoleDashStampLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  /**
    * An object representing a color theme. More info https://www.npmjs.com/package/colors
    */
  var colors: js.UndefOr[Anon_Label] = js.undefined
  /**
    * An array containing the methods to exclude in the patch)
    */
  var exclude: js.UndefOr[js.Any] = js.undefined
  /**
    * An array containing the methods to include in the patch
    */
  var include: js.UndefOr[js.Any] = js.undefined
  /**
    * If true it will show the label (LOG | INFO | WARN | ERROR)
    */
  var label: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A custom prefix for the label.
    */
  var labelPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A custom suffix for the label.
    */
  var labelSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Types can be String, Object (interpreted with util.inspect), or Function. See the test-metadata.js for examples.
    * Note that metadata can still be sent as the third parameter (as in vesion 1.6) as a backward compatibillity feature, but this is deprecated.
    */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
    * A string with date format based on Javascript Date Format
    */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: Anon_Label = null,
    exclude: js.Any = null,
    include: js.Any = null,
    label: js.UndefOr[scala.Boolean] = js.undefined,
    labelPrefix: java.lang.String = null,
    labelSuffix: java.lang.String = null,
    metadata: js.Any = null,
    pattern: java.lang.String = null
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label)
    if (labelPrefix != null) __obj.updateDynamic("labelPrefix")(labelPrefix)
    if (labelSuffix != null) __obj.updateDynamic("labelSuffix")(labelSuffix)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[Anon_Colors]
  }
}

