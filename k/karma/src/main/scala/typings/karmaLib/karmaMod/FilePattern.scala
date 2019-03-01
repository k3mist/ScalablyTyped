package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePattern extends js.Object {
  /**
    * @default true
    * @description Should the files be included in the browser using <script> tag? Use false if you want to
    * load them manually, eg. using Require.js.
    */
  var included: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    * @description Should the files be served from disk on each request by Karma's webserver?
    */
  var nocache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The pattern to use for matching. This property is mandatory.
    */
  var pattern: java.lang.String
  /**
    * @default true
    * @description Should the files be served by Karma's webserver?
    */
  var served: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    * @description If <code>autoWatch</code> is true all files that have set watched to true will be watched
    * for changes.
    */
  var watched: js.UndefOr[scala.Boolean] = js.undefined
}

object FilePattern {
  @scala.inline
  def apply(
    pattern: java.lang.String,
    included: js.UndefOr[scala.Boolean] = js.undefined,
    nocache: js.UndefOr[scala.Boolean] = js.undefined,
    served: js.UndefOr[scala.Boolean] = js.undefined,
    watched: js.UndefOr[scala.Boolean] = js.undefined
  ): FilePattern = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    if (!js.isUndefined(nocache)) __obj.updateDynamic("nocache")(nocache)
    if (!js.isUndefined(served)) __obj.updateDynamic("served")(served)
    if (!js.isUndefined(watched)) __obj.updateDynamic("watched")(watched)
    __obj.asInstanceOf[FilePattern]
  }
}

