package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobFetchRepsonse extends js.Object {
  var bodyUsed: scala.Boolean
  var headers: js.Any
  var ok: scala.Boolean
  var resp: FetchBlobResponse
  var rnfbResp: FetchBlobResponse
  var rnfbRespInfo: RNFetchBlobResponseInfo
  var status: scala.Double
  var `type`: java.lang.String
  def arrayBuffer(): js.Promise[js.Array[_]]
  def blob(): js.Promise[PolyfillBlob]
  def json(): js.Promise[_]
  def rawResp(): js.Promise[FetchBlobResponse]
  def text(): js.Promise[java.lang.String]
}

object RNFetchBlobFetchRepsonse {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.Array[_]],
    blob: () => js.Promise[PolyfillBlob],
    bodyUsed: scala.Boolean,
    headers: js.Any,
    json: () => js.Promise[_],
    ok: scala.Boolean,
    rawResp: () => js.Promise[FetchBlobResponse],
    resp: FetchBlobResponse,
    rnfbResp: FetchBlobResponse,
    rnfbRespInfo: RNFetchBlobResponseInfo,
    status: scala.Double,
    text: () => js.Promise[java.lang.String],
    `type`: java.lang.String
  ): RNFetchBlobFetchRepsonse = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed, headers = headers, json = js.Any.fromFunction0(json), ok = ok, rawResp = js.Any.fromFunction0(rawResp), resp = resp, rnfbResp = rnfbResp, rnfbRespInfo = rnfbRespInfo, status = status, text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RNFetchBlobFetchRepsonse]
  }
}

