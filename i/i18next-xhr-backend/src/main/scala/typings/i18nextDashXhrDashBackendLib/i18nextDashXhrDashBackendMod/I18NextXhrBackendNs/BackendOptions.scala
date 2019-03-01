package typings
package i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendMod.I18NextXhrBackendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendOptions extends js.Object {
  /**
    * path to post missing resources
    */
  var addPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * define a custom xhr function
    * can be used to support XDomainRequest in IE 8 and 9
    */
  var ajax: js.UndefOr[
    js.Function5[
      /* url */ java.lang.String, 
      /* options */ this.type, 
      /* callback */ AjaxRequestCallback, 
      /* data */ js.Object | java.lang.String, 
      /* cache */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * your backend server supports multiLoading
    * locales/resources.json?lng=de+en&ns=ns1+ns2
    * set loadPath: '/locales/resources.json?lng={{lng}}&ns={{ns}}' to adapt to multiLoading
    */
  var allowMultiLoading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * allow cross domain requests
    */
  var crossDomain: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @see https://github.com/i18next/i18next-xhr-backend/blob/281c7e235e1157b33122adacef1957252e5700f1/src/ajax.js#L52
    */
  var customHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * path where resources get loaded from, or a function
    * returning a path:
    * function(lngs, namespaces) { return customPath; }
    * the returned path will interpolate lng, ns if provided like giving a static path
    */
  var loadPath: js.UndefOr[LoadPathOption] = js.undefined
  /**
    * parse data after it has been fetched
    * in example use https://www.npmjs.com/package/json5
    * here it removes the letter a from the json (bad idea)
    */
  var parse: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * adds parameters to resource URL. 'example.com' -> 'example.com?v=1.3.5'
    */
  var queryStringParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * allow credentials on cross domain requests
    */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object BackendOptions {
  @scala.inline
  def apply(
    addPath: java.lang.String = null,
    ajax: js.Function5[
      /* url */ java.lang.String, 
      BackendOptions, 
      /* callback */ AjaxRequestCallback, 
      /* data */ js.Object | java.lang.String, 
      /* cache */ scala.Boolean, 
      scala.Unit
    ] = null,
    allowMultiLoading: js.UndefOr[scala.Boolean] = js.undefined,
    crossDomain: js.UndefOr[scala.Boolean] = js.undefined,
    customHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    loadPath: LoadPathOption = null,
    parse: js.Function1[/* data */ java.lang.String, java.lang.String] = null,
    queryStringParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): BackendOptions = {
    val __obj = js.Dynamic.literal()
    if (addPath != null) __obj.updateDynamic("addPath")(addPath)
    if (ajax != null) __obj.updateDynamic("ajax")(ajax)
    if (!js.isUndefined(allowMultiLoading)) __obj.updateDynamic("allowMultiLoading")(allowMultiLoading)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (loadPath != null) __obj.updateDynamic("loadPath")(loadPath.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (queryStringParams != null) __obj.updateDynamic("queryStringParams")(queryStringParams)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[BackendOptions]
  }
}

