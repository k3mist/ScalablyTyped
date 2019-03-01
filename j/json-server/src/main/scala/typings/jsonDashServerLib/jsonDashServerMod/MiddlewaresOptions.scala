package typings
package jsonDashServerLib.jsonDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewaresOptions extends js.Object {
  /**
    * Enable body-parser middleware
    * @default true
    */
  var bodyParser: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable logger middleware
    * @default true
    */
  var logger: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable CORS
    * @default false
    */
  var noCors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Accept only GET requests
    * @default false
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Path to static files
    * @default "public" (if folder exists)
    */
  var static: js.UndefOr[java.lang.String] = js.undefined
}

object MiddlewaresOptions {
  @scala.inline
  def apply(
    bodyParser: js.UndefOr[scala.Boolean] = js.undefined,
    logger: js.UndefOr[scala.Boolean] = js.undefined,
    noCors: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    static: java.lang.String = null
  ): MiddlewaresOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bodyParser)) __obj.updateDynamic("bodyParser")(bodyParser)
    if (!js.isUndefined(logger)) __obj.updateDynamic("logger")(logger)
    if (!js.isUndefined(noCors)) __obj.updateDynamic("noCors")(noCors)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (static != null) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[MiddlewaresOptions]
  }
}

