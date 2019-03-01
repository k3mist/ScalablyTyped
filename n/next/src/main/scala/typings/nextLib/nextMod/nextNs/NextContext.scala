package typings
package nextLib.nextMod.nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// End Deprecated
/**
  * Context object used in methods like `getInitialProps()`
  * https://github.com/zeit/next.js/blob/7.0.0/server/render.js#L97
  * https://github.com/zeit/next.js/blob/7.0.0/README.md#fetching-data-and-component-lifecycle
  *
  * @template Q Query object schema.
  */
trait NextContext[Q /* <: nextDashServerLib.routerMod.DefaultQuery */] extends js.Object {
  /** String of the actual path (including the query) shows in the browser */
  var asPath: java.lang.String
  /** Error object if any error is encountered during the rendering */
  var err: js.UndefOr[nodeLib.Error] = js.undefined
  /** Fetch Response object (client only) - from https://developer.mozilla.org/en-US/docs/Web/API/Response */
  var jsonPageRes: js.UndefOr[nodeDashFetchLib.nodeDashFetchMod.Response] = js.undefined
  /** path section of URL */
  var pathname: java.lang.String
  /** query string section of URL parsed as an object */
  var query: Q
  /** HTTP request object (server only) */
  var req: js.UndefOr[nodeLib.httpMod.IncomingMessage] = js.undefined
  /** HTTP response object (server only) */
  var res: js.UndefOr[nodeLib.httpMod.ServerResponse] = js.undefined
}

object NextContext {
  @scala.inline
  def apply[Q /* <: nextDashServerLib.routerMod.DefaultQuery */](
    asPath: java.lang.String,
    pathname: java.lang.String,
    query: Q,
    err: nodeLib.Error = null,
    jsonPageRes: nodeDashFetchLib.nodeDashFetchMod.Response = null,
    req: nodeLib.httpMod.IncomingMessage = null,
    res: nodeLib.httpMod.ServerResponse = null
  ): NextContext[Q] = {
    val __obj = js.Dynamic.literal(asPath = asPath, pathname = pathname, query = query.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err)
    if (jsonPageRes != null) __obj.updateDynamic("jsonPageRes")(jsonPageRes)
    if (req != null) __obj.updateDynamic("req")(req)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[NextContext[Q]]
  }
}

