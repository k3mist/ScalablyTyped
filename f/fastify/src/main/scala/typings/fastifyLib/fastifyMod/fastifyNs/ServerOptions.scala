package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var bodyLimit: js.UndefOr[scala.Double] = js.undefined
  var ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var maxParamLength: js.UndefOr[scala.Double] = js.undefined
  var onProtoPoisoning: js.UndefOr[
    fastifyLib.fastifyLibStrings.error | fastifyLib.fastifyLibStrings.remove | fastifyLib.fastifyLibStrings.ignore
  ] = js.undefined
  var querystringParser: js.UndefOr[
    js.Function1[
      /* str */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
    ]
  ] = js.undefined
  var trustProxy: js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String] | TrustProxyFunction
  ] = js.undefined
  var versioning: js.UndefOr[fastifyLib.Anon_Ctx] = js.undefined
}

