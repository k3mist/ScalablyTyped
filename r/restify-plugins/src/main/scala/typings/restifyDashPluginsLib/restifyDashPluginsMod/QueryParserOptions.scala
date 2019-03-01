package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParserOptions extends js.Object {
  /**
    *  Default false. Transform `?foo.bar=baz` to a nested object: `{foo: {bar: 'baz'}}`.
    */
  var allowDots: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default 20. Only transform `?a[$index]=b` to an array if `$index` is less than `arrayLimit`.
    */
  var arrayLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default 5. The depth limit for parsing nested objects, e.g. `?a[b][c][d][e][f][g][h][i]=j`.
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default `false`. Copies parsed query parameters into `req.params`.
    */
  var mapParams: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default `false`. Only applies when if mapParams true. When true, will stomp on req.params field when existing value is found.
    */
  var overrideParams: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default 1000. Maximum number of query params parsed. Additional params are silently dropped.
    */
  var parameterLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default true. Whether to parse `?a[]=b&a[1]=c` to an array, e.g. `{a: ['b', 'c']}`.
    */
  var parseArrays: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default false. Whether `req.query` is a "plain" object -- does not inherit from `Object`.
    * This can be used to allow query params whose names collide with Object methods, e.g. `?hasOwnProperty=blah`.
    */
  var plainObjects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default false. If true, `?a&b=` results in `{a: null, b: ''}`. Otherwise, `{a: '', b: ''}`.
    */
  var strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
}

object QueryParserOptions {
  @scala.inline
  def apply(
    allowDots: js.UndefOr[scala.Boolean] = js.undefined,
    arrayLimit: scala.Int | scala.Double = null,
    depth: scala.Int | scala.Double = null,
    mapParams: js.UndefOr[scala.Boolean] = js.undefined,
    overrideParams: js.UndefOr[scala.Boolean] = js.undefined,
    parameterLimit: scala.Int | scala.Double = null,
    parseArrays: js.UndefOr[scala.Boolean] = js.undefined,
    plainObjects: js.UndefOr[scala.Boolean] = js.undefined,
    strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
  ): QueryParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots)
    if (arrayLimit != null) __obj.updateDynamic("arrayLimit")(arrayLimit.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams)
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams)
    if (parameterLimit != null) __obj.updateDynamic("parameterLimit")(parameterLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(parseArrays)) __obj.updateDynamic("parseArrays")(parseArrays)
    if (!js.isUndefined(plainObjects)) __obj.updateDynamic("plainObjects")(plainObjects)
    if (!js.isUndefined(strictNullHandling)) __obj.updateDynamic("strictNullHandling")(strictNullHandling)
    __obj.asInstanceOf[QueryParserOptions]
  }
}

