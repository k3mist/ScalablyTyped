package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookiesHeaders extends js.Object {
  var cookies: atPulumiPulumiLib.resourceMod.Input[Anon_ForwardWhitelistedNames]
  var headers: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var queryString: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  var queryStringCacheKeys: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_CookiesHeaders {
  @scala.inline
  def apply(
    cookies: atPulumiPulumiLib.resourceMod.Input[Anon_ForwardWhitelistedNames],
    queryString: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    headers: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    queryStringCacheKeys: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_CookiesHeaders = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (queryStringCacheKeys != null) __obj.updateDynamic("queryStringCacheKeys")(queryStringCacheKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CookiesHeaders]
  }
}

