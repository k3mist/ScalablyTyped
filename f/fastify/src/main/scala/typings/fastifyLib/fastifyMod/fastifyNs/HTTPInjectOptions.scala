package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fake http inject options
  */
trait HTTPInjectOptions extends js.Object {
  var authority: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[DefaultHeaders] = js.undefined
  var method: js.UndefOr[HTTPMethod] = js.undefined
  var payload: js.UndefOr[java.lang.String | js.Object | nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream] = js.undefined
  var query: js.UndefOr[DefaultQuery] = js.undefined
  var remoteAddress: js.UndefOr[java.lang.String] = js.undefined
  var simulate: js.UndefOr[fastifyLib.Anon_Close] = js.undefined
  var url: java.lang.String
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

