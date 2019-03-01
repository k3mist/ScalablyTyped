package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishContainerVersionResponse extends js.Object {
  /** Compiler errors or not. */
  var compilerError: js.UndefOr[scala.Boolean] = js.undefined
  /** The container version created. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
}

object PublishContainerVersionResponse {
  @scala.inline
  def apply(compilerError: js.UndefOr[scala.Boolean] = js.undefined, containerVersion: ContainerVersion = null): PublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError)
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion)
    __obj.asInstanceOf[PublishContainerVersionResponse]
  }
}

