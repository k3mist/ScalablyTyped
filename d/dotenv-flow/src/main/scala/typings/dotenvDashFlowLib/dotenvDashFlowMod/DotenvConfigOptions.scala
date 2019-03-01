package typings
package dotenvDashFlowLib.dotenvDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvConfigOptions extends js.Object {
  /**
    * You may specify a custom path if your file containing environment variables is located elsewhere.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * You may specify the encoding of your file containing environment variables.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In some cases the original "dotenv" library can be used by one of the dependent npm modules. Use to fix this.
    */
  var purge_dotenv: js.UndefOr[scala.Boolean] = js.undefined
}

object DotenvConfigOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    encoding: java.lang.String = null,
    purge_dotenv: js.UndefOr[scala.Boolean] = js.undefined
  ): DotenvConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(purge_dotenv)) __obj.updateDynamic("purge_dotenv")(purge_dotenv)
    __obj.asInstanceOf[DotenvConfigOptions]
  }
}

