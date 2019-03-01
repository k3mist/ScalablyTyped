package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptionsAsHttp2 extends ServerOptions {
  var http2: fastifyLib.fastifyLibNumbers.`true`
}

object ServerOptionsAsHttp2 {
  @scala.inline
  def apply(
    http2: fastifyLib.fastifyLibNumbers.`true`,
    bodyLimit: scala.Int | scala.Double = null,
    ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    logger: js.Any = null,
    maxParamLength: scala.Int | scala.Double = null,
    onProtoPoisoning: fastifyLib.fastifyLibStrings.error | fastifyLib.fastifyLibStrings.remove | fastifyLib.fastifyLibStrings.ignore = null,
    querystringParser: js.Function1[
      /* str */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
    ] = null,
    trustProxy: java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String] | TrustProxyFunction = null,
    versioning: fastifyLib.Anon_Ctx = null
  ): ServerOptionsAsHttp2 = {
    val __obj = js.Dynamic.literal(http2 = http2)
    if (bodyLimit != null) __obj.updateDynamic("bodyLimit")(bodyLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxParamLength != null) __obj.updateDynamic("maxParamLength")(maxParamLength.asInstanceOf[js.Any])
    if (onProtoPoisoning != null) __obj.updateDynamic("onProtoPoisoning")(onProtoPoisoning.asInstanceOf[js.Any])
    if (querystringParser != null) __obj.updateDynamic("querystringParser")(querystringParser)
    if (trustProxy != null) __obj.updateDynamic("trustProxy")(trustProxy.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning)
    __obj.asInstanceOf[ServerOptionsAsHttp2]
  }
}

