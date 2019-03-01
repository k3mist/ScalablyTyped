package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends IWsdlBaseOptions
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var customDeserializer: js.UndefOr[js.Any] = js.undefined
  var disableCache: js.UndefOr[scala.Boolean] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var envelopeKey: js.UndefOr[java.lang.String] = js.undefined
  // wsdl options that only work for client
  var forceSoap12Headers: js.UndefOr[scala.Boolean] = js.undefined
  var httpClient: js.UndefOr[HttpClient] = js.undefined
  var request: js.UndefOr[
    js.Function2[
      /* options */ js.Any, 
      /* callback */ js.UndefOr[
        js.Function3[/* error */ js.Any, /* res */ js.Any, /* body */ js.Any, scala.Unit]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    attributesKey: java.lang.String = null,
    customDeserializer: js.Any = null,
    disableCache: js.UndefOr[scala.Boolean] = js.undefined,
    endpoint: java.lang.String = null,
    envelopeKey: java.lang.String = null,
    escapeXML: js.UndefOr[scala.Boolean] = js.undefined,
    forceSoap12Headers: js.UndefOr[scala.Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[scala.Boolean] = js.undefined,
    httpClient: HttpClient = null,
    ignoreBaseNameSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    ignoredNamespaces: scala.Boolean | js.Array[java.lang.String] | soapLib.Anon_Namespaces = null,
    overrideRootElement: soapLib.Anon_Namespace = null,
    request: js.Function2[
      /* options */ js.Any, 
      /* callback */ js.UndefOr[
        js.Function3[/* error */ js.Any, /* res */ js.Any, /* body */ js.Any, scala.Unit]
      ], 
      scala.Unit
    ] = null,
    returnFault: js.UndefOr[scala.Boolean] = js.undefined,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    valueKey: java.lang.String = null,
    wsdl_headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    wsdl_options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    xmlKey: java.lang.String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (customDeserializer != null) __obj.updateDynamic("customDeserializer")(customDeserializer)
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (envelopeKey != null) __obj.updateDynamic("envelopeKey")(envelopeKey)
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML)
    if (!js.isUndefined(forceSoap12Headers)) __obj.updateDynamic("forceSoap12Headers")(forceSoap12Headers)
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull)
    if (httpClient != null) __obj.updateDynamic("httpClient")(httpClient)
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces)
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement)
    if (request != null) __obj.updateDynamic("request")(request)
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers)
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options)
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey)
    __obj.asInstanceOf[IOptions]
  }
}

